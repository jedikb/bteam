package com.example.my01;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btnCall, btnNew;
    EditText etPhoneNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etPhoneNum = findViewById(R.id.etPhoneNum);


        btnCall = findViewById(R.id.btnCall);
        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phoneNum = "tel:" + etPhoneNum.getText().toString();

                Intent intent = new Intent(Intent.ACTION_DIAL,
                    Uri.parse(phoneNum));
                startActivity(intent);
            }
        });

        btnNew = findViewById(R.id.btnNew);
        btnNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(),
                    SubActivity.class);
                startActivity(intent);
            }

        });


    }
    
    public void btn1Clicked(View view) {
        Toast.makeText(this, 
            "버튼1이 클릭되었습니다!", Toast.LENGTH_SHORT).show();  //Length_short는 노출 시간임
    }

    public void btn2Clicked(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"));
        startActivity(intent);
        Toast.makeText(this,
            "네이버로 이동합니다.", Toast.LENGTH_SHORT).show();
    }

}