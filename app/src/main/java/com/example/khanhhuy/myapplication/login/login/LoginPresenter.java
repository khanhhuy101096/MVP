package com.example.khanhhuy.myapplication.login.login;

/**
 * Created by yeu_thuong on 10/18/2017.
 */

public interface LoginPresenter {
    public void validateCredentials(String username, String password);

    public void onDestroy();
}
