package com.example.emma.calculator;

import android.icu.text.RelativeDateTimeFormatter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;

public class MainActivity extends AppCompatActivity {


    private Button mOneButton;
    private Button mEqualsButton;
    private Button mTwoButton;
    private Button mThreeButton;
    private Button mFourButton;
    private Button mFiveButton;
    private Button mSixButton;
    private Button mSevenButton;
    private Button mEightButton;
    private Button mNineButton;
    private Button mZeroButton;
    private Button mAddButton;
    private Button mDivisionButton;
    private Button mMultiplyButton;
    private Button mSubtractionButton;
    private Button mClearButton;
    private TextView mNumberTextView;
    private TextView mTimeTextView;


    public boolean checkDouble(double num){
        if (num == Double.NaN) {

            return true;
        }
        return false;
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        mTimeTextView = (TextView)findViewById(R.id.timetextview);
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        mTimeTextView.setText(dateFormat.format(date));



        mOneButton = (Button)findViewById(R.id.onebutton);
        mOneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mNumberTextView = (TextView)findViewById(R.id.number_text_view);
                mNumberTextView.setText(mNumberTextView.getText().toString() + String.valueOf(1));


            }
        });





        mTwoButton = (Button)findViewById(R.id.twobutton);
        mTwoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mNumberTextView = (TextView)findViewById(R.id.number_text_view);
                mNumberTextView.setText(mNumberTextView.getText().toString() + String.valueOf(2));


            }
        });


        mThreeButton = (Button)findViewById(R.id.threebutton);
        mThreeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mNumberTextView = (TextView)findViewById(R.id.number_text_view);
                mNumberTextView.setText(mNumberTextView.getText().toString() + String.valueOf(3));

            }
        });


        mFourButton = (Button)findViewById(R.id.fourbutton);
        mFourButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                mNumberTextView = (TextView)findViewById(R.id.number_text_view);
                mNumberTextView.setText(mNumberTextView.getText().toString() + String.valueOf(4));

            }
        });



      mFiveButton = (Button)findViewById(R.id.fivebutton);
        mFiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mNumberTextView = (TextView)findViewById(R.id.number_text_view);
                mNumberTextView.setText(mNumberTextView.getText().toString() + String.valueOf(5));
            }
        });



       mSixButton = (Button)findViewById(R.id.sixbutton);
        mSixButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mNumberTextView = (TextView)findViewById(R.id.number_text_view);
                mNumberTextView.setText(mNumberTextView.getText().toString() + String.valueOf(6));
            }
        });


        mSevenButton = (Button)findViewById(R.id.sevenbutton);
        mSevenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mNumberTextView = (TextView)findViewById(R.id.number_text_view);
                mNumberTextView.setText(mNumberTextView.getText().toString() + String.valueOf(7));
            }
        });


        mEightButton = (Button)findViewById(R.id.buttoneight);
        mEightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mNumberTextView = (TextView)findViewById(R.id.number_text_view);
                mNumberTextView.setText(mNumberTextView.getText().toString() + String.valueOf(8));

            }
        });


        mNineButton = (Button)findViewById(R.id.ninebutton);
        mNineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mNumberTextView = (TextView)findViewById(R.id.number_text_view);
                mNumberTextView.setText(mNumberTextView.getText().toString() + String.valueOf(9));
            }
        });

  mZeroButton = (Button)findViewById(R.id.zerobutton);
        mZeroButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mNumberTextView = (TextView)findViewById(R.id.number_text_view);
                mNumberTextView.setText(mNumberTextView.getText().toString() + String.valueOf(0));
            }
        });


// set up operation buttons

      mDivisionButton = (Button)findViewById(R.id.divisionbutton);
        mDivisionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mNumberTextView = (TextView)findViewById(R.id.number_text_view);
                mNumberTextView.setText(mNumberTextView.getText().toString() + "" + "/" + "");
            }
        });





   mSubtractionButton = (Button)findViewById(R.id.minusbutton);
        mSubtractionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mNumberTextView = (TextView)findViewById(R.id.number_text_view);
                mNumberTextView.setText(mNumberTextView.getText().toString() + "" + "-" + "");
            }
        });


     mAddButton = (Button)findViewById(R.id.addbutton);
        mAddButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mNumberTextView = (TextView)findViewById(R.id.number_text_view);
                mNumberTextView.setText(mNumberTextView.getText().toString() + "" + "+" + "");

            }
        });


        mMultiplyButton  = (Button)findViewById(R.id.multiply_button);
        mMultiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mNumberTextView = (TextView)findViewById(R.id.number_text_view);
                mNumberTextView.setText(mNumberTextView.getText().toString() + "" + "x" + "");


            }
        });










        mEqualsButton = (Button)findViewById(R.id.equals);
        mEqualsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            String numbers =     mNumberTextView.getText().toString();
                double result = 0.0;
                if (numbers.contains("/")) {

                    // if the user pressed division



                    StringTokenizer tokens = new StringTokenizer(numbers, "/");
                    double numberone = Double.parseDouble(tokens.nextToken());
                    double numbertwo = Double.parseDouble(tokens.nextToken());
                     result = numberone/numbertwo;

                }




                else if (numbers.contains("x")){

                    // if the user pressed multiplication
                    StringTokenizer tokens = new StringTokenizer(numbers, "x");
                    double numberone = Double.parseDouble(tokens.nextToken());
                    double numbertwo = Double.parseDouble(tokens.nextToken());
                     result = numberone * numbertwo;


                } else if (numbers.contains("-")) {

                    // if the user pressed subtraction


                    StringTokenizer tokens = new StringTokenizer(numbers, "-");
                    double numberone = Double.parseDouble(tokens.nextToken());
                    double numbertwo = Double.parseDouble(tokens.nextToken());

                   result = numberone - numbertwo;

                }


              else {

                    // if the user pressed addition


                    StringTokenizer tokens = new StringTokenizer(numbers, "+");
                    double numberone = Double.parseDouble(tokens.nextToken());
                    double numbertwo = Double.parseDouble(tokens.nextToken());
                    result = numberone + numbertwo;



                }


                  mNumberTextView = (TextView) findViewById(R.id.number_text_view);



                  // check to see if the result is an error - i.e. the user tried 1/0 which doesn't work
                  if (Double.POSITIVE_INFINITY == result) {

                      mNumberTextView.setText("ERROR");
                  }


                   else {

                      mNumberTextView.setText(String.valueOf(result));

                  }








            }
        });


        mClearButton = (Button)findViewById(R.id.clear_button);
        mClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mNumberTextView = (TextView)findViewById(R.id.number_text_view);
                mNumberTextView.setText("");
            }
        });


        


    }
}
