package com.example.komektes;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class register_form extends AppCompatActivity {
    private Button btnTirkelu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTirkelu=(Button) findViewById(R.id.btnTirkelu);
        btnTirkelu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainPage();
            }
        });

    }
    public void openMainPage(){
        Intent intent = new Intent(this,MainPage.class);
        startActivity(intent);
    }
}