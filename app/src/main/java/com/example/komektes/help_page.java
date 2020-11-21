package com.example.komektes;


import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class help_page extends AppCompatActivity {
    private Button btnshop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help_page);

        btnshop=(Button) findViewById(R.id.btnshop);
        btnshop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             openinfo();
        }

    });
}

    public void openinfo(){
        Intent intent = new Intent(this,info.class);
        startActivity(intent);
    }
}