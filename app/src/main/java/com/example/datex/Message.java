package com.example.datex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class Message extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        ArrayList<msg> message = new ArrayList<msg>();
        MessageAdapter messageAdapter = new MessageAdapter(this, message);

        message.add(new msg("Alia", R.drawable.user_pic));
        message.add(new msg("Rajvi", R.drawable.user_pic));
        message.add(new msg("Alex", R.drawable.user_pic));
        message.add(new msg("Harshal", R.drawable.user_pic));
        message.add(new msg("Meet", R.drawable.user_pic));
        message.add(new msg("Jency", R.drawable.user_pic));
        message.add(new msg("Riya", R.drawable.user_pic));
        message.add(new msg("Sonu", R.drawable.user_pic));
        message.add(new msg("Katrina", R.drawable.user_pic));

        ListView listView = findViewById(R.id.list_numbers);
        listView.setAdapter(messageAdapter);

        ImageView home_page;
        ImageView user_profile;

        user_profile = (ImageView) findViewById(R.id.user_profile);

        user_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = (new Intent(Message.this, user_profile.class));
                startActivity(intent);
                overridePendingTransition(R.transition.enter, R.transition.exit);
                finish();
            }
        });

        home_page = (ImageView) findViewById(R.id.user_dating);

        home_page.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = (new Intent(Message.this, HomePage.class));
                startActivity(intent);
                overridePendingTransition(R.transition.enter, R.transition.exit);
                finish();
            }
        });
    }
}