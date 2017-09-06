package com.example.lizhiwei.transferring;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class interface1 extends AppCompatActivity {
    private final String tag = "myTag";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_interface);
    }

    public void cal(View v){
        Button buttonCal = (Button)findViewById(R.id.buttonCal);
        final EditText number1 = (EditText)findViewById(R.id.number1);
        final EditText number2 = (EditText)findViewById(R.id.number2);
        buttonCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(interface1.this,interface2.class);
                intent.putExtra("number1",number1.getText().toString());
                intent.putExtra("number2",number2.getText().toString());
                startActivityForResult(intent,0);
            }
        });
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==0 && resultCode==0){
            String str=data.getStringExtra("result");
            EditText number3 = (EditText)findViewById(R.id.number3);
            number3.setText(str);
            Toast.makeText(this,str,Toast.LENGTH_SHORT).show();
        }

    }
}
