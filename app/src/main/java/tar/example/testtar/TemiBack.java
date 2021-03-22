package tar.example.testtar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TemiBack extends AppCompatActivity {

    Button btu11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temi_back);

        btu11 = findViewById(R.id.button11);
        btu11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent11 = new Intent(getApplicationContext(),GoingHomebs.class);
                startActivity(intent11);
            }
        });
    }
}