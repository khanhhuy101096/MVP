package com.example.khanhhuy.myapplication.login.login;

/**
 * Created by yeu_thuong on 10/18/2017.
 */

public interface LoginInteractor {
    public interface OnLoginFinishedListener {
        public void onUsernameError();

        public void onPasswordError();

        public void onSuccess();
    }

    public void login(String username, String password, OnLoginFinishedListener listener);
}
