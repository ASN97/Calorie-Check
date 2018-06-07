package com.example.aromal.calorie_check;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button enterfood=(Button)findViewById(R.id.calorie);
        Button viewhistory=(Button)findViewById(R.id.HISTORY);
        Button viewstats=(Button)findViewById(R.id.stats);

        enterfood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startdetail=new Intent(MainActivity.this,details.class);
                startActivity(startdetail);
            }


        });
       viewhistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startdetail=new Intent(MainActivity.this,history.class);
                startActivity(startdetail);
            }


        });

        viewstats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startdetail=new Intent(MainActivity.this,stats.class);
                startActivity(startdetail);

            }


        });




    }
}
