package tar.example.testtar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Virgo extends AppCompatActivity {

    Button btu92;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_virgo);

        btu92 = findViewById(R.id.button92);
        btu92.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent92 = new Intent(getApplicationContext(), zodiac.class);
                startActivity(intent92);

            }
        });
    }
}