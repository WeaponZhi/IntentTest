package com.weaponzhi.intenttest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.weaponzhi.mylibrary.TestActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.tv);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent();
//                intent.setClassName(MainActivity.this,"com.weaponzhi.mylibrary.TestActivity");
//                startActivity(intent);
                TestActivity.startActivity(MainActivity.this,TestActivity.class);
            }
        });
    }
}
