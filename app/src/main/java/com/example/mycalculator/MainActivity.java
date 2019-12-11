package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button one, two, three, four, five, six, seven, eight, nine, plus, minus, multiplication, division, equals, clear, dot;
    TextView result;

    double num1, num2;
    String operation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        one = findViewById(R.id.btn_one);
        two = findViewById(R.id.btn_two);
        three = findViewById(R.id.btn_three);
        four = findViewById(R.id.btn_four);
        five = findViewById(R.id.btn_five);
        six = findViewById(R.id.btn_six);
        seven = findViewById(R.id.btn_seven);
        eight = findViewById(R.id.btn_eight);
        nine = findViewById(R.id.btn_nine);
        plus = findViewById(R.id.btn_plus);
        minus = findViewById(R.id.btn_minus);
        multiplication = findViewById(R.id.btn_multiplication);
        division = findViewById(R.id.btn_division);
        equals = findViewById(R.id.btn_equals);
        clear = findViewById(R.id.btn_clear);
        result = findViewById(R.id.result);
        dot = findViewById(R.id.btn_dot);

        View.OnClickListener ocl = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.btn_one:
                        result.append(one.getText().toString());
                        break;
                    case R.id.btn_two:
                        result.append(two.getText().toString());
                        break;
                    case R.id.btn_three:
                        result.append(three.getText().toString());
                        break;
                    case R.id.btn_four:
                        result.append(four.getText().toString());
                        break;
                    case R.id.btn_five:
                        result.append(five.getText().toString());
                        break;
                    case R.id.btn_six:
                        result.append(six.getText().toString());
                        break;
                    case R.id.btn_seven:
                        result.append(seven.getText().toString());
                        break;
                    case R.id.btn_eight:
                        result.append(eight.getText().toString());
                        break;
                    case R.id.btn_nine:
                        result.append(nine.getText().toString());
                        break;
                        case R.id.btn_dot:
                        result.append(dot.getText().toString());
                        break;

                    case R.id.btn_plus:
                        num1 = Double.parseDouble(result.getText().toString());
                        result.setText("");
                        operation = "+";
                        break;
                    case R.id.btn_minus:
                        num1 = Double.parseDouble(result.getText().toString());
                        result.setText("");
                        operation = "-";
                        break;
                    case R.id.btn_multiplication:
                        num1 = Double.parseDouble(result.getText().toString());
                        result.setText("");
                        operation = "*";
                        break;
                    case R.id.btn_division:
                        num1 = Double.parseDouble(result.getText().toString());
                        result.setText("");
                        operation = "/";
                        break;
                    case R.id.btn_equals:
                        num2 = Double.parseDouble(result.getText().toString());

                        if (operation == "+") {
                            result.setText(Double.toString(num1 + num2));
                        } else if (operation == "-") {
                            result.setText(Double.toString(num1 - num2));
                        } else if (operation == "/") {
                            result.setText(Double.toString(num1 / num2));
                        } else if (operation == "*") {
                            result.setText(Double.toString(num1 * num2));
                        }
                        break;


                }
            }
        };

        one.setOnClickListener(ocl);
        two.setOnClickListener(ocl);
        three.setOnClickListener(ocl);
        four.setOnClickListener(ocl);
        five.setOnClickListener(ocl);
        six.setOnClickListener(ocl);
        seven.setOnClickListener(ocl);
        eight.setOnClickListener(ocl);
        nine.setOnClickListener(ocl);
        plus.setOnClickListener(ocl);
        minus.setOnClickListener(ocl);
        division.setOnClickListener(ocl);
        multiplication.setOnClickListener(ocl);
        equals.setOnClickListener(ocl);
        clear.setOnClickListener(ocl);
        dot.setOnClickListener(ocl);
    }
}
