package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    int turn = 1;
    int [] [] array = new int[3] [3];
    int [][] winPosition = {
            {array[0][0] , array[0][1] , array[0][2] } ,
            {array[1][0] , array[1][1] , array[1][2] } ,
            {array[2][0] , array[2][1] , array[2][2] } ,
            {array[0][0] , array[1][0] , array[2][0] } ,
            {array[0][1] , array[1][1] , array[2][1] } ,
            {array[0][2] , array[1][2] , array[2][2] } ,
            {array[0][0] , array[1][1] , array[2][2] } ,
            {array[2][0] , array[1][1] , array[0][2] } ,
    };
    public static final String EXTRA_NAME = "com.example.myapplication.extra_NAME";
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        // Well Done Bro
        ImageButton b00 = findViewById(R.id.button00);
        ImageButton b01 = findViewById(R.id.button01);
        ImageButton b02= findViewById(R.id.button02);
        ImageButton b10 = findViewById(R.id.button10);
        ImageButton b11 = findViewById(R.id.button11);
        ImageButton b12 = findViewById(R.id.button12);
        ImageButton b20 = findViewById(R.id.button20);
        ImageButton b21 = findViewById(R.id.button21);
        ImageButton b22 = findViewById(R.id.button22);

        b00.setOnClickListener(v -> {
            if(array [0] [0] != 0 ) return;
            array[0][0] = turn % 2 == 0 ? 2 : 1;
            b00.setBackgroundResource(turn % 2 == 0 ? R.drawable.o : R.drawable.x);
            turn ++;
            winCondition();
        });
        b01.setOnClickListener(v -> {
            if(array [0] [1] != 0 ) return;
            array[0][1] = turn % 2 == 0 ? 2 : 1;
            b01.setBackgroundResource(turn % 2 == 0 ? R.drawable.o : R.drawable.x);
            turn ++;
            winCondition();
        });
        b02.setOnClickListener(v -> {
            if(array [0] [2] != 0) return;
            array[0][2] = turn % 2 == 0 ? 2 : 1;
            b02.setBackgroundResource(turn % 2 == 0 ? R.drawable.o : R.drawable.x);
            turn ++;
            winCondition();
        });
        b10.setOnClickListener(v -> {
            if(array [1] [0] != 0 ) return;
            array[1][0] = turn % 2 == 0 ? 2 : 1;
            b10.setBackgroundResource(turn % 2 == 0 ? R.drawable.o : R.drawable.x);
            turn ++;
            winCondition();
        });
        b11.setOnClickListener(v -> {
            if(array [1] [1] != 0) return;
            array[1][1] = turn % 2 == 0 ? 2 : 1;
            b11.setBackgroundResource(turn % 2 == 0 ? R.drawable.o : R.drawable.x);
            turn ++;
            winCondition();
        });
        b12.setOnClickListener(v -> {
            if(array [1][2] != 0) return;
            array[1][2] = turn % 2 == 0 ? 2 : 1;
            b12.setBackgroundResource(turn % 2 == 0 ? R.drawable.o : R.drawable.x);
            turn ++;
            winCondition();
        });
        b20.setOnClickListener(v -> {
            if(array [2] [0] != 0 ) return;
            array[2][0] = turn % 2 == 0 ? 2 : 1;
            b20.setBackgroundResource(turn % 2 == 0 ? R.drawable.o : R.drawable.x);
            turn ++;
            winCondition();
        });
        b21.setOnClickListener(v -> {
            if(array [2] [1] != 0 ) return;
            array[2][1] = turn % 2 == 0 ? 2 : 1;
            b21.setBackgroundResource(turn % 2 == 0 ? R.drawable.o : R.drawable.x);
            turn ++;
            winCondition();
        });
        b22.setOnClickListener(v -> {
            if(array [2] [2] != 0 ) return;
            array[2][2] = turn % 2 == 0 ? 2 : 1;
            b22.setBackgroundResource(turn % 2 == 0 ? R.drawable.o : R.drawable.x);
            turn ++;
            winCondition();
        });
    }

     void winCondition() {
         for (int[] ignored : winPosition) {
             String winner;
             if (array[0][0] == array[0][1] && array[0][1] == array[0][2] && array[0][2] != 0) {
                 if (array[0][0] == 1){
                     winner = "Player 1 ";
                 }else {
                     winner = "Player 2";
                 }
                 Intent intent = new Intent(this, MainActivity3.class);
                 intent.putExtra(EXTRA_NAME ,winner);
                 startActivity(intent);

             }
             else if (array[1][0] == array[1][1] && array[1][1] == array[1][2] && array[1][0] != 0 ){
                 if (array[1][0] == 1){
                     winner = "Player 1 ";
                 }else {
                     winner = "Player 2";
                 }
                 Intent intent = new Intent(this, MainActivity3.class);
                 intent.putExtra(EXTRA_NAME ,winner);
                 startActivity(intent);
             }
             else if (array[2][0] == array[2][1] && array[2][1] == array[2][2] && array[2][0] != 0 ){
                 if (array[2][0] == 1){
                     winner = "Player 1 ";
                 }else {
                     winner = "Player 2";
                 }
                 Intent intent = new Intent(this, MainActivity3.class);
                 intent.putExtra(EXTRA_NAME ,winner);
                 startActivity(intent);
             }
             else if (array[0][0] == array[1][0] && array[1][0] == array[2][0] && array[2][0] != 0 ){
                 if (array[0][0] == 1){
                     winner = "Player 1 ";
                 }else {
                     winner = "Player 2";
                 }
                 Intent intent = new Intent(this, MainActivity3.class);
                 intent.putExtra(EXTRA_NAME ,winner);
                 startActivity(intent);
             }
             else if (array[0][1] == array[1][1] && array[1][1] == array[2][1] && array[2][1] != 0 ){
                 if (array[0][1] == 1){
                     winner = "Player 1 ";
                 }else {
                     winner = "Player 2";
                 }
                 Intent intent = new Intent(this, MainActivity3.class);
                 intent.putExtra(EXTRA_NAME ,winner);
                 startActivity(intent);
             }
             else if (array[0][2] == array[1][2] && array[1][2] == array[2][2] && array[2][2] != 0 ){
                 if (array[0][2] == 1){
                     winner = "Player 1 ";
                 }else {
                     winner = "Player 2";
                 }
                 Intent intent = new Intent(this, MainActivity3.class);
                 intent.putExtra(EXTRA_NAME ,winner);
                 startActivity(intent);
             }
             else if (array[0][0] == array[1][1] && array[1][1] == array[2][2] && array[2][2] != 0 ){
                 if (array[0][0] == 1){
                     winner = "Player 1 ";
                 }else {
                     winner = "Player 2";
                 }
                 Intent intent = new Intent(this, MainActivity3.class);
                 intent.putExtra(EXTRA_NAME ,winner);
                 startActivity(intent);
             }
             else if (array[2][0] == array[1][1] && array[1][1] == array[0][2] && array[2][0] != 0 ){
                 if (array[2][0] == 1){
                     winner = "Player 1 ";
                 }else {
                     winner = "Player 2";
                 }
                 Intent intent = new Intent(this, MainActivity3.class);
                 intent.putExtra(EXTRA_NAME ,winner);
                 startActivity(intent);
             }
             else if(turn == 9 ){
                 Toast.makeText(this, " Match draw", Toast.LENGTH_SHORT).show();
                 Intent intent = new Intent(this, MainActivity.class);
                 startActivity(intent);
             }
         }
     }
}