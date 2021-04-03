package com.perhamer.MyAndroid;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.Nullable;
import android.os.Bundle;
import com.perhamer.MyAndroid.model.User;

/**
 * @Author Perhamer
 * @Date 2021/4/3
 */
public class LoginActivity extends Activity {

    public static final String USER = "user";

    private final View.OnClickListener loginListener = v -> {
        User u = new User();
        u.setUserName(((TextView) findViewById(R.id.loginUserNameInput)).getText().toString());
        u.setPassword(((TextView) findViewById(R.id.loginPassInput)).getText().toString());
        Intent intent = new Intent(LoginActivity.this, SealActivity.class);
        intent.putExtra(USER, u);
        startActivity(intent);
    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        findViewById(R.id.loginBtn).setOnClickListener(loginListener);
    }
}
