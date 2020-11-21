package com.example.komektes;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainPage extends AppCompatActivity {
    private Button btnhelps;
    private Button btnLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
        btnhelps=(Button) findViewById(R.id.btnhelps);
        btnhelps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openhelp_page();
            }

        });
        btnLogout = (Button)findViewById(R.id.btnLogout);
        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openregister_form();
            }
        });

    }
    public void openhelp_page(){
        Intent intent = new Intent(this,help_page.class);
        startActivity(intent);
    }

    public void openregister_form(){
        Intent intent = new Intent(this,register_form.class);
        startActivity(intent);
    }
}