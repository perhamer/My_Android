package com.perhamer.MyAndroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.perhamer.MyAndroid.model.User;

/**
 * @Author Perhamer
 * @Date 2021/4/3
 */
public class SealActivity extends Activity {

    private TextView LOGIN_USER_TEXT;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seal);
        Intent intent = getIntent();
        User loginUser = (User) intent.getSerializableExtra(LoginActivity.USER);
        LOGIN_USER_TEXT = findViewById(R.id.login_user);
        LOGIN_USER_TEXT.setText(loginUser.getUserName());
    }
}
