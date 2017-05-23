package com.example.hussein.mvp_pattern.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

import com.example.hussein.mvp_pattern.Presenter.MainPresender;
import com.example.hussein.mvp_pattern.R;

public class MainActivity extends AppCompatActivity  implements  MainPresender.View{
    MainPresender mainPresender;

    TextView userInfoTextView;
    EditText fullName;
    EditText email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainPresender=new MainPresender(this);
        userInfoTextView=(TextView)findViewById(R.id.userInfoTextView);
        fullName=(EditText)findViewById(R.id.fullName);
        email=(EditText)findViewById(R.id.email);

        fullName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mainPresender.updateFullName(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mainPresender.updateEmail(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    @Override
    public void updateUserInfoTextView(String info) {
        userInfoTextView.setText(info);
    }
}
