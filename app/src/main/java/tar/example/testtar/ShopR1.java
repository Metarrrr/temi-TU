package tar.example.testtar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ShopR1 extends AppCompatActivity {

    Button btu03;
    Button btu04;
    Button btu06;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_r1);

        btu03 = findViewById(R.id.button03);
        btu03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent03 = new Intent(getApplicationContext(),Home.class);
                startActivity(intent03);
            }
        });

        btu04 = findViewById(R.id.button04);
        btu04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent04 = new Intent(getApplicationContext(),ShopR2.class);
                startActivity(intent04);
            }
        });

        btu06 = findViewById(R.id.button06);
        btu06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent06 = new Intent(getApplicationContext(),NameShop1.class);
                startActivity(intent06);
            }
        });

    }
}