package tar.example.testtar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Libra extends AppCompatActivity {

    Button btu91;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_libra);

        btu91 = findViewById(R.id.button91);
        btu91.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent91 = new Intent(getApplicationContext(), zodiac.class);
                startActivity(intent91);

            }
        });
    }
}