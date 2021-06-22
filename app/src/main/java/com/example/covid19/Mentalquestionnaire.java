package com.example.covid19;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class Mentalquestionnaire extends AppCompatActivity {
    private Intent intent;
    private TextView mtvalue1;
    private TextView mtvalue2;
    private TextView mtvalue3;
    private TextView mtvalue4;
    private TextView mtvalue5;
    private TextView mtvalue6;
    private TextView mtvalue7;
    private TextView mtvalue8;
    private TextView valuetext;
    private int value1;
    private int value2;
    private int value3;
    private int value4;
    private int value5;
    private int value6;
    private int value7;
    private int value8;
    private int result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        final Button btncal = (Button)findViewById(R.id.button6);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mentalstate);

        SeekBar seekBar = (SeekBar)findViewById(R.id.seekBar);
        final TextView seekBarValue = (TextView)findViewById(R.id.mq1a);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress,
                                          boolean fromUser) {
                // TODO Auto-generated method stub
                seekBarValue.setText(String.valueOf(progress));
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }
        });

        SeekBar seekBar2 = (SeekBar)findViewById(R.id.seekBar2);
        final TextView seekBarValue2 = (TextView)findViewById(R.id.mq2a);

        seekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){
            @Override
            public void onProgressChanged(SeekBar seekBar2, int progress,
                                          boolean fromUser) {
                // TODO Auto-generated method stub
                seekBarValue2.setText(String.valueOf(progress));
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar2) {
                // TODO Auto-generated method stub
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar2) {
                // TODO Auto-generated method stub
            }
        });

        SeekBar seekBar3 = (SeekBar)findViewById(R.id.seekBar3);
        final TextView seekBarValue3 = (TextView)findViewById(R.id.mq3a);

        seekBar3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){
            @Override
            public void onProgressChanged(SeekBar seekBar3, int progress,
                                          boolean fromUser) {
                // TODO Auto-generated method stub
                seekBarValue3.setText(String.valueOf(progress));
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar3) {
                // TODO Auto-generated method stub
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar3) {
                // TODO Auto-generated method stub
            }
        });

        SeekBar seekBar4 = (SeekBar)findViewById(R.id.seekBar4);
        final TextView seekBarValue4 = (TextView)findViewById(R.id.mq4a);

        seekBar4.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){
            @Override
            public void onProgressChanged(SeekBar seekBar4, int progress,
                                          boolean fromUser) {
                // TODO Auto-generated method stub
                seekBarValue4.setText(String.valueOf(progress));
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar4) {
                // TODO Auto-generated method stub
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar4) {
                // TODO Auto-generated method stub
            }
        });

        SeekBar seekBar5 = (SeekBar)findViewById(R.id.seekBar5);
        final TextView seekBarValue5 = (TextView)findViewById(R.id.mq5a);

        seekBar5.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){
            @Override
            public void onProgressChanged(SeekBar seekBar5, int progress,
                                          boolean fromUser) {
                // TODO Auto-generated method stub
                seekBarValue5.setText(String.valueOf(progress));
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar5) {
                // TODO Auto-generated method stub
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar5) {
                // TODO Auto-generated method stub
            }
        });

        SeekBar seekBar6 = (SeekBar)findViewById(R.id.seekBar6);
        final TextView seekBarValue6 = (TextView)findViewById(R.id.mq6a);

        seekBar6.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){
            @Override
            public void onProgressChanged(SeekBar seekBar6, int progress,
                                          boolean fromUser) {
                // TODO Auto-generated method stub
                seekBarValue6.setText(String.valueOf(progress));
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar6) {
                // TODO Auto-generated method stub
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar6) {
                // TODO Auto-generated method stub
            }
        });

        SeekBar seekBar7 = (SeekBar)findViewById(R.id.seekBar7);
        final TextView seekBarValue7 = (TextView)findViewById(R.id.mq7a);

        seekBar7.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){
            @Override
            public void onProgressChanged(SeekBar seekBar7, int progress,
                                          boolean fromUser) {
                // TODO Auto-generated method stub
                seekBarValue7.setText(String.valueOf(progress));
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar7) {
                // TODO Auto-generated method stub
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar7) {
                // TODO Auto-generated method stub
            }
        });

        SeekBar seekBar8 = (SeekBar)findViewById(R.id.seekBar8);
        final TextView seekBarValue8 = (TextView)findViewById(R.id.mq8a);

        seekBar8.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){
            @Override
            public void onProgressChanged(SeekBar seekBar8, int progress,
                                          boolean fromUser) {
                // TODO Auto-generated method stub
                seekBarValue8.setText(String.valueOf(progress));
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar8) {
                // TODO Auto-generated method stub
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar8) {
                // TODO Auto-generated method stub
            }
        });

        valuetext = (TextView)findViewById(R.id.textValue);
        mtvalue1 = (TextView)findViewById(R.id.mq1a);
        mtvalue2 = (TextView)findViewById(R.id.mq2a);
        mtvalue3 = (TextView)findViewById(R.id.mq3a);
        mtvalue4 = (TextView)findViewById(R.id.mq4a);
        mtvalue5 = (TextView)findViewById(R.id.mq5a);
        mtvalue6 = (TextView)findViewById(R.id.mq6a);
        mtvalue7 = (TextView)findViewById(R.id.mq7a);
        mtvalue8 = (TextView)findViewById(R.id.mq8a);

        findViewById(R.id.button6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value1 = Integer.parseInt((String) mtvalue1.getText());
                value2 = Integer.parseInt((String) mtvalue2.getText());
                value3 = Integer.parseInt((String) mtvalue3.getText());
                value4 = Integer.parseInt((String) mtvalue4.getText());
                value5 = Integer.parseInt((String) mtvalue5.getText());
                value6 = Integer.parseInt((String) mtvalue6.getText());
                value7 = Integer.parseInt((String) mtvalue7.getText());
                value8 = Integer.parseInt((String) mtvalue8.getText());

                result = value1 + value2 + value3 + value4 + value5 + value6 + value7 + value8;
                valuetext.setText(""+result+"");

                if (result>=0 && result <10){
                    new AlertDialog.Builder(Mentalquestionnaire.this)
                            .setTitle("問卷結束")
                            .setMessage("您今日狀態不錯，請繼續保持！")
                            .setPositiveButton("確定", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {

                                }
                            })
                            .show();
                }
                else if (result>=10 && result<20){
                    new AlertDialog.Builder(Mentalquestionnaire.this)
                            .setTitle("問卷結束")
                            .setMessage("有些微壓力緊張，可以多做一些放鬆身心讓自己愉快的事，像是看看劇聽聽音樂都很好！")
                            .setPositiveButton("確定", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {

                                }
                            })
                            .show();
                }
                else if (result>=20 && result<30){
                    new AlertDialog.Builder(Mentalquestionnaire.this)
                            .setTitle("問卷結束")
                            .setMessage("今天還滿壓力緊張的！一定要放鬆心情，保持心情愉悅！多做一些放鬆愉快的事，如果有需要一定要尋求家人朋友傾聽，或是專業協助！")
                            .setPositiveButton("確定", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {

                                }
                            })
                            .show();
                }
                else {
                    new AlertDialog.Builder(Mentalquestionnaire.this)
                            .setTitle("問卷結束")
                            .setMessage("不要太緊張跟擔心！如果有需要可以撥打XXXX-XXXX尋求專業協助！放鬆一點！一定沒事的！")
                            .setPositiveButton("確定", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {

                                }
                            })
                            .show();
                }

            }
        });

    }

    public void mcomplete(View view){
        intent = new Intent(this, Questionnaire.class);
        startActivity(intent);
    }
}
