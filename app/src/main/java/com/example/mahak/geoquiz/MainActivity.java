package com.example.mahak.geoquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int current =0;
    Question[] questions = {new Question(R.string.question1,true),
            new Question(R.string.question2,false),
            new Question(R.string.question3,true)};

    void changeQuestion(){
        TextView textView = (TextView) findViewById(R.id.question);
        textView.setText(questions[current].getQuesId());

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        changeQuestion();
    }


    public void trueListener(View view){
        if(questions[current].isTrueAnswer())
            Toast.makeText(this,"correct",Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(this,"incorrect",Toast.LENGTH_SHORT).show();

    }
    public void falseListener(View view){
        if(questions[current].isTrueAnswer())
            Toast.makeText(this,"incorrect",Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(this,"correct",Toast.LENGTH_SHORT).show();
    }
    public void nextListener(View view){
        current = (current+1)%questions.length;
        changeQuestion();
    }
    public void prevListener(View view){
        current = (current+questions.length-1)%questions.length;
        changeQuestion();
    }
}
