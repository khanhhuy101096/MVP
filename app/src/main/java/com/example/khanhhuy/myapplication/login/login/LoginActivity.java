package com.example.khanhhuy.myapplication.login.login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;

import com.example.khanhhuy.myapplication.R;

/**
 * Created by yeu_thuong on 10/18/2017.
 */

public class LoginActivity extends Activity implements LoginView, View.OnClickListener{
    private ProgressBar mProgressBar;
    private EditText mUserName;
    private EditText mPassword;
    private LoginPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mProgressBar = findViewById(R.id.progress);
        mUserName = findViewById(R.id.edittext_username);
        mPassword = findViewById(R.id.edittext_password);
        findViewById(R.id.button).setOnClickListener(this);

        mPresenter = new LoginPresenterImpl(this);
    }

    @Override
    public void onClick(View v) {
        mPresenter.validateCredentials(mUserName.getText().toString(),mPassword.getText().toString());
        Log.e("khanhhuy","LoginActivity.class.onClick()");
    }

    @Override
    public void showProgress() {
        mProgressBar.setVisibility(View.INVISIBLE);
        Log.e("khanhhuy","LoginActivity.class.showProgress()");
    }

    @Override
    public void hideProgress() {
        mProgressBar.setVisibility(View.GONE);
        Log.e("khanhhuy","LoginActivity.class.hideProgress()");
    }

    @Override
    public void setUsernameError() {
        mUserName.setText(R.string.username_error);
        Log.e("khanhhuy","LoginActivity.class.setUserNameError()");
    }

    @Override
    public void setPasswordError() {
        mPassword.setText(R.string.password_error);
        Log.e("khanhhuy","LoginActivity.class.setPasswordError()");
    }

    @Override
    public void navigateToHome() {
        startActivity(new Intent(this,LoginActivity.class));
        Log.e("khanhhuy","LoginActivity.class.navigateToHome()");
        finish();
    }
}
