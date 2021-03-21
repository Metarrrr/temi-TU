package tar.example.testtar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ShopR2 extends AppCompatActivity {

    Button btu05;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_r2);

        btu05 = findViewById(R.id.button05);
        btu05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent05 = new Intent(getApplicationContext(),ShopR1.class);
                startActivity(intent05);
            }
        });

    }
}