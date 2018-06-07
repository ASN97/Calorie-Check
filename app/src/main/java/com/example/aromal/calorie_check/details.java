package com.example.aromal.calorie_check;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.io.IOException;
import java.sql.SQLException;

public class details extends AppCompatActivity {
DatabaseHelper mydb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_details);


        mydb=new DatabaseHelper(this);
        // Create an ArrayAdapter using the string array and a default spinner layout
        Spinner spinner1 = (Spinner) findViewById(R.id.food1);
        Spinner spinner2 = (Spinner) findViewById(R.id.food2);
        Spinner spinner3 = (Spinner) findViewById(R.id.food3);
        Button b1=(Button)findViewById(R.id.calc_calo);
        final TextView t1=(TextView)findViewById(R.id.calorie_val);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.food_item, android.R.layout.simple_spinner_item);

// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter);
        spinner2.setAdapter(adapter);
        spinner3.setAdapter(adapter);
    b1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {


            //Start of onclick

                    DatabaseHelper myDbHelper = new DatabaseHelper(details.this);
                    try {
                        myDbHelper.createDataBase();
                    } catch (IOException ioe) {
                        throw new Error("Unable to create database");
                    }
                    try {
                        myDbHelper.openDataBase();
                    } catch (SQLException sqle) {
                        try {
                            throw sqle;
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }




            t1.setText("This will calculate the total calories");
        }
    });



    }
}
