package com.example.komektes;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class info extends AppCompatActivity {
    private Button btnesep;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        btnesep=(Button) findViewById(R.id.btnesep);
        btnesep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openesepberu();
            }
        });

    }
    public void openesepberu(){
        Intent intent = new Intent(this, esepberu.class);
        startActivity(intent);
    }

}