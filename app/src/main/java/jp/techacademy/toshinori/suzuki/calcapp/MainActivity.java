package jp.techacademy.toshinori.suzuki.calcapp;

import android.content.Intent;
import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText inputNum1;
    EditText inputNum2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button)findViewById(R.id.button1);
        button1.setOnClickListener(this);

        Button button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(this);

        Button button3 = (Button)findViewById(R.id.button3);
        button3.setOnClickListener(this);

        Button button4 = (Button)findViewById(R.id.button4);
        button4.setOnClickListener(this);

        inputNum1 = (EditText)findViewById(R.id.editText1);
        inputNum2 = (EditText)findViewById(R.id.editText2);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("VALUE1", Float.parseFloat(inputNum1.getText().toString()));
        intent.putExtra("VALUE2", Float.parseFloat(inputNum2.getText().toString()));

        if (v.getId() == R.id.button1) {
            intent.putExtra("VALUE3", 1);
        } else if (v.getId() == R.id.button2) {
            intent.putExtra("VALUE3", 2);
        } else if (v.getId() == R.id.button3) {
            intent.putExtra("VALUE3", 3);
        } else if (v.getId() == R.id.button4) {
            intent.putExtra("VALUE3", 4);
        }
        startActivity(intent);
    }
}
