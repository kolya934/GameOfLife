package com.k934.gameoflife;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;


public class Position extends Activity implements View.OnClickListener {



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_position);

        View newButton = findViewById(R.id.button);
        newButton.setOnClickListener(this);

        CheckBox ch1 = (CheckBox)findViewById(R.id.checkBox);
        CheckBox ch2 = (CheckBox)findViewById(R.id.checkBox2);
        CheckBox ch3 = (CheckBox)findViewById(R.id.checkBox3);
        CheckBox ch4 = (CheckBox)findViewById(R.id.checkBox4);
        CheckBox ch5 = (CheckBox)findViewById(R.id.checkBox5);
        CheckBox ch6 = (CheckBox)findViewById(R.id.checkBox6);
        CheckBox ch7 = (CheckBox)findViewById(R.id.checkBox7);
        CheckBox ch8 = (CheckBox)findViewById(R.id.checkBox8);
        CheckBox ch9 = (CheckBox)findViewById(R.id.checkBox9);
        CheckBox ch10 = (CheckBox)findViewById(R.id.checkBox10);
        CheckBox ch11 = (CheckBox)findViewById(R.id.checkBox11);
        CheckBox ch12 = (CheckBox)findViewById(R.id.checkBox12);
        CheckBox ch13 = (CheckBox)findViewById(R.id.checkBox13);
        CheckBox ch14 = (CheckBox)findViewById(R.id.checkBox14);
        CheckBox ch15 = (CheckBox)findViewById(R.id.checkBox15);
        CheckBox ch16 = (CheckBox)findViewById(R.id.checkBox16);
        CheckBox ch17 = (CheckBox)findViewById(R.id.checkBox17);
        CheckBox ch18 = (CheckBox)findViewById(R.id.checkBox18);
        CheckBox ch19 = (CheckBox)findViewById(R.id.checkBox19);
        CheckBox ch20 = (CheckBox)findViewById(R.id.checkBox20);
        CheckBox ch21 = (CheckBox)findViewById(R.id.checkBox21);
        CheckBox ch22 = (CheckBox)findViewById(R.id.checkBox22);
        CheckBox ch23 = (CheckBox)findViewById(R.id.checkBox23);
        CheckBox ch24 = (CheckBox)findViewById(R.id.checkBox24);
        CheckBox ch25 = (CheckBox)findViewById(R.id.checkBox25);

        //resetGrid(LifeSet);


        LifeSet[0][0] = ch1.isChecked() ? 1 : 0;
        LifeSet[0][1] = ch2.isChecked() ? 1 : 0;
        LifeSet[0][2] = ch3.isChecked() ? 1 : 0;
        LifeSet[0][3] = ch4.isChecked() ? 1 : 0;
        LifeSet[0][4] = ch5.isChecked() ? 1 : 0;

        LifeSet[1][0] = ch6.isChecked() ? 1 : 0;
        LifeSet[1][1] = ch7.isChecked() ? 1 : 0;
        LifeSet[1][2] = ch8.isChecked() ? 1 : 0;
        LifeSet[1][3] = ch9.isChecked() ? 1 : 0;
        LifeSet[1][4] = ch10.isChecked() ? 1 : 0;

        LifeSet[2][0] = ch11.isChecked() ? 1 : 0;
        LifeSet[2][1] = ch12.isChecked() ? 1 : 0;
        LifeSet[2][2] = ch13.isChecked() ? 1 : 0;
        LifeSet[2][3] = ch14.isChecked() ? 1 : 0;
        LifeSet[2][4] = ch15.isChecked() ? 1 : 0;

        LifeSet[3][0] = ch16.isChecked() ? 1 : 0;
        LifeSet[3][1] = ch17.isChecked() ? 1 : 0;
        LifeSet[3][2] = ch18.isChecked() ? 1 : 0;
        LifeSet[3][3] = ch19.isChecked() ? 1 : 0;
        LifeSet[3][4] = ch20.isChecked() ? 1 : 0;

        LifeSet[4][0] = ch21.isChecked() ? 1 : 0;
        LifeSet[4][1] = ch22.isChecked() ? 1 : 0;
        LifeSet[4][2] = ch23.isChecked() ? 1 : 0;
        LifeSet[4][3] = ch24.isChecked() ? 1 : 0;
        LifeSet[4][4] = ch25.isChecked() ? 1 : 0;

    }



    public static final int[][] LifeSet = new int[5][5];

    private void resetGrid(int[][] grid) {
        for (int h = 0; h < 5; h++) {
            for (int w = 0; w < 5; w++) {
                LifeSet[h][w] = 0;
            }
        }
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                Toast.makeText(this, "Скоро эта кнопка будет запускать игру!:)", Toast.LENGTH_SHORT).show();

                CheckBox ch1 = (CheckBox)findViewById(R.id.checkBox);
                CheckBox ch2 = (CheckBox)findViewById(R.id.checkBox2);
                CheckBox ch3 = (CheckBox)findViewById(R.id.checkBox3);
                CheckBox ch4 = (CheckBox)findViewById(R.id.checkBox4);
                CheckBox ch5 = (CheckBox)findViewById(R.id.checkBox5);
                CheckBox ch6 = (CheckBox)findViewById(R.id.checkBox6);
                CheckBox ch7 = (CheckBox)findViewById(R.id.checkBox7);
                CheckBox ch8 = (CheckBox)findViewById(R.id.checkBox8);
                CheckBox ch9 = (CheckBox)findViewById(R.id.checkBox9);
                CheckBox ch10 = (CheckBox)findViewById(R.id.checkBox10);
                CheckBox ch11 = (CheckBox)findViewById(R.id.checkBox11);
                CheckBox ch12 = (CheckBox)findViewById(R.id.checkBox12);
                CheckBox ch13 = (CheckBox)findViewById(R.id.checkBox13);
                CheckBox ch14 = (CheckBox)findViewById(R.id.checkBox14);
                CheckBox ch15 = (CheckBox)findViewById(R.id.checkBox15);
                CheckBox ch16 = (CheckBox)findViewById(R.id.checkBox16);
                CheckBox ch17 = (CheckBox)findViewById(R.id.checkBox17);
                CheckBox ch18 = (CheckBox)findViewById(R.id.checkBox18);
                CheckBox ch19 = (CheckBox)findViewById(R.id.checkBox19);
                CheckBox ch20 = (CheckBox)findViewById(R.id.checkBox20);
                CheckBox ch21 = (CheckBox)findViewById(R.id.checkBox21);
                CheckBox ch22 = (CheckBox)findViewById(R.id.checkBox22);
                CheckBox ch23 = (CheckBox)findViewById(R.id.checkBox23);
                CheckBox ch24 = (CheckBox)findViewById(R.id.checkBox24);
                CheckBox ch25 = (CheckBox)findViewById(R.id.checkBox25);

                LifeSet[0][0] = ch1.isChecked() ? 1 : 0;
                LifeSet[0][1] = ch2.isChecked() ? 1 : 0;
                LifeSet[0][2] = ch3.isChecked() ? 1 : 0;
                LifeSet[0][3] = ch4.isChecked() ? 1 : 0;
                LifeSet[0][4] = ch5.isChecked() ? 1 : 0;

                LifeSet[1][0] = ch6.isChecked() ? 1 : 0;
                LifeSet[1][1] = ch7.isChecked() ? 1 : 0;
                LifeSet[1][2] = ch8.isChecked() ? 1 : 0;
                LifeSet[1][3] = ch9.isChecked() ? 1 : 0;
                LifeSet[1][4] = ch10.isChecked() ? 1 : 0;

                LifeSet[2][0] = ch11.isChecked() ? 1 : 0;
                LifeSet[2][1] = ch12.isChecked() ? 1 : 0;
                LifeSet[2][2] = ch13.isChecked() ? 1 : 0;
                LifeSet[2][3] = ch14.isChecked() ? 1 : 0;
                LifeSet[2][4] = ch15.isChecked() ? 1 : 0;

                LifeSet[3][0] = ch16.isChecked() ? 1 : 0;
                LifeSet[3][1] = ch17.isChecked() ? 1 : 0;
                LifeSet[3][2] = ch18.isChecked() ? 1 : 0;
                LifeSet[3][3] = ch19.isChecked() ? 1 : 0;
                LifeSet[3][4] = ch20.isChecked() ? 1 : 0;

                LifeSet[4][0] = ch21.isChecked() ? 1 : 0;
                LifeSet[4][1] = ch22.isChecked() ? 1 : 0;
                LifeSet[4][2] = ch23.isChecked() ? 1 : 0;
                LifeSet[4][3] = ch24.isChecked() ? 1 : 0;
                LifeSet[4][4] = ch25.isChecked() ? 1 : 0;

                Intent gridIntent = new Intent(this, GridActivity.class);
                startActivity(gridIntent);
                break;}}
