package com.perhamer.MyAndroid;

import android.app.Activity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import androidx.annotation.Nullable;

/**
 * @Author Perhamer
 * @Date 2021/4/3
 */
public class LoginActivity extends Activity {

    private final View.OnClickListener loginListener = v -> {

    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        findViewById(R.id.loginBtn).setOnClickListener(loginListener);
    }

}
