package com.example.komektes;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class esepberu extends AppCompatActivity {
    private Button btn_jiber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esep);
        btn_jiber=(Button) findViewById(R.id.btn_jiber);
        btn_jiber.setOnClickListener(new View.OnClickListener() {
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