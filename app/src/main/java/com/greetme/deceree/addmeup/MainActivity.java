package com.greetme.deceree.addmeup;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


            final EditText firstNumber;
            final EditText secondNumber;
            final TextView addResult;
            Button btnAdd;
        try{
            final double[] num1 = new double[1];
            final double[] num2 = new double[1];
            final double[] sum = new double[1];

            firstNumber = (EditText) findViewById(R.id.textView1);
            secondNumber = (EditText) findViewById(R.id.textView2);
            addResult = (TextView) findViewById(R.id.textView3);
            btnAdd = (Button) findViewById(R.id.button);


            btnAdd.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                    num1[0] = Double.parseDouble(firstNumber.getText().toString());
                    num2[0] = Double.parseDouble(secondNumber.getText().toString());
                    sum[0] = num1[0] + num2[0];
                    addResult.setText(Double.toString(sum[0]));


                }

            });
        }catch(Exception e){
            Toast.makeText(MainActivity.this,
                    "Error!", Toast.LENGTH_LONG).show();
    }

    }


}
