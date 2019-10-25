package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private final int DIVIDE = 0;
    private final int ADD = 1;
    private final int SUBTRACT = 2;
    private final int REMAINDER = 3;
    private final int MULTIPLY = 4;

    private TextView answerTextView;
    private float answerValue = 0.0f;
    private float firstValue = 0.0f;
    private float secondValue = 0.0f;
    private int operater = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        answerTextView = findViewById(R.id.main_textview);
    }

    private void clearField(){
        answerTextView.setText("0");
        firstValue = 0f;
        secondValue = 0f;
        operater = 0;
        answerValue = 0f;
    }

    private void setOperater(int operater){
        this.operater = operater;
        firstValue = Float.parseFloat(answerTextView.getText().toString());
        answerTextView.setText("0");
    }

    private void calculate(){
        this.operater = operater;
        secondValue = Float.parseFloat(answerTextView.getText().toString());

        switch(operater){
            case ADD:
                answerValue = firstValue + secondValue;
                break;

            case SUBTRACT:
                answerValue = firstValue - secondValue;
                break;

            case DIVIDE:
                answerValue = firstValue / secondValue;
                break;

            case MULTIPLY:
                answerValue = firstValue * secondValue;
                break;


        }
        answerTextView.setText(answerValue + "");

        //answerTextView.setText("0");
    }

    private void addNumber(int value){
        if(answerTextView.getText().equals("0"))
            answerTextView.setText("");


        answerTextView.setText(answerTextView.getText().toString() + value);
    }

    private void removeNumber(){
        if(answerTextView.getText().toString().trim().length() > 0 && !answerTextView.getText().toString().equals("0"))
            answerTextView.setText(answerTextView.getText().toString().substring(0, answerTextView.length() - 1));
    }

    public void onClick(View view) {
        switch(view.getId() ){
            case R.id.clear_button:
                clearField();

                break;

            case R.id.add_button:

                setOperater(ADD);

                break;

            case R.id.subtract_button:

                setOperater(SUBTRACT);

                break;

            case R.id.zero_button:

                addNumber( 0);

                break;

            case R.id.one_button:

                addNumber( 1);


                break;

            case R.id.two_button:

                addNumber( 2);


                break;

            case R.id.three_button:

                addNumber( 3);


                break;

            case R.id.four_button:

                addNumber( 4);


                break;

            case R.id.five_button:

                addNumber( 5);


                break;

            case R.id.six_button:

                addNumber( 6);


                break;

            case R.id.seven_button:

                addNumber( 7);


                break;

            case R.id.eight_button:

                addNumber( 8);


                break;

            case R.id.nine_button:

                addNumber( 9);


                break;


            case R.id.equal_button:

                calculate();

                break;

            case R.id.back_button:

                removeNumber();

                break;

            case R.id.divide_button:

                setOperater(DIVIDE);

                break;

            case R.id.multiply_button:

                setOperater(MULTIPLY);

                break;

        }
    }
}
