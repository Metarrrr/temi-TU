package tar.example.testtar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Leo extends AppCompatActivity {

    Button btu93;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leo);

        btu93 = findViewById(R.id.button93);
        btu93.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent93 = new Intent(getApplicationContext(), zodiac.class);
                startActivity(intent93);

            }
        });
    }
}