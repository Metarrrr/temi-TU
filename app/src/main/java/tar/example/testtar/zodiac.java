package tar.example.testtar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class zodiac extends AppCompatActivity {

    Button back;
    ImageView imageView13;
    ImageView imageView14;
    ImageView imageView16;
    ImageView imageView18;
    ImageView imageView20;
    ImageView imageView21;
    ImageView imageView24;
    ImageView imageView25;
    ImageView imageView28;
    ImageView imageView29;
    ImageView imageView32;
    ImageView imageView33;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zodiac);

        back = findViewById(R.id.button98);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent98 = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent98);

            }
        });

        imageView13 = (ImageView) findViewById(R.id.imageView13);
        imageView13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent go13 = new Intent(getApplicationContext(),Aries.class);
                startActivity(go13);

            }
        });

        imageView14 = (ImageView) findViewById(R.id.imageView14);
        imageView14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent go14 = new Intent(getApplicationContext(),Taurus.class);
                startActivity(go14);

            }
        });

        imageView16 = (ImageView) findViewById(R.id.imageView16);
        imageView16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent go16 = new Intent(getApplicationContext(),Gemini.class);
                startActivity(go16);

            }
        });

        imageView18 = (ImageView) findViewById(R.id.imageView18);
        imageView18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent go18 = new Intent(getApplicationContext(),Cancer.class);
                startActivity(go18);

            }
        });

        imageView20 = (ImageView) findViewById(R.id.imageView20);
        imageView20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent go20 = new Intent(getApplicationContext(),Leo.class);
                startActivity(go20);

            }
        });

        imageView21 = (ImageView) findViewById(R.id.imageView21);
        imageView21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent go21 = new Intent(getApplicationContext(),Virgo.class);
                startActivity(go21);

            }
        });

        imageView24 = (ImageView) findViewById(R.id.imageView24);
        imageView24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent go24 = new Intent(getApplicationContext(),Libra.class);
                startActivity(go24);

            }
        });

        imageView25 = (ImageView) findViewById(R.id.imageView25);
        imageView25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent go25 = new Intent(getApplicationContext(),Scorpio.class);
                startActivity(go25);

            }
        });

        imageView28 = (ImageView) findViewById(R.id.imageView28);
        imageView28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent go28 = new Intent(getApplicationContext(),Sagittarius.class);
                startActivity(go28);

            }
        });

        imageView29 = (ImageView) findViewById(R.id.imageView29);
        imageView29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent go29 = new Intent(getApplicationContext(),Capricorn.class);
                startActivity(go29);

            }
        });

        imageView32 = (ImageView) findViewById(R.id.imageView32);
        imageView32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent go32 = new Intent(getApplicationContext(),Aquarius.class);
                startActivity(go32);

            }
        });

        imageView33 = (ImageView) findViewById(R.id.imageView33);
        imageView33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent go33 = new Intent(getApplicationContext(),Pisces.class);
                startActivity(go33);

            }
        });

    }
}