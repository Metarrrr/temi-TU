package tar.example.testtar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Capricorn extends AppCompatActivity {

    Button btu88;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capricorn);

        btu88 = findViewById(R.id.button88);
        btu88.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent88 = new Intent(getApplicationContext(), zodiac.class);
                startActivity(intent88);

            }
        });
    }
}