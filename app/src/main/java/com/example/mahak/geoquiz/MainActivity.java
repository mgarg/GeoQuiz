package com.example.mahak.geoquiz;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int current =0;
    String TAG = "MainActivity";
    String KEY_INDEX = "Index";

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
        if(savedInstanceState != null)
            current = savedInstanceState.getInt(KEY_INDEX,0);
        changeQuestion();
        Log.d(TAG,"onCreate");
    }

    @Override
    public void onSaveInstanceState(Bundle savedState) {
        super.onSaveInstanceState(savedState);
        Log.i(TAG,"onSavedInstanceState");
        savedState.putInt(KEY_INDEX,current);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"onStop");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d(TAG,"onPause");

    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.d(TAG,"onResume");

    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG,"onDestroy");

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
