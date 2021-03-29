package tar.example.testtar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Scorpio extends AppCompatActivity {

    Button btu90;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scorpio);

        btu90 = findViewById(R.id.button90);
        btu90.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent90 = new Intent(getApplicationContext(), zodiac.class);
                startActivity(intent90);

            }
        });
    }
}