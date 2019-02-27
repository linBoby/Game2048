package com.example.androidactivity;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends Activity  implements View.OnClickListener{
    public TextView tvScore;//计分的
    public int score = 0;//积分器
    private Button bt;
    private static MainActivity mainActivity = null;
    public static MainActivity getMainActivity() {
        return mainActivity;
    }
    public MainActivity(){
        mainActivity = this;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inital();
    }
    public void inital() {
        tvScore = (TextView) findViewById(R.id.tvScore);//score
        tvScore.setText("0");
        bt = (Button)findViewById(R.id.button);//按钮
        bt.setOnClickListener(this);
    }
    public void onClick(View v) {
        GameView.getGameView().startGame();
        clearScore();
    }

    public void clearScore(){
        score = 0;
        showScore();
    }
    public void showScore(){
        tvScore.setText(score+"");
    }
    public void addScore(int s){
        score+=s;
        showScore();
    }



}
