package com.example.smashme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.gson.Gson;

import org.w3c.dom.Text;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

import pl.droidsonroids.gif.GifImageView;

public class Showcase extends AppCompatActivity {
    private ImageView picture;
    private TextView name;
    private TextView weightclass;
    private TextView playtype;
    private TextView howtoplay;
    private GifImageView example;

    private static final String TAG = "cheese";
    private Character list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showcase);

        wireWidgets();
        initialize();

        Menu transition = new Menu();
        if(transition.getCurrentChar() == 2){
            name.setText("Beter");
            weightclass.setText("Light with a slight Belly");
            playtype.setText("Stupid");
            howtoplay.setText("Flail around until you either fail - at that point give up - or everything somehow ends up working in your favor. Go around dressed like you’re “special” and pretend to be like one o’ those famous korean singing people even though your appearance doesn’t really help out. If someone insults you about these problems, don’t acknowledge it and instead reflect it back at them with another insult or joke. If you can’t think of an insult or joke, just REEEEEEEEE at them or call them poopoo.");
        }
    }

    private void wireWidgets() {
        picture = findViewById(R.id.imageView_showcase_picture);
        name = findViewById(R.id.textview_showcase_name);
        weightclass = findViewById(R.id.textview_showcase_weightclass);
        playtype = findViewById(R.id.textview_showcase_playtype);
        howtoplay = findViewById(R.id.textview_showcase_instructions);
        example  = findViewById(R.id.gifview_showcase_combo);
    }

    public void initialize() {
        InputStream XmlFileInputStream = getResources().openRawResource(R.raw.info);
        String sxml = readTextFile(XmlFileInputStream);
        Gson gson = new Gson();
        Information[] infos =  gson.fromJson(sxml, Information[].class);
        List<Information> characterList = Arrays.asList(infos);
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
}
