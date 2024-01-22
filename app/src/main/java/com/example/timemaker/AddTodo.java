package com.example.timemaker;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Switch;

import androidx.appcompat.app.AppCompatActivity;

public class AddTodo extends AppCompatActivity {
    Button addToDocomplete_B;
    Button addToDodelete_B;
    Button addToDoreturn_B;
    Switch addToDoswitch;
    ImageView image1;
    ImageView image2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.addtodo);

        image1 = findViewById(R.id.imageView2);
        image2 = findViewById(R.id.imageView3);

        addToDoswitch = findViewById(R.id.addToDoswitch);
        CheckState();
        addToDoswitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CheckState();
            }
        });



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

    private void CheckState() {
        if(addToDoswitch.isChecked()){
            image1.onVisibilityAggregated(false);
            image2.onVisibilityAggregated(true);
        }
        else {
            image1.onVisibilityAggregated(true);
            image2.onVisibilityAggregated(false);
        }
    }
}