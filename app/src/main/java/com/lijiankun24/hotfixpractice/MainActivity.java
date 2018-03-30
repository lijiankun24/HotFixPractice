package com.lijiankun24.hotfixpractice;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.tv).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, LoadBugClass.getBugClass(), Toast.LENGTH_SHORT).show();
                Log.i("lijk", "The msg is " + LoadBugClass.getBugClass());
            }
        });
    }
}
