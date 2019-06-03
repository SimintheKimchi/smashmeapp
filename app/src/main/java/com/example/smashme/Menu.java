package com.example.smashme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.google.gson.Gson;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import java.io.FileReader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;



public class Menu extends AppCompatActivity {

    private ImageButton airpods;
    private ImageButton beter;
    private ImageButton bowser;
    private ImageButton brenda;
    private ImageButton cloud;
    private ImageButton corrin;
    private ImageButton doonil;
    private ImageButton fox;
    private ImageButton ike;
    private ImageButton jarjar;
    private ImageButton johnwick;
    private ImageButton ryu;
    private ImageButton kirby;
    private ImageButton legoyoda;
    private ImageButton link;
    private ImageButton mario;
    private ImageButton marth;
    private ImageButton ness;
    private ImageButton peach;
    private ImageButton piranhaplant;
    private ImageButton pit;
    private ImageButton pomdog;
    private ImageButton robin;
    private ImageButton roy;
    private ImageButton samus;
    private ImageButton shawoo;
    private ImageButton sheik;
    private ImageButton shulk;
    private ImageButton simon;
    private ImageButton snake;
    private ImageButton sonic;
    private ImageButton squidward;
    private ImageButton wilfred;
    private ImageButton zelda;

    private static final String TAG = "cheese";
    private Character list;

    public int getCurrentChar() {
        return currentChar;
    }

    public void setCurrentChar(int currentChar) {
        this.currentChar = currentChar;
    }

    private int currentChar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        wireWidgets();
        initialize();

        airpods.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageViewActivity();
                currentChar = 1;
            }
        });

        beter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageViewActivity();
                currentChar = 2;
            }
        });

        bowser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageViewActivity();
                currentChar = 3;
            }
        });

        brenda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageViewActivity();
                currentChar = 4;
            }
        });

        cloud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageViewActivity();
                currentChar = 5;
            }
        });

        corrin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageViewActivity();
                currentChar = 6;
            }
        });

        doonil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageViewActivity();
                currentChar = 7;
            }
        });

        fox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageViewActivity();
                currentChar = 8;
            }
        });

        ike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageViewActivity();
                currentChar = 9;
            }
        });

        jarjar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageViewActivity();
                currentChar = 10;
            }
        });

        johnwick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageViewActivity();
                currentChar = 11;
            }
        });

        kirby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageViewActivity();
                currentChar = 12;
            }
        });

        legoyoda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageViewActivity();
                currentChar = 13;
            }
        });

        link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageViewActivity();
                currentChar = 14;
            }
        });

        mario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivty = new Intent(Menu.this, Mario.class);
                startActivity(intentLoadNewActivty);
                currentChar = 15;
            }
        });

        marth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageViewActivity();
                currentChar = 16;
            }
        });

        ness.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageViewActivity();
                currentChar = 17;
            }
        });

        peach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageViewActivity();
                currentChar = 18;
            }
        });

        piranhaplant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageViewActivity();
                currentChar = 19;
            }
        });

        pit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageViewActivity();
                currentChar = 20;
            }
        });

        pomdog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageViewActivity();
                currentChar = 21;
            }
        });

        robin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageViewActivity();
                currentChar = 22;
            }
        });

        roy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageViewActivity();
                currentChar = 23;
            }
        });

        ryu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageViewActivity();
                currentChar = 24;
            }
        });

        samus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageViewActivity();
                currentChar = 25;
            }
        });

        shawoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageViewActivity();
                currentChar = 26;
            }
        });

        sheik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageViewActivity();
                currentChar = 27;
            }
        });

        shulk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageViewActivity();
                currentChar = 28;
            }
        });

        simon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageViewActivity();
                currentChar = 29;
            }
        });

        snake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageViewActivity();
                currentChar = 30;
            }
        });

        sonic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageViewActivity();
                currentChar = 31;
            }
        });

        squidward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageViewActivity();
                currentChar = 32;
            }
        });

        wilfred.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageViewActivity();
                currentChar = 33;
            }
        });

        zelda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageViewActivity();
                currentChar = 34;
            }
        });
    }

    public void initialize() {
        InputStream XmlFileInputStream = getResources().openRawResource(R.raw.info);
        String sxml = readTextFile(XmlFileInputStream);
        // create a gson object
        Gson gson = new Gson();
        // read your json file into an array of questions
        Information[] infos =  gson.fromJson(sxml, Information[].class);
        // convert your array to a list using the Arrays utility class
        List<Information> characterList = Arrays.asList(infos);
        // verify that it read everything properly
        Log.d(TAG, "onCreate: " + characterList.toString());
        list = new Character(characterList);
    }

    private String readTextFile(InputStream inputStream) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        byte buf[] = new byte[1024];
        int len;
        try {
            while ((len = inputStream.read(buf)) != -1) {
                outputStream.write(buf, 0, len);
            }
            outputStream.close();
            inputStream.close();
        } catch (IOException e) {

        }
        return outputStream.toString();
    }

    private void imageViewActivity(){
        Intent intentLoadNewActivty = new Intent(Menu.this, Showcase.class);
        startActivity(intentLoadNewActivty);
    }

    private void wireWidgets(){
        airpods = findViewById(R.id.button_main_airpods);
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
        ryu = findViewById(R.id.button_main_ryu);
        kirby = findViewById(R.id.button_main_kirby);
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
