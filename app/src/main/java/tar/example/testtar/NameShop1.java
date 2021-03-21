package tar.example.testtar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NameShop1 extends AppCompatActivity {

    Button btu07;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name_shop1);

        btu07 = findViewById(R.id.button07);
        btu07.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent07 = new Intent(getApplicationContext(),ShopR1.class);
                startActivity(intent07);
            }
        });

    }
}