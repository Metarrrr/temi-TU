package tar.example.testtar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Cancer extends AppCompatActivity {

    Button btu94;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cancer);

        btu94 = findViewById(R.id.button94);
        btu94.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent94 = new Intent(getApplicationContext(), zodiac.class);
                startActivity(intent94);

            }
        });
    }
}