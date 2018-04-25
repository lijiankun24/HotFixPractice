package com.lijiankun24.hotfixpractice;

import android.content.Context;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Utils.java
 * <p>
 * Created by lijiankun on 18/4/16.
 */

class Utils {
    private static final int BUF_SIZE = 2048;

    static boolean prepareDex(Context context, File dexInternalStoragePath, String dex_file) {
        BufferedInputStream bis = null;
        OutputStream dexWriter = null;
        try {
            bis = new BufferedInputStream(context.getAssets().open(dex_file));
            dexWriter = new BufferedOutputStream(new FileOutputStream(dexInternalStoragePath));
            byte[] buf = new byte[BUF_SIZE];
            int len;
            while ((len = bis.read(buf, 0, BUF_SIZE)) > 0) {
                dexWriter.write(buf, 0, len);
            }
            dexWriter.close();
            bis.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bis != null) {
                    bis.close();
                }
                if (dexWriter != null) {
                    dexWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return true;

    }
}