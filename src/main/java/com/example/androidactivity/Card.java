package com.example.androidactivity;

import android.content.Context;
import android.view.Gravity;
import android.widget.FrameLayout;
import android.widget.TextView;



public class Card extends FrameLayout {

    private int num=0;//卡片数值
    private TextView label;//用于呈现文字

    public Card(Context context) {
        super(context);
        label=new TextView(getContext());//初始化文字 字体为32
        label.setTextSize(32);
        label.setBackgroundColor(0x33ffffff);
        label.setGravity(Gravity.CENTER);//放置中间
        LayoutParams lp=new LayoutParams(-1,-1);
        lp.setMargins(10,10,0,0);//设置间隔
        addView(label,lp);//填label填充满整个view
        setNum(0);//初始化num为0
    }
    public void setNum(int n) {
        this.num = n;
        if(num>0) {
            label.setText(num + "");
        }
        else
            label.setText("");
    }
    public int getNum() {
        return num;
    }

    public boolean equals(Card card) {
        return this.getNum()==card.getNum();
    }
}
