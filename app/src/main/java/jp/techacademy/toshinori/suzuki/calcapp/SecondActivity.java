package jp.techacademy.toshinori.suzuki.calcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        float value1 = intent.getFloatExtra("VALUE1", 0);
        float value2 = intent.getFloatExtra("VALUE2", 0);
        int value3 = intent.getIntExtra("VALUE3", 0);

        TextView textView = (TextView)findViewById(R.id.textView);
        if (value3 == 1) {
            textView.setText(String.valueOf(value1 + value2));
        } else if (value3 == 2) {
            textView.setText(String.valueOf(value1 - value2));
        } else if (value3 == 3) {
            textView.setText(String.valueOf(value1 * value2));
        } else if (value3 == 4) {
            textView.setText(String.valueOf(value1 / value2));
        }
    }
}