/*
    public  int[][] scanSet()
    {
        resetGrid(LifeSet);


        LifeSet[0][0] = ch1.isChecked() ? 1 : 0;
        LifeSet[0][1] = ch2.isChecked() ? 1 : 0;
        LifeSet[0][2] = ch3.isChecked() ? 1 : 0;
        LifeSet[0][3] = ch4.isChecked() ? 1 : 0;
        LifeSet[0][4] = ch5.isChecked() ? 1 : 0;

        LifeSet[1][0] = ch6.isChecked() ? 1 : 0;
        LifeSet[1][1] = ch7.isChecked() ? 1 : 0;
        LifeSet[1][2] = ch8.isChecked() ? 1 : 0;
        LifeSet[1][3] = ch9.isChecked() ? 1 : 0;
        LifeSet[1][4] = ch10.isChecked() ? 1 : 0;

        LifeSet[2][0] = ch11.isChecked() ? 1 : 0;
        LifeSet[2][1] = ch12.isChecked() ? 1 : 0;
        LifeSet[2][2] = ch13.isChecked() ? 1 : 0;
        LifeSet[2][3] = ch14.isChecked() ? 1 : 0;
        LifeSet[2][4] = ch15.isChecked() ? 1 : 0;

        LifeSet[3][0] = ch16.isChecked() ? 1 : 0;
        LifeSet[3][1] = ch17.isChecked() ? 1 : 0;
        LifeSet[3][2] = ch18.isChecked() ? 1 : 0;
        LifeSet[3][3] = ch19.isChecked() ? 1 : 0;
        LifeSet[3][4] = ch20.isChecked() ? 1 : 0;

        LifeSet[4][0] = ch21.isChecked() ? 1 : 0;
        LifeSet[4][1] = ch22.isChecked() ? 1 : 0;
        LifeSet[4][2] = ch23.isChecked() ? 1 : 0;
        LifeSet[4][3] = ch24.isChecked() ? 1 : 0;
        LifeSet[4][4] = ch25.isChecked() ? 1 : 0;

        return LifeSet;
    }
*/
}