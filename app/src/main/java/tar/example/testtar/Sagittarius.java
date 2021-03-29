package tar.example.testtar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sagittarius extends AppCompatActivity {

    Button btu89;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sagittarius);

        btu89 = findViewById(R.id.button89);
        btu89.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent89 = new Intent(getApplicationContext(), zodiac.class);
                startActivity(intent89);

            }
        });
    }
}