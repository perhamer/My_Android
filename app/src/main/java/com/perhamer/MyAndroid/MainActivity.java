package com.perhamer.MyAndroid;

import android.content.Intent;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private final View.OnClickListener onClickLogin = v -> {
        startActivity(new Intent(MainActivity.this, LoginActivity.class));
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.loginBtn).setOnClickListener(onClickLogin);
        findViewById(R.id.registerBtn).setOnClickListener(v -> Toast.makeText(MainActivity.this,"服务器开小差啦！",Toast.LENGTH_SHORT).show());
    }
}
