package com.example.timemaker;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.android.identity.android.legacy.Utility;
import com.kakao.sdk.common.KakaoSdk;

public class MainActivity extends AppCompatActivity {
    Button addToDo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        KakaoSdk.init(this, "{ef52769f9ba38d3a4cda5e4869c9e8db}");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addToDo = findViewById(R.id.addToDo);
        addToDo.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(),  AddTodo.class);
                startActivity(intent);
            }
        });
    }


}

