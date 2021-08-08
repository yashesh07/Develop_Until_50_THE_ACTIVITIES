package com.example.datex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.daprlabs.cardstack.SwipeDeck;

import java.util.ArrayList;

public class HomePage extends AppCompatActivity {

    private SwipeDeck cardStack;
    private ArrayList<Profile> profileArrayList;
    ImageView user_profile;
    ImageView message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        user_profile = (ImageView) findViewById(R.id.user_profile);

        user_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = (new Intent(HomePage.this, user_profile.class));
                startActivity(intent);
                overridePendingTransition(R.transition.enter, R.transition.exit);
                finish();
            }
        });

        message = (ImageView) findViewById(R.id.user_message);

        message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = (new Intent(HomePage.this, Message.class));
                startActivity(intent);
                overridePendingTransition(R.transition.enter, R.transition.exit);
                finish();
            }
        });
        // on below line we are initializing our array list and swipe deck.
        profileArrayList = new ArrayList<>();
        cardStack = (SwipeDeck) findViewById(R.id.swipe_deck);

        // on below line we are adding data to our array list.
        profileArrayList.add(new Profile("Name : Anisha", "Age : 19", "Gender : female", "Bio : Computer Science Student at IIT Bombay", R.drawable.ic_anisha));
        profileArrayList.add(new Profile("Name : Jenifer", "Age : 34", "Gender : female", "Bio : Actor", R.drawable.ic_jenifer));
        profileArrayList.add(new Profile("Name : Alia", "Age : 22", "Gender : female", "Bio : Fashion designer", R.drawable.ic_alia));
        profileArrayList.add(new Profile("Name : Zuzi", "Age : 31", "Gender : female", "Bio : Public speaker", R.drawable.ic_zuzi));
        profileArrayList.add(new Profile("Name : Mahesh", "Age : 27", "Gender : male", "Bio : Android Developer at Google", R.drawable.ic_male1));
        profileArrayList.add(new Profile("Name : Jeff", "Age : 57", "Gender : male", "Bio : Tiktok star", R.drawable.ic_male2));
        profileArrayList.add(new Profile("Name : BIll", "Age : 17", "Gender : male", "Bio : Professor", R.drawable.ic_male3));
        profileArrayList.add(new Profile("Name : Elon", "Age : 26", "Gender : male", "Bio : Software Engineer", R.drawable.ic_male4));
        profileArrayList.add(new Profile("Name : Karina", "Age : 64", "Gender : female", "Bio : manager at DateX", R.drawable.ic_female1));
        profileArrayList.add(new Profile("Name : Ranveer", "Age : 24", "Gender : male", "Bio : Co founder of dating", R.drawable.ic_male5));
        profileArrayList.add(new Profile("Name : Ariana", "Age : 25", "Gender : female", "Bio : English teacher", R.drawable.ic_female2));
        profileArrayList.add(new Profile("Name : Joncy", "Age : 30", "Gender : female", "Bio : Software Engineer", R.drawable.ic_female3));
        profileArrayList.add(new Profile("Name : Roman", "Age : 29", "Gender : male", "Bio : Android Developer at Google", R.drawable.ic_male6));
        profileArrayList.add(new Profile("Name : Franklin", "Age : 20", "Gender : male", "Bio : Software Engineer", R.drawable.ic_male7));
        profileArrayList.add(new Profile("Name : Amanda", "Age : 17", "Gender : female", "Bio : Student at MIT", R.drawable.ic_female4));
        profileArrayList.add(new Profile("Name : Sofie", "Age : 15", "Gender : female", "Bio : Student at IIIT-V", R.drawable.ic_female5));
        profileArrayList.add(new Profile("Name : Trevor", "Age : 27", "Gender : male", "Bio : Professor", R.drawable.ic_male8));
        profileArrayList.add(new Profile("Name : Jimmy", "Age : 37", "Gender : male", "Bio : Android Developer at Google", R.drawable.ic_male9));
        profileArrayList.add(new Profile("Name : Jacqlin", "Age : 22", "Gender : female", "Bio : Professor", R.drawable.ic_female6));
        profileArrayList.add(new Profile("Name : Kaira", "Age : 30", "Gender : female", "Bio : Android Developer at Google", R.drawable.ic_sofia));
        profileArrayList.add(new Profile("Name : Micheal", "Age : 25", "Gender : male", "Bio : Public Speaker", R.drawable.ic_male10));
        profileArrayList.add(new Profile("Name : Tommy", "Age : 26", "Gender : male", "Bio : Professor", R.drawable.ic_male11));

        // on below line we are creating a variable for our adapter class and passing array list to it.
        final CardAdapter adapter = new CardAdapter(profileArrayList, this);

        // on below line we are setting adapter to our card stack.
        cardStack.setAdapter(adapter);

        // on below line we are setting event callback to our card stack.
        cardStack.setEventCallback(new SwipeDeck.SwipeEventCallback() {
            @Override
            public void cardSwipedLeft(int position) {
                // on card swipe left we are displaying a toast message.
                Toast.makeText(HomePage.this, "Card Swiped Left", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void cardSwipedRight(int position) {
                // on card swipped to right we are displaying a toast message.
                Toast.makeText(HomePage.this, "Card Swiped Right", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void cardsDepleted() {
                // this method is called when no card is present
                Toast.makeText(HomePage.this, "No more courses present", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void cardActionDown() {
                // this method is called when card is swipped down.
                Log.i("TAG", "CARDS MOVED DOWN");
            }

            @Override
            public void cardActionUp() {
                // this method is called when card is moved up.
                Log.i("TAG", "CARDS MOVED UP");
            }
        });
    }
}