package tar.example.testtar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Aries extends AppCompatActivity {
    Button btu97;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aries);

        btu97 = findViewById(R.id.button97);
        btu97.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent97 = new Intent(getApplicationContext(), zodiac.class);
                startActivity(intent97);

            }
        });
    }
}