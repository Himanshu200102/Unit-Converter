package com.example.unconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button2;
    private TextView textView2;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button2 = findViewById(R.id.button2);
        textView2 = findViewById(R.id.textView2);
        editText = findViewById(R.id.editText);
//        button2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                Toast.makeText(MainActivity.this, "Worked!", Toast.LENGTH_SHORT).show();
//                String s = editText.getText().toString();
//                int kg= Integer.parseInt(s);
//                double pound = 2.205  *  kg;
//                textView2.setText("The Correspondig Value is" + pound);
//
//
//
//            }
//        });

    }
    public void calculate(View v){

        String s = editText.getText().toString();
        int kg= Integer.parseInt(s);
        double pound = 2.205  *  kg;
        textView2.setText("The Correspondig Value is" + pound);
        Toast.makeText(this, "Converted Succesfully", Toast.LENGTH_SHORT).show();
    }
}