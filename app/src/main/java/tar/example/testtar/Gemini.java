package tar.example.testtar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Gemini extends AppCompatActivity {
    Button btu95;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gemini);

        btu95 = findViewById(R.id.button95);
        btu95.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent95 = new Intent(getApplicationContext(), zodiac.class);
                startActivity(intent95);

            }
        });
    }
}