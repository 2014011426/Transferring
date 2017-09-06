package com.example.lizhiwei.transferring;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class interface2 extends AppCompatActivity {
    private final String tag = "myTag";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interface2);
        final Intent intent = getIntent();
        final String number1 = intent.getStringExtra("number1");
        final String number2 = intent.getStringExtra("number2");
        String str = "number1:"+number1+"/nnumber2:"+number2;
        Toast.makeText(this,str,Toast.LENGTH_SHORT).show();
        Button backInterface1 = (Button)findViewById(R.id.backInterface1);
        backInterface1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int result = Integer.parseInt(number1) + Integer.parseInt(number2);
                intent.putExtra("result",result+"");
                setResult(0,intent);
                finish();
            }
        });
    }
}
