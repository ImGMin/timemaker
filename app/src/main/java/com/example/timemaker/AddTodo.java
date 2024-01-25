package com.example.timemaker;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Switch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

public class AddTodo extends AppCompatActivity {
    Button addToDocomplete_B;
    Button addToDodelete_B;
    Button addToDoreturn_B;
    ConstraintLayout layoutdoing;
    EditText addToDodoing;
    ConstraintLayout layoutss;
    EditText addToDostart;
    EditText addToDostop;
    Switch addToDoswitch;
    ImageView image1;
    ImageView image2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.addtodo);

        layoutdoing = findViewById(R.id.layouttimedoing);
        layoutss = findViewById(R.id.layouttimess);
        addToDodoing = findViewById(R.id.addToDo_doingtime);
        addToDostart = findViewById(R.id.addToDo_starttime);
        addToDostop = findViewById(R.id.addToDo_finishtime);
        addToDoswitch = findViewById(R.id.addToDoswitch);
        //CheckState();

        addToDoswitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(!addToDoswitch.isChecked()){
                    addToDostart.setFocusable(true);//포커싱과
                    addToDostop.setFocusable(true);//포커싱과
                    addToDostart.setClickable(true);//터치가 안되도록!
                    addToDostop.setClickable(true);//터치가 안되도록!

                    addToDodoing.setFocusable(false);//포커싱과
                    addToDodoing.setClickable(false);//터치가 안되도록!
                }
                else {
                    //image1.onVisibilityAggregated(true);
                    //image2.onVisibilityAggregated(false);
                    //layoutss.setBackgroundColor(ContextCompat.getColor(this,R.color.Gray));//배경색 설정
                    addToDodoing.setFocusable(true);//포커싱과
                    addToDodoing.setClickable(true);//터치가 안되도록!

                    addToDostart.setFocusable(false);//포커싱과
                    addToDostop.setFocusable(false);//포커싱과
                    addToDostart.setClickable(false);//터치가 안되도록!
                    addToDostop.setClickable(false);//터치가 안되도록!
                }
            }
        }) ;
        //{
        ////    @Override
////
        ////    public void onCheckedChange(){
        ////        CheckState();
        ////    }
        ////});



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
        if(!addToDoswitch.isChecked()){
            image1.onVisibilityAggregated(false);
            image2.onVisibilityAggregated(true);
            layoutdoing.setBackgroundColor(ContextCompat.getColor(this,R.color.Gray));//배경색 설정
            addToDodoing.setFocusable(false);//포커싱과
            addToDodoing.setClickable(false);//터치가 안되도록!
        }
        else {
            image1.onVisibilityAggregated(true);
            image2.onVisibilityAggregated(false);
        }
    }
}