package tar.example.testtar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Taurus extends AppCompatActivity {
    Button btu96;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taurus);

        btu96 = findViewById(R.id.button96);
        btu96.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent96 = new Intent(getApplicationContext(), zodiac.class);
                startActivity(intent96);

            }
        });
    }
}