package tar.example.testtar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button room1;
    Button room2;
    Button homebase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        room1 = findViewById(R.id.button);
        room1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(getApplicationContext(), room1.class);
                startActivity(intent1);
            }
        });

        room2 = findViewById(R.id.button2);
        room2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(getApplicationContext(),room2.class);
                startActivity(intent2);
            }
        });

        homebase = findViewById(R.id.button3);
        homebase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(getApplicationContext(), homebase.class);
                startActivity(intent3);

            }
        });
    }
}