package tar.example.testtar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class homebase extends AppCompatActivity {

    Button btu3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homebase);
         //fgfd
        btu3 = findViewById(R.id.button6);
        btu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent6 = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent6);
            }
        });
    }
}