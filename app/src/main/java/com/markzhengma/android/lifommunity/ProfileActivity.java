package com.markzhengma.android.lifommunity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProfileActivity extends AppCompatActivity {
    Button homeBtn;
    Button postBtn;
    Button profileBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        homeBtn = findViewById(R.id.home_btn);
        postBtn = findViewById(R.id.post_btn);
        profileBtn = findViewById(R.id.profile_btn);

        setHomeBtnListener();
        setPostBtnListener();
    }

    public void setHomeBtnListener() {
        homeBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                loadMainActivity();
            }
        });
    }

    private void loadMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void setPostBtnListener() {
        postBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                loadPostActivity();
            }
        });
    }

    private void loadPostActivity(){
        Intent intent = new Intent(this, PostActivity.class);
        startActivity(intent);
    }

}