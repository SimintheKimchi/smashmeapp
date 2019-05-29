package com.example.smashme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Menu extends AppCompatActivity {

    private ImageButton airpodssmash;
    private ImageButton beter;
    private ImageButton bowser;
    private ImageButton brenda;
    private ImageButton
    private ImageButton
    private ImageButton
    private ImageButton
    private ImageButton
    private ImageButton
    private ImageButton
    private ImageButton
    private ImageButton
    private ImageButton
    private ImageButton
    private ImageButton
    private ImageButton

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        wireWidgets();

        airpodssmash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageViewActivity();
            }
        });

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
        airpodssmash = findViewById(R.id.button_main_airpods);
        beter = findViewById(R.id.button_main_beter);
        bowser = findViewById(R.id.button_main_bowser);
        brenda = findViewById(R.id.button_main_brenda);
        cloud = findViewById(R.id.button_main_cloud);
        corrin = findViewById(R.id.button_main_corrin);
        doonil = findViewById(R.id.button_main_doonil);
        fox = findViewById(R.id.button_main_fox);
        ike = findViewById(R.id.button_main_ike);
        jarjar = findViewById(R.id.button_main_binks);
        johnwick = findViewById(R.id.button_main_wick);
        rye = findViewById(R.id.button_main_ryu);
        kriby = findViewById(R.id.button_main_kirby);
        legoyoda = findViewById(R.id.button_main_yoda);
        link = findViewById(R.id.button_main_link);
        mario = findViewById(R.id.button_main_mario);
        marth = findViewById(R.id.button_main_marth);
        ness = findViewById(R.id.button_main_ness);
        peach = findViewById(R.id.button_main_peach);
        piranhaplant = findViewById(R.id.button_main_piranha);
        pit = findViewById(R.id.button_main_pit);
        pomdog = findViewById(R.id.button_main_pom);
        robin = findViewById(R.id.button_main_robin);
        roy = findViewById(R.id.button_main_roy);
        samus = findViewById(R.id.button_main_samus);
        shawoo = findViewById(R.id.button_main_shawoo);
        sheik = findViewById(R.id.button_main_sheik);
        shulk = findViewById(R.id.button_main_shulk);
        simon = findViewById(R.id.button_main_simon);
        snake = findViewById(R.id.button_main_snake);
        sonic = findViewById(R.id.button_main_sonic);
        squidward = findViewById(R.id.button_main_squid);
        wilfred = findViewById(R.id.button_main_wilfred);
        zelda = findViewById(R.id.button_main_zelda);
    }
}
