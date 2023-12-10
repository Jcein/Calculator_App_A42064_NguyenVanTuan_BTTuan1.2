package com.example.a42064_test001.A42064_tuan1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.a42064_test001.R;

public class MainActivity extends AppCompatActivity {
    //khai bao
    TextView main_tv, val1_tv, val2_tv, result_tv, result_tv_out;
    Button btn1;
    EditText val1_in, val2_in;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main_tv = findViewById(R.id.main_tv);
        val1_tv = findViewById(R.id.val1_tv);
        val1_in = findViewById(R.id.val1_in);
        val2_tv = findViewById(R.id.val2_tv);
        val2_in = findViewById(R.id.val2_in);
        btn1 = findViewById(R.id.btn_1);
        result_tv = findViewById(R.id.result_tv);
        result_tv_out = findViewById(R.id.result_tv_out);

        main_tv.setText("===CALCULATOR===");
        val1_tv.setText("First Value:");
        val2_tv.setText("Second Value:");
        result_tv.setText("Result:");

        btn1.setOnClickListener(v->{
            GetSum();
        });
    }


    private void GetSum(){
        float val1 = Float.parseFloat(val1_in.getText().toString());
        float val2 = Float.parseFloat(val2_in.getText().toString());
        String result = String.valueOf(val1 + val2);
        result_tv_out.setText(result);
    }
}