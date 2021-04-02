package com.example.flames;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText FirstName, SecondName;
    Button b;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirstName = findViewById(R.id.FirstName);
        SecondName = findViewById(R.id.SecondName);
        b = findViewById(R.id.b);


        char c1[] = new char[20];
        char c2[] = new char[20];
        char c3[] = new char[20];

        char result1[] = new char[20];
        char result2[] = new char[20];
        char res[] = new char[c3.length - 1];

        //Scanner s=new Scanner(System.in);



        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = FirstName.getText().toString();
                String s2 = SecondName.getText().toString();

                if (s1.isEmpty()) {
                    FirstName.setError("First Name Required");
                }
                if (s2.isEmpty()) {
                    SecondName.setError("Second Name Required");
                } else {

                    Intent intent = new Intent(getApplicationContext(), FirstActivity.class);
                    intent.putExtra("s1", s1);
                    intent.putExtra("s2", s2);
                    startActivity(intent);
                    // sample();
                }
            }
        });


    }
}



