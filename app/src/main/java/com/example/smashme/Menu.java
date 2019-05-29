package com.example.smashme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Menu extends AppCompatActivity {

    private ImageButton mario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        wireWidgets();

        mario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageViewActivity();
            }
        });
    }

    private void imageViewActivity() {
        Intent intentLoadNewActivty = new Intent(Menu.this, Mario.class);
        startActivity(intentLoadNewActivty);
    }

    private void wireWidgets(){
        mario = findViewById(R.id.button_main_mario);
    }
}
