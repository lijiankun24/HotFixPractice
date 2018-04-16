package com.lijiankun24.plugin

import com.android.build.gradle.AppExtension
import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * Hotfix.java
 * <p>
 * Created by lijiankun on 18/4/14.
 */
public class Hotfix implements Plugin<Project> {
    @Override
    public void apply(Project project) {
        project.logger.error("================ Hello Gradle Plugin ==========")
        def android = project.extensions.findByType(AppExtension.class)
        android.registerTransform(new PreDex(project))

//        project.extensions.create('se', SExtension)
//        project.extensions.create('student', Student)
//
//        project.task('readExtension') << {
//            def se = project['se']
//            def student = project['student']
//
//            println "The SExtension's myName is " + se.myName
//            println "The student's name is  " + student.name
//            println "The student's phone is " + student.phone
//        }
    }
}