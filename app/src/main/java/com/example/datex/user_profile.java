package com.example.datex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class user_profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);

        ImageView home_page;
        ImageView message;

        home_page = (ImageView) findViewById(R.id.user_dating);

        home_page.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = (new Intent(user_profile.this, HomePage.class));
                startActivity(intent);
                overridePendingTransition(R.transition.enter, R.transition.exit);
                finish();
            }
        });

        message = (ImageView) findViewById(R.id.user_message);

        message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = (new Intent(user_profile.this, Message.class));
                startActivity(intent);
                overridePendingTransition(R.transition.enter, R.transition.exit);
                finish();
            }
        });
    }
}