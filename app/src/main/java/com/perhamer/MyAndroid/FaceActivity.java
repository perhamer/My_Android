package com.perhamer.MyAndroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

/**
 * @Author Perhamer
 * @Date 2021/4/3
 */
public class FaceActivity extends Activity {

    private final View.OnClickListener onClickLogin = v -> {
        startActivity(new Intent(FaceActivity.this, LoginActivity.class));
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_face);
        findViewById(R.id.loginBtn).setOnClickListener(onClickLogin);
        findViewById(R.id.registerBtn).setOnClickListener(v -> Toast.makeText(FaceActivity.this,"服务器开小差啦！",Toast.LENGTH_SHORT).show());
    }
}
