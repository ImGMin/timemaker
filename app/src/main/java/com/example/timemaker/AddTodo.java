package com.example.timemaker;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class AddToDo extends AppCompatActivity {
    Button addToDocomplete_B;
    Button addToDodelete_B;
    Button addToDoreturn_B;

    //BoxLayoutAxis;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.addtodo);

        addToDocomplete_B = findViewById(R.id.addToDocomplete_B);
        addToDocomplete_B.setOnClickListener(new View.OnClickListener(){
           public void onClick(View view){
                //mainactivity에 투두 추가
                Intent intent1 = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent1);
            }
        });

        addToDodelete_B = findViewById(R.id.addToDodelete_B);
        addToDodelete_B.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                //mainactivity에서 투두 제거
                Intent intent2 = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent2);
            }
        });

        addToDoreturn_B = findViewById(R.id.addToDoreturn_B);
        addToDoreturn_B.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                //mainactivity로 복귀
                Intent intent3 = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent3);
            }
        });
    }
}