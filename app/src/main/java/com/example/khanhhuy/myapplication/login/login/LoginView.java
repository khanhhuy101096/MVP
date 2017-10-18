package com.example.khanhhuy.myapplication.login.login;

/**
 * Created by yeu_thuong on 10/18/2017.
 */

public interface LoginView {
    public void showProgress();

    public void hideProgress();

    public void setUsernameError();

    public void setPasswordError();

    public void navigateToHome();
}
