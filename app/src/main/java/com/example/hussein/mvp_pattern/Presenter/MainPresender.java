package com.example.hussein.mvp_pattern.Presenter;

import android.widget.EditText;
import android.widget.TextView;

import com.example.hussein.mvp_pattern.Model.User;

/**
 * Created by hussein on 5/23/17.
 */

public class MainPresender {

    User user;
    View view;

    public MainPresender(View view) {
        this.view=view;
        user=new User();
    }

    public void updateFullName(String fullName){
        user.setFullName(fullName);
        view.updateUserInfoTextView(user.toString());
    }
    public void updateEmail(String email){
        user.setEmail(email);
        view.updateUserInfoTextView(user.toString());
    }
    public interface View{
        void updateUserInfoTextView(String info);
    }
}
