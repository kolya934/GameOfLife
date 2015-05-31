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

        View clrButton = findViewById(R.id.butClear);
        clrButton.setOnClickListener(this);

        }



    public static final int[][] LifeSet = new int[10][10];

    private void resetGrid(int[][] grid) {
        for (int h = 0; h < 10; h++) {
            for (int w = 0; w < 10; w++) {
                LifeSet[h][w] = 0;
            }
        }
    }

    public void onClick(View v) {

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
        CheckBox ch26 = (CheckBox)findViewById(R.id.checkBox26);
        CheckBox ch27 = (CheckBox)findViewById(R.id.checkBox27);
        CheckBox ch28 = (CheckBox)findViewById(R.id.checkBox28);
        CheckBox ch29 = (CheckBox)findViewById(R.id.checkBox29);
        CheckBox ch30 = (CheckBox)findViewById(R.id.checkBox30);
        CheckBox ch31 = (CheckBox)findViewById(R.id.checkBox31);
        CheckBox ch32 = (CheckBox)findViewById(R.id.checkBox32);
        CheckBox ch33 = (CheckBox)findViewById(R.id.checkBox33);
        CheckBox ch34 = (CheckBox)findViewById(R.id.checkBox34);
        CheckBox ch35 = (CheckBox)findViewById(R.id.checkBox35);
        CheckBox ch36 = (CheckBox)findViewById(R.id.checkBox36);
        CheckBox ch37 = (CheckBox)findViewById(R.id.checkBox37);
        CheckBox ch38 = (CheckBox)findViewById(R.id.checkBox38);
        CheckBox ch39 = (CheckBox)findViewById(R.id.checkBox39);
        CheckBox ch40 = (CheckBox)findViewById(R.id.checkBox40);
        CheckBox ch41 = (CheckBox)findViewById(R.id.checkBox41);
        CheckBox ch42 = (CheckBox)findViewById(R.id.checkBox42);
        CheckBox ch43 = (CheckBox)findViewById(R.id.checkBox43);
        CheckBox ch44 = (CheckBox)findViewById(R.id.checkBox44);
        CheckBox ch45 = (CheckBox)findViewById(R.id.checkBox45);
        CheckBox ch46 = (CheckBox)findViewById(R.id.checkBox46);
        CheckBox ch47 = (CheckBox)findViewById(R.id.checkBox47);
        CheckBox ch48 = (CheckBox)findViewById(R.id.checkBox48);
        CheckBox ch49 = (CheckBox)findViewById(R.id.checkBox49);
        CheckBox ch50 = (CheckBox)findViewById(R.id.checkBox50);
        CheckBox ch51 = (CheckBox)findViewById(R.id.checkBox51);
        CheckBox ch52 = (CheckBox)findViewById(R.id.checkBox52);
        CheckBox ch53 = (CheckBox)findViewById(R.id.checkBox53);
        CheckBox ch54 = (CheckBox)findViewById(R.id.checkBox54);
        CheckBox ch55 = (CheckBox)findViewById(R.id.checkBox55);
        CheckBox ch56 = (CheckBox)findViewById(R.id.checkBox56);
        CheckBox ch57 = (CheckBox)findViewById(R.id.checkBox57);
        CheckBox ch58 = (CheckBox)findViewById(R.id.checkBox58);
        CheckBox ch59 = (CheckBox)findViewById(R.id.checkBox59);
        CheckBox ch60 = (CheckBox)findViewById(R.id.checkBox60);
        CheckBox ch61 = (CheckBox)findViewById(R.id.checkBox61);
        CheckBox ch62 = (CheckBox)findViewById(R.id.checkBox62);
        CheckBox ch63 = (CheckBox)findViewById(R.id.checkBox63);
        CheckBox ch64 = (CheckBox)findViewById(R.id.checkBox64);
        CheckBox ch65 = (CheckBox)findViewById(R.id.checkBox65);
        CheckBox ch66 = (CheckBox)findViewById(R.id.checkBox66);
        CheckBox ch67 = (CheckBox)findViewById(R.id.checkBox67);
        CheckBox ch68 = (CheckBox)findViewById(R.id.checkBox68);
        CheckBox ch69 = (CheckBox)findViewById(R.id.checkBox69);
        CheckBox ch70 = (CheckBox)findViewById(R.id.checkBox70);
        CheckBox ch71 = (CheckBox)findViewById(R.id.checkBox71);
        CheckBox ch72 = (CheckBox)findViewById(R.id.checkBox72);
        CheckBox ch73 = (CheckBox)findViewById(R.id.checkBox73);
        CheckBox ch74 = (CheckBox)findViewById(R.id.checkBox74);
        CheckBox ch75 = (CheckBox)findViewById(R.id.checkBox75);
        CheckBox ch76 = (CheckBox)findViewById(R.id.checkBox76);
        CheckBox ch77 = (CheckBox)findViewById(R.id.checkBox77);
        CheckBox ch78 = (CheckBox)findViewById(R.id.checkBox78);
        CheckBox ch79 = (CheckBox)findViewById(R.id.checkBox79);
        CheckBox ch80 = (CheckBox)findViewById(R.id.checkBox80);
        CheckBox ch81 = (CheckBox)findViewById(R.id.checkBox81);
        CheckBox ch82 = (CheckBox)findViewById(R.id.checkBox82);
        CheckBox ch83 = (CheckBox)findViewById(R.id.checkBox83);
        CheckBox ch84 = (CheckBox)findViewById(R.id.checkBox84);
        CheckBox ch85 = (CheckBox)findViewById(R.id.checkBox85);
        CheckBox ch86 = (CheckBox)findViewById(R.id.checkBox86);
        CheckBox ch87 = (CheckBox)findViewById(R.id.checkBox87);
        CheckBox ch88 = (CheckBox)findViewById(R.id.checkBox88);
        CheckBox ch89 = (CheckBox)findViewById(R.id.checkBox89);
        CheckBox ch90 = (CheckBox)findViewById(R.id.checkBox90);
        CheckBox ch91 = (CheckBox)findViewById(R.id.checkBox91);
        CheckBox ch92 = (CheckBox)findViewById(R.id.checkBox92);
        CheckBox ch93 = (CheckBox)findViewById(R.id.checkBox93);
        CheckBox ch94 = (CheckBox)findViewById(R.id.checkBox94);
        CheckBox ch95 = (CheckBox)findViewById(R.id.checkBox95);
        CheckBox ch96 = (CheckBox)findViewById(R.id.checkBox96);
        CheckBox ch97 = (CheckBox)findViewById(R.id.checkBox97);
        CheckBox ch98 = (CheckBox)findViewById(R.id.checkBox98);
        CheckBox ch99 = (CheckBox)findViewById(R.id.checkBox99);
        CheckBox ch100 = (CheckBox)findViewById(R.id.checkBox100);

        switch (v.getId()) {
            case R.id.button:

                //0x
                LifeSet[0][0] = ch1.isChecked() ? 1 : 0;
                LifeSet[0][1] = ch2.isChecked() ? 1 : 0;
                LifeSet[0][2] = ch3.isChecked() ? 1 : 0;
                LifeSet[0][3] = ch4.isChecked() ? 1 : 0;
                LifeSet[0][4] = ch5.isChecked() ? 1 : 0;
                LifeSet[0][5] = ch6.isChecked() ? 1 : 0;
                LifeSet[0][6] = ch7.isChecked() ? 1 : 0;
                LifeSet[0][7] = ch8.isChecked() ? 1 : 0;
                LifeSet[0][8] = ch9.isChecked() ? 1 : 0;
                LifeSet[0][9] = ch10.isChecked() ? 1 : 0;

                //1x
                LifeSet[1][0] = ch11.isChecked() ? 1 : 0;
                LifeSet[1][1] = ch12.isChecked() ? 1 : 0;
                LifeSet[1][2] = ch13.isChecked() ? 1 : 0;
                LifeSet[1][3] = ch14.isChecked() ? 1 : 0;
                LifeSet[1][4] = ch15.isChecked() ? 1 : 0;
                LifeSet[1][5] = ch16.isChecked() ? 1 : 0;
                LifeSet[1][6] = ch17.isChecked() ? 1 : 0;
                LifeSet[1][7] = ch18.isChecked() ? 1 : 0;
                LifeSet[1][8] = ch19.isChecked() ? 1 : 0;
                LifeSet[1][9] = ch20.isChecked() ? 1 : 0;

                //2x
                LifeSet[2][0] = ch21.isChecked() ? 1 : 0;
                LifeSet[2][1] = ch22.isChecked() ? 1 : 0;
                LifeSet[2][2] = ch23.isChecked() ? 1 : 0;
                LifeSet[2][3] = ch24.isChecked() ? 1 : 0;
                LifeSet[2][4] = ch25.isChecked() ? 1 : 0;
                LifeSet[2][5] = ch26.isChecked() ? 1 : 0;
                LifeSet[2][6] = ch27.isChecked() ? 1 : 0;
                LifeSet[2][7] = ch28.isChecked() ? 1 : 0;
                LifeSet[2][8] = ch29.isChecked() ? 1 : 0;
                LifeSet[2][9] = ch30.isChecked() ? 1 : 0;

                //3x
                LifeSet[3][0] = ch31.isChecked() ? 1 : 0;
                LifeSet[3][1] = ch32.isChecked() ? 1 : 0;
                LifeSet[3][2] = ch33.isChecked() ? 1 : 0;
                LifeSet[3][3] = ch34.isChecked() ? 1 : 0;
                LifeSet[3][4] = ch35.isChecked() ? 1 : 0;
                LifeSet[3][5] = ch36.isChecked() ? 1 : 0;
                LifeSet[3][6] = ch37.isChecked() ? 1 : 0;
                LifeSet[3][7] = ch38.isChecked() ? 1 : 0;
                LifeSet[3][8] = ch39.isChecked() ? 1 : 0;
                LifeSet[3][9] = ch40.isChecked() ? 1 : 0;

                //4x
                LifeSet[4][0] = ch41.isChecked() ? 1 : 0;
                LifeSet[4][1] = ch42.isChecked() ? 1 : 0;
                LifeSet[4][2] = ch43.isChecked() ? 1 : 0;
                LifeSet[4][3] = ch44.isChecked() ? 1 : 0;
                LifeSet[4][4] = ch45.isChecked() ? 1 : 0;
                LifeSet[4][5] = ch46.isChecked() ? 1 : 0;
                LifeSet[4][6] = ch47.isChecked() ? 1 : 0;
                LifeSet[4][7] = ch48.isChecked() ? 1 : 0;
                LifeSet[4][8] = ch49.isChecked() ? 1 : 0;
                LifeSet[4][9] = ch50.isChecked() ? 1 : 0;

                //5x
                LifeSet[5][0] = ch51.isChecked() ? 1 : 0;
                LifeSet[5][1] = ch52.isChecked() ? 1 : 0;
                LifeSet[5][2] = ch53.isChecked() ? 1 : 0;
                LifeSet[5][3] = ch54.isChecked() ? 1 : 0;
                LifeSet[5][4] = ch55.isChecked() ? 1 : 0;
                LifeSet[5][5] = ch56.isChecked() ? 1 : 0;
                LifeSet[5][6] = ch57.isChecked() ? 1 : 0;
                LifeSet[5][7] = ch58.isChecked() ? 1 : 0;
                LifeSet[5][8] = ch59.isChecked() ? 1 : 0;
                LifeSet[5][9] = ch60.isChecked() ? 1 : 0;

                //6x
                LifeSet[6][0] = ch61.isChecked() ? 1 : 0;
                LifeSet[6][1] = ch62.isChecked() ? 1 : 0;
                LifeSet[6][2] = ch63.isChecked() ? 1 : 0;
                LifeSet[6][3] = ch64.isChecked() ? 1 : 0;
                LifeSet[6][4] = ch65.isChecked() ? 1 : 0;
                LifeSet[6][5] = ch66.isChecked() ? 1 : 0;
                LifeSet[6][6] = ch67.isChecked() ? 1 : 0;
                LifeSet[6][7] = ch68.isChecked() ? 1 : 0;
                LifeSet[6][8] = ch69.isChecked() ? 1 : 0;
                LifeSet[6][9] = ch70.isChecked() ? 1 : 0;

                //7x
                LifeSet[7][0] = ch71.isChecked() ? 1 : 0;
                LifeSet[7][1] = ch72.isChecked() ? 1 : 0;
                LifeSet[7][2] = ch73.isChecked() ? 1 : 0;
                LifeSet[7][3] = ch74.isChecked() ? 1 : 0;
                LifeSet[7][4] = ch75.isChecked() ? 1 : 0;
                LifeSet[7][5] = ch76.isChecked() ? 1 : 0;
                LifeSet[7][6] = ch77.isChecked() ? 1 : 0;
                LifeSet[7][7] = ch78.isChecked() ? 1 : 0;
                LifeSet[7][8] = ch79.isChecked() ? 1 : 0;
                LifeSet[7][9] = ch80.isChecked() ? 1 : 0;

                //8x
                LifeSet[8][0] = ch81.isChecked() ? 1 : 0;
                LifeSet[8][1] = ch82.isChecked() ? 1 : 0;
                LifeSet[8][2] = ch83.isChecked() ? 1 : 0;
                LifeSet[8][3] = ch84.isChecked() ? 1 : 0;
                LifeSet[8][4] = ch85.isChecked() ? 1 : 0;
                LifeSet[8][5] = ch86.isChecked() ? 1 : 0;
                LifeSet[8][6] = ch87.isChecked() ? 1 : 0;
                LifeSet[8][7] = ch88.isChecked() ? 1 : 0;
                LifeSet[8][8] = ch89.isChecked() ? 1 : 0;
                LifeSet[8][9] = ch90.isChecked() ? 1 : 0;

                //9x
                LifeSet[9][0] = ch91.isChecked() ? 1 : 0;
                LifeSet[9][1] = ch92.isChecked() ? 1 : 0;
                LifeSet[9][2] = ch93.isChecked() ? 1 : 0;
                LifeSet[9][3] = ch94.isChecked() ? 1 : 0;
                LifeSet[9][4] = ch95.isChecked() ? 1 : 0;
                LifeSet[9][5] = ch96.isChecked() ? 1 : 0;
                LifeSet[9][6] = ch97.isChecked() ? 1 : 0;
                LifeSet[9][7] = ch98.isChecked() ? 1 : 0;
                LifeSet[9][8] = ch99.isChecked() ? 1 : 0;
                LifeSet[9][9] = ch100.isChecked() ? 1 : 0;



                Intent gridIntent = new Intent(this, GridActivity.class);
                startActivity(gridIntent);
                break;
            case R.id.butClear:
                //TODO Написать сброс сетки
                ch1.setChecked(false);
                ch2.setChecked(false);
                ch3.setChecked(false);
                ch4.setChecked(false);
                ch5.setChecked(false);
                ch6.setChecked(false);
                ch7.setChecked(false);
                ch8.setChecked(false);
                ch9.setChecked(false);
                ch10.setChecked(false);

                ch11.setChecked(false);
                ch12.setChecked(false);
                ch13.setChecked(false);
                ch14.setChecked(false);
                ch15.setChecked(false);
                ch16.setChecked(false);
                ch17.setChecked(false);
                ch18.setChecked(false);
                ch19.setChecked(false);
                ch20.setChecked(false);

                ch21.setChecked(false);
                ch22.setChecked(false);
                ch23.setChecked(false);
                ch24.setChecked(false);
                ch25.setChecked(false);
                ch26.setChecked(false);
                ch27.setChecked(false);
                ch28.setChecked(false);
                ch29.setChecked(false);
                ch30.setChecked(false);

                ch31.setChecked(false);
                ch32.setChecked(false);
                ch33.setChecked(false);
                ch34.setChecked(false);
                ch35.setChecked(false);
                ch36.setChecked(false);
                ch37.setChecked(false);
                ch38.setChecked(false);
                ch39.setChecked(false);
                ch40.setChecked(false);

                ch41.setChecked(false);
                ch42.setChecked(false);
                ch43.setChecked(false);
                ch44.setChecked(false);
                ch45.setChecked(false);
                ch46.setChecked(false);
                ch47.setChecked(false);
                ch48.setChecked(false);
                ch49.setChecked(false);
                ch50.setChecked(false);

                ch51.setChecked(false);
                ch52.setChecked(false);
                ch53.setChecked(false);
                ch54.setChecked(false);
                ch55.setChecked(false);
                ch56.setChecked(false);
                ch57.setChecked(false);
                ch58.setChecked(false);
                ch59.setChecked(false);
                ch60.setChecked(false);

                ch61.setChecked(false);
                ch62.setChecked(false);
                ch63.setChecked(false);
                ch64.setChecked(false);
                ch65.setChecked(false);
                ch66.setChecked(false);
                ch67.setChecked(false);
                ch68.setChecked(false);
                ch69.setChecked(false);
                ch70.setChecked(false);

                ch71.setChecked(false);
                ch72.setChecked(false);
                ch73.setChecked(false);
                ch74.setChecked(false);
                ch75.setChecked(false);
                ch76.setChecked(false);
                ch77.setChecked(false);
                ch78.setChecked(false);
                ch79.setChecked(false);
                ch80.setChecked(false);

                ch81.setChecked(false);
                ch82.setChecked(false);
                ch83.setChecked(false);
                ch84.setChecked(false);
                ch85.setChecked(false);
                ch86.setChecked(false);
                ch87.setChecked(false);
                ch88.setChecked(false);
                ch89.setChecked(false);
                ch90.setChecked(false);

                ch91.setChecked(false);
                ch92.setChecked(false);
                ch93.setChecked(false);
                ch94.setChecked(false);
                ch95.setChecked(false);
                ch96.setChecked(false);
                ch97.setChecked(false);
                ch98.setChecked(false);
                ch99.setChecked(false);
                ch100.setChecked(false);



                break;
        }}

}