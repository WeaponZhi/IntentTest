package com.weaponzhi.mylibrary;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by WeaponZhi on 2017/10/18.
 */

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_main);
        findViewById(R.id.tv).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent();
                    intent.setClassName(TestActivity.this,"com.weaponzhi.intenttest.MinActivity");
                    startActivity(intent);
                }catch (Exception e){
                    e.printStackTrace();
                }

            }
        });
    }

    public static void startActivity(Context context, Class<?> cls){
        context.startActivity(new Intent(context,cls));
    }
}
