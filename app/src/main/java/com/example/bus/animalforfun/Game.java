package com.example.bus.animalforfun;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Game extends AppCompatActivity {

    //explicit
    Button btn1,btn2,btn3,btn4;
    ImageView questionImageView;
    MediaPlayer mediaPlayer;
    ImageButton volumnImageButton;
    int questionCount = 10;
    ArrayList<Integer> qID = new ArrayList<Integer>();
    String answer;
    int score = 0;
    String Name;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        //initial view
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        questionImageView = (ImageView) findViewById(R.id.imvQuestion);
        volumnImageButton = (ImageButton) findViewById(R.id.imbVolumn);

        for (int i = 1; i <= questionCount; i++) {
            qID.add(i); //จองพื้นที่หน่วยความจำข้อคำถาม
        }
        Collections.shuffle(qID);
        setQuestion(qID.remove(0));
    } //main method

    private void setQuestion(Integer qID) {
        if (qID == 1) {
            answer = "นก";
            questionImageView.setImageResource(R.drawable.bird_02);
            mediaPlayer = MediaPlayer.create(this,R.raw.bird);

            ArrayList<String> choice = new ArrayList<String>();
            choice.add("นก");
            choice.add("หมู");
            choice.add("แกะ");
            choice.add("วัว");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 2) {
            answer = "แมว";
            questionImageView.setImageResource(R.drawable.cat_02);
            mediaPlayer = MediaPlayer.create(this,R.raw.cat);

            ArrayList<String> choice = new ArrayList<String>();
            choice.add("แมว");
            choice.add("หมู");
            choice.add("สุนัข");
            choice.add("ม้า");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 3) {
            answer = "วัว";
            questionImageView.setImageResource(R.drawable.cow_02);
            mediaPlayer = MediaPlayer.create(this,R.raw.cow);

            ArrayList<String> choice = new ArrayList<String>();
            choice.add("นก");
            choice.add("หมู");
            choice.add("ยุง");
            choice.add("วัว");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 4) {
            answer = "สุนัข";
            questionImageView.setImageResource(R.drawable.dog_02);
            mediaPlayer = MediaPlayer.create(this,R.raw.dog);

            ArrayList<String> choice = new ArrayList<String>();
            choice.add("สุนัข");
            choice.add("แมว");
            choice.add("แกะ");
            choice.add("นก");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 5) {
            answer = "ช้าง";
            questionImageView.setImageResource(R.drawable.elephant_02);
            mediaPlayer = MediaPlayer.create(this,R.raw.elephant);

            ArrayList<String> choice = new ArrayList<String>();
            choice.add("ช้าง");
            choice.add("สิงโต");
            choice.add("หมู");
            choice.add("วุง");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 6) {
            answer = "ม้า";
            questionImageView.setImageResource(R.drawable.horse_02);
            mediaPlayer = MediaPlayer.create(this,R.raw.horse);

            ArrayList<String> choice = new ArrayList<String>();
            choice.add("ม้า");
            choice.add("นก");
            choice.add("สิงโต");
            choice.add("แกะ");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 7) {
            answer = "สิงโต";
            questionImageView.setImageResource(R.drawable.lion_02);
            mediaPlayer = MediaPlayer.create(this,R.raw.lion);

            ArrayList<String> choice = new ArrayList<String>();
            choice.add("สิงโต");
            choice.add("หมู");
            choice.add("ม้า");
            choice.add("แกะ");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 8) {
            answer = "ยุง";
            questionImageView.setImageResource(R.drawable.mosquito_02);
            mediaPlayer = MediaPlayer.create(this,R.raw.mosquito);

            ArrayList<String> choice = new ArrayList<String>();
            choice.add("ยุง");
            choice.add("ม้า");
            choice.add("นก");
            choice.add("ช้าง");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 9) {
            answer = "หมู";
            questionImageView.setImageResource(R.drawable.pig_02);
            mediaPlayer = MediaPlayer.create(this,R.raw.pig);

            ArrayList<String> choice = new ArrayList<String>();
            choice.add("หมู");
            choice.add("ม้า");
            choice.add("แกะ");
            choice.add("สิงโต");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 10) {
            answer = "แกะ";
            questionImageView.setImageResource(R.drawable.sheep_02);
            mediaPlayer = MediaPlayer.create(this,R.raw.sheep);

            ArrayList<String> choice = new ArrayList<String>();
            choice.add("แกะ");
            choice.add("ม้า");
            choice.add("นก");
            choice.add("วัว");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }

    } //End setQuestion Method

    public void choiceAns(View view){ //method ตรวจคำตอบ
        Button button = (Button) view;
        String buttonString = button.getText().toString(); //ทำหน้าที่เก็บตัวแปลบนปุ่มเก็บในตัวแปลbuttonString
        if (buttonString.equals(answer)) {
            score++;
        }
        if (qID.isEmpty()) { //เช็คทำครบทุกข้อแล้วหรือยัง
            dialogBoxScore();
        } else {             //ถ้าไม่ครบ
            setQuestion(qID.remove(0));
        }
    } //end choiceAns method

    private void dialogBoxScore() { //methodแสดงคะแนน
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        String Name = getIntent().getStringExtra("userName");
        builder.setTitle("สรุปคะแนน");
        builder.setMessage("คุณ" + Name + "ได้" + score +"คะแนน")
        .setCancelable(false)
        .setPositiveButton("ออกจากเกม", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            } //ออกจากหน้าActivity
        })
        .setNegativeButton("เล่นอีกครั้ง", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = getIntent();
                finish();
                startActivity(intent);
            }
        });

        AlertDialog alertDialog = builder.create();
        alertDialog.show();

    }// end dialogBoxScore method

    public void playSound(View view){
        mediaPlayer.start();
    } //End playsound method

} //main class
