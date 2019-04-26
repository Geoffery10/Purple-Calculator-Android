package com.example.powellgeoffery_calculator;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.LightingColorFilter;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;
import android.view.Menu;


public class MainActivity extends AppCompatActivity {

    int color = Color.parseColor("#8229FF");

    Button zero;
    Button one;
    Button two;
    Button three;
    Button four;
    Button five;
    Button six;
    Button seven;
    Button eight;
    Button nine;
    Button decimal;

    Button plus;
    Button minus;
    Button multiply;
    Button percent;
    Button divide;
    Button equals;
    Button clear;
    Button back;

    TextView number1;
    //TextView number2;
    //TextView operator;
    TableRow numberBox;

    String leftString = "";
    String rightString = "";
    String operatorString = "";
    int decimalLeft = 0;
    int decimalRight = 0;

    String undo = "e";

    Boolean RightSide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RightSide = false;

        zero = findViewById(R.id.zeroBtn);
        one = findViewById(R.id.oneBtn);
        two = findViewById(R.id.twoBtn);
        three = findViewById(R.id.threeBtn);
        four = findViewById(R.id.fourBtn);
        five = findViewById(R.id.fiveBtn);
        six = findViewById(R.id.sixBtn);
        seven = findViewById(R.id.sevenBtn);
        eight = findViewById(R.id.eightBtn);
        nine = findViewById(R.id.nineBtn);
        decimal = findViewById(R.id.decimalBtn);

        plus = findViewById(R.id.plusBtn);
        minus = findViewById(R.id.minusBtn);
        multiply = findViewById(R.id.multiplyBtn);
        percent = findViewById(R.id.percent);
        divide = findViewById(R.id.divide);
        equals = findViewById(R.id.equalsBtn);
        clear = findViewById(R.id.clearBtn);
        back = findViewById(R.id.backBtn);

        number1 = findViewById(R.id.numTxt1);
        //number2 = findViewById(R.id.numTxt2);
        //operator = findViewById(R.id.OperTxt1);
        numberBox = findViewById(R.id.numberBox);

        number1.setSelected(true);

        zero.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                if (RightSide == false)
                {
                    String temp = leftString;
                    leftString = (temp + "0");
                    number1.setText(leftString);
                    undo = undo + "l";
                }
                else
                {
                    String temp = rightString;
                    rightString = (temp + "0");
                    number1.setText(leftString + operatorString + rightString);
                    undo = undo + "r";
                }
                Log.d("Left Side Button",leftString);
                Log.d("Right Side Button",rightString);
            }
        });
        one.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                if (RightSide == false)
                {
                    String temp = leftString;
                    leftString = (temp + "1");
                    number1.setText(leftString);
                    undo = undo + "l";
                }
                else
                {
                    String temp = rightString;
                    rightString = (temp + "1");
                    number1.setText(leftString + operatorString + rightString);
                    undo = undo + "r";
                }
                Log.d("Left Side Button",leftString);
                Log.d("Right Side Button",rightString);
            }
        });
        two.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                if (RightSide == false)
                {
                    String temp = leftString;
                    leftString = (temp + "2");
                    number1.setText(leftString);
                    undo = undo + "l";
                }
                else
                {
                    String temp = rightString;
                    rightString = (temp + "2");
                    number1.setText(leftString + operatorString + rightString);
                    undo = undo + "r";
                }
                Log.d("Left Side Button",leftString);
                Log.d("Right Side Button",rightString);
            }
        });
        three.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                if (RightSide == false)
                {
                    String temp = leftString;
                    leftString = (temp + "3");
                    number1.setText(leftString);
                    undo = undo + "l";
                }
                else
                {
                    String temp = rightString;
                    rightString = (temp + "3");
                    number1.setText(leftString + operatorString + rightString);
                    undo = undo + "r";
                }
                Log.d("Left Side Button",leftString);
                Log.d("Right Side Button",rightString);
            }
        });
        four.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                if (RightSide == false)
                {
                    String temp = leftString;
                    leftString = (temp + "4");
                    number1.setText(leftString);
                    undo = undo + "l";
                }
                else
                {
                    String temp = rightString;
                    rightString = (temp + "4");
                    number1.setText(leftString + operatorString + rightString);
                    undo = undo + "r";
                }
                Log.d("Left Side Button",leftString);
                Log.d("Right Side Button",rightString);
            }
        });
        five.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                if (RightSide == false)
                {
                    String temp = leftString;
                    leftString = (temp + "5");
                    number1.setText(leftString);
                    undo = undo + "l";
                }
                else
                {
                    String temp = rightString;
                    rightString = (temp + "5");
                    number1.setText(leftString + operatorString + rightString);
                    undo = undo + "r";
                }
                Log.d("Left Side Button",leftString);
                Log.d("Right Side Button",rightString);
            }
        });
        six.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                if (RightSide == false)
                {
                    String temp = leftString;
                    leftString = (temp + "6");
                    number1.setText(leftString);
                    undo = undo + "l";
                }
                else
                {
                    String temp = rightString;
                    rightString = (temp + "6");
                    number1.setText(leftString + operatorString + rightString);
                    undo = undo + "r";
                }
                Log.d("Left Side Button",leftString);
                Log.d("Right Side Button",rightString);
            }
        });
        seven.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                if (RightSide == false)
                {
                    String temp = leftString;
                    leftString = (temp + "7");
                    number1.setText(leftString);
                    undo = undo + "l";
                }
                else
                {
                    String temp = rightString;
                    rightString = (temp + "7");
                    number1.setText(leftString + operatorString + rightString);
                    undo = undo + "r";
                }
                Log.d("Left Side Button",leftString);
                Log.d("Right Side Button",rightString);
            }
        });
        eight.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                if (RightSide == false)
                {
                    String temp = leftString;
                    leftString = (temp + "8");
                    number1.setText(leftString);
                    undo = undo + "l";
                }
                else
                {
                    String temp = rightString;
                    rightString = (temp + "8");
                    number1.setText(leftString + operatorString + rightString);
                    undo = undo + "r";
                }
                Log.d("Left Side Button",leftString);
                Log.d("Right Side Button",rightString);
            }
        });
        nine.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                if (RightSide == false)
                {
                    String temp = leftString;
                    leftString = (temp + "9");
                    number1.setText(leftString);
                    undo = undo + "l";
                }
                else
                {
                    String temp = rightString;
                    rightString = (temp + "9");
                    number1.setText(leftString + operatorString + rightString);
                    undo = undo + "r";
                }
                Log.d("Left Side Button",leftString);
                Log.d("Right Side Button",rightString);
            }
        });

        decimal.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                if (RightSide == false)
                {
                    if(decimalLeft == 0)
                    {
                        if(leftString == "")
                        {
                            String temp = leftString;
                            leftString = (temp + "0.");
                            number1.setText(leftString);
                            decimalLeft = 1;
                            undo = undo + "ll";
                        }
                        else
                        {
                            String temp = leftString;
                            leftString = (temp + ".");
                            number1.setText(leftString);
                            decimalLeft = 1;
                            undo = undo + "l";
                        }
                    }
                }
                else
                {
                    if(decimalRight == 0)
                    {
                        if(leftString != "" && leftString != "-")
                        {
                            if(leftString == "")
                            {
                                String temp = rightString;
                                rightString = (temp + "0.");
                                number1.setText(leftString + operatorString + rightString);
                                decimalRight = 1;
                                undo = undo + "rr";
                            }
                            else
                            {
                                String temp = rightString;
                                rightString = (temp + ".");
                                number1.setText(leftString + operatorString + rightString);
                                decimalRight = 1;
                                undo = undo + "r";
                            }
                        }
                        else
                        {
                            Toast error = Toast.makeText(getApplicationContext(), "Missing Value..", Toast.LENGTH_SHORT);
                            error.show();
                        }
                    }
                }
                Log.d("Left Side Button",leftString);
                Log.d("Right Side Button",rightString);
            }
        });

        plus.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                if(leftString != "" && leftString != "-") {
                    String temp = leftString;
                    RightSide = true;
                    operatorString = "+";
                    number1.setText(temp + operatorString + rightString);
                    undo = undo + "o";
                }
                else
                {
                    Toast error = Toast.makeText(getApplicationContext(), "Missing Value..", Toast.LENGTH_SHORT);
                    error.show();
                }
                Log.d("Left Side Button",leftString);
                Log.d("Right Side Button",rightString);
            }
        });

        minus.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                String temp = leftString;

                if(leftString == "" && RightSide == false)
                {
                    leftString = "-";
                    number1.setText(leftString);
                    undo = undo + "l";
                }
                else if(rightString == "" && RightSide == true)
                {
                    rightString = "-";
                    number1.setText(leftString + operatorString + rightString);
                    undo = undo + "r";
                }
                else if(leftString != "" && leftString != "-")
                {
                    RightSide = true;
                    operatorString = "-";
                    number1.setText(temp + operatorString + rightString);
                    undo = undo + "o";
                }
                else
                {
                    Toast error = Toast.makeText(getApplicationContext(), "Missing Value..", Toast.LENGTH_SHORT);
                    error.show();
                }
                Log.d("Left Side Button",leftString);
                Log.d("Right Side Button",rightString);
            }
        });

        multiply.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                if(leftString != "" && leftString != "-") {
                    String temp = leftString;
                    RightSide = true;
                    operatorString = "*";
                    number1.setText(temp + operatorString + rightString);
                    undo = undo + "o";
                }
                else
                {
                    Toast error = Toast.makeText(getApplicationContext(), "Missing Value..", Toast.LENGTH_SHORT);
                    error.show();
                }
                Log.d("Left Side Button",leftString);
                Log.d("Right Side Button",rightString);
            }
        });

        percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(leftString != "" && leftString != "-") {
                    String temp = leftString;
                    RightSide = true;
                    operatorString = "%";
                    number1.setText(temp + operatorString + rightString);
                    undo = undo + "o";
                }
                else
                {
                    Toast error = Toast.makeText(getApplicationContext(), "Missing Value..", Toast.LENGTH_SHORT);
                    error.show();
                }
                Log.d("Left Side Button",leftString);
                Log.d("Right Side Button",rightString);
            }
        });

        divide.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                number1.setText(leftString + operatorString + rightString);

                if(leftString != "" && leftString != "-") {
                    String temp = leftString;
                    RightSide = true;
                    operatorString = "/";
                    number1.setText(temp + operatorString + rightString);
                    undo = undo + "o";
                }
                else
                {
                    Toast error = Toast.makeText(getApplicationContext(), "Missing Value..", Toast.LENGTH_SHORT);
                    error.show();
                }
                Log.d("Left Side Button",leftString);
                Log.d("Right Side Button",rightString);
            }
        });

        clear.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                number1.setText("");
                leftString = "";
                rightString = "";
                operatorString = "";
                decimalRight = 0;
                decimalLeft = 0;
                undo = "e";
                RightSide = false;
                Log.d("Left Side Button Clear",leftString);
                Log.d("Right Side Button Clear",rightString);
            }
        });

        equals.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Log.d("Left Side Equals B",leftString);
                Log.d("Right Side Equals B",rightString);
                float num1 = 0;
                float num2 = 0;
                Toast error;

                //Try is just incase there is an unknown error
                try {
                    if(leftString == "-") {
                        leftString = "-0";
                        undo = undo + "l";
                        Log.d("Convert -"," - to -0");
                    }

                    if(rightString == "-")
                    {
                        rightString = "-0";
                        undo = undo + "r";
                        Log.d("Convert -"," - to -0");
                    }

                    //if (undo.charAt(1) != 'o' || undo.charAt(1) != 'r')
                    //{ //This makes sure there is one number on the left to fix errors
                    switch(operatorString)
                    {
                        case "+":
                            if(rightString != "" && leftString != "")
                            {
                                num1 = Float.parseFloat(leftString);
                                num2 = Float.parseFloat(rightString);
                                number1.setText((num1 + num2) + "");
                                leftString = number1.getText()+"";
                                rightString = "";
                                operatorString = "";
                                decimalLeft = 0;
                                decimalRight = 0;
                                undo = "e";
                                RightSide = true;
                            }
                            else
                            {
                                error = Toast.makeText(getApplicationContext(), "Missing Value..", Toast.LENGTH_SHORT);
                                error.show();
                            }
                            break;
                        case "*":
                            if(rightString != "" && leftString != "")
                            {
                                num1 = Float.parseFloat(leftString);
                                num2 = Float.parseFloat(rightString);
                                number1.setText((num1 * num2) + "");
                                leftString = number1.getText()+"";
                                rightString = "";
                                operatorString = "";
                                decimalLeft = 0;
                                decimalRight = 0;
                                undo = "e";
                                RightSide = true;
                            }
                            else
                            {
                                error = Toast.makeText(getApplicationContext(), "Missing Value..", Toast.LENGTH_SHORT);
                                error.show();
                            }
                            break;
                        case "-":
                            if(rightString != "" && leftString != "")
                            {
                                num1 = Float.parseFloat(leftString);
                                num2 = Float.parseFloat(rightString);
                                number1.setText((num1 - num2) + "");
                                leftString = number1.getText()+"";
                                rightString = "";
                                operatorString = "";
                                decimalLeft = 0;
                                decimalRight = 0;
                                undo = "e";
                                RightSide = true;
                            }
                            else
                            {
                                error = Toast.makeText(getApplicationContext(), "Missing Value..", Toast.LENGTH_SHORT);
                                error.show();
                            }
                            break;
                        case "/":
                            if(rightString != "" && leftString != "")
                            {
                                num1 = Float.parseFloat(leftString);
                                num2 = Float.parseFloat(rightString);
                                if (num2 == 0)
                                {
                                    error = Toast.makeText(getApplicationContext(), "Can't divide by 0..", Toast.LENGTH_SHORT);
                                    error.show();
                                }
                                else
                                {
                                    number1.setText((num1 / num2) + "");
                                    leftString = number1.getText()+"";
                                    RightSide = true;
                                    rightString = "";
                                    operatorString = "";
                                    decimalLeft = 0;
                                    decimalRight = 0;
                                    undo = "e";
                                }
                            }
                            else
                            {
                                error = Toast.makeText(getApplicationContext(), "Missing Value..", Toast.LENGTH_SHORT);
                                error.show();
                            }
                            break;
                        case "%":
                            if(rightString != "")
                            {
                                num1 = Float.parseFloat(leftString);
                                num2 = Float.parseFloat(rightString);
                                number1.setText(((num1 / 100) * num2)+"");
                                leftString = number1.getText()+"";
                                rightString = "";
                                operatorString = "";
                                decimalLeft = 0;
                                decimalRight = 0;
                                undo = "e";
                                RightSide = true;
                            }
                            else
                            {
                                error = Toast.makeText(getApplicationContext(), "No Right Value..", Toast.LENGTH_SHORT);
                                error.show();
                            }
                            break;
                        default:
                            error = Toast.makeText(getApplicationContext(), "Missing values..", Toast.LENGTH_SHORT);
                            error.show();

                            //Might fix a crash from spamming equals?
                            number1.setText("");
                            leftString = "";
                            rightString = "";
                            operatorString = "";
                            decimalLeft = 0;
                            decimalRight = 0;
                            undo = "e";
                            RightSide = false;
                            //Might fix a crash from spamming equals?

                            break;
                    }
                    //}
                    //else
                    //{
                    //error = Toast.makeText(getApplicationContext(), "No Left Value..", Toast.LENGTH_SHORT);
                    //error.show();
                    //}
                } catch (NumberFormatException e) {
                    Toast.makeText(MainActivity.this, "ERROR", Toast.LENGTH_SHORT).show();
                    Log.d("Equals Try", String.valueOf(e));
                }
                Log.d("Left Side Equals A",leftString);
                Log.d("Right Side Equals A",rightString);
            }
        });

        back.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Log.d("Left Side Clear Before",leftString);
                Log.d("Operator Clear Before", operatorString);
                Log.d("Right Side Clear Before",rightString);
                Toast error;
                if (undo.length() != 0)
                {
                    String undoCase = undo.substring((undo.length() - 1), (undo.length()));
                    String isDecimal = "";
                    switch(undoCase)
                    {
                        case "l":
                            isDecimal = (leftString.substring((leftString.length() - 1), leftString.length()));
                            if(isDecimal.equals("."))
                            {
                                decimalLeft = 0;
                            }
                            leftString = leftString.substring(0, (leftString.length() - 1));
                            number1.setText(leftString + operatorString + rightString);
                            undo = undo.substring(0, (undo.length() - 1));
                            Log.d("Case", "l");
                            Log.d("Undo counter",undo);
                            Log.d("Left Side",leftString);
                            Log.d("Operator", operatorString);
                            Log.d("Right Side",rightString);
                            if(leftString == "")
                            {
                                RightSide = false;
                            }
                            break;
                        case "o":
                            operatorString = "";
                            number1.setText(leftString + operatorString + rightString);
                            undo = undo.substring(0, (undo.length() - 1));
                            RightSide = false;
                            Log.d("Case", "o");
                            Log.d("Undo counter",undo);
                            Log.d("Left Side",leftString);
                            Log.d("Operator", operatorString);
                            Log.d("Right Side",rightString);
                            break;
                        case "r":
                            isDecimal = (rightString.substring((rightString.length() - 1), rightString.length()));
                            if(isDecimal.equals("."))
                            {
                                decimalRight = 0;
                            }
                            rightString = rightString.substring(0, (rightString.length() - 1));
                            number1.setText(leftString + operatorString + rightString);
                            undo = undo.substring(0, (undo.length() - 1));
                            Log.d("Case", "o");
                            Log.d("Undo counter",undo);
                            Log.d("Left Side",leftString);
                            Log.d("Operator", operatorString);
                            Log.d("Right Side",rightString);
                            break;
                        case "e":
                            error = Toast.makeText(getApplicationContext(), "You can't undo anymore.", Toast.LENGTH_SHORT);
                            error.show();
                            Log.d("Case", "e");
                            Log.d("Undo counter",undo);
                            Log.d("Left Side",leftString);
                            Log.d("Operator", operatorString);
                            Log.d("Right Side",rightString);
                            break;
                        default:
                            error = Toast.makeText(getApplicationContext(), "Can't undo..", Toast.LENGTH_SHORT);
                            error.show();
                            Log.d("Case", "default");
                            Log.d("Undo counter DEFAULT",undo);
                            Log.d("Left Side",leftString);
                            Log.d("Operator", operatorString);
                            Log.d("Right Side",rightString);
                            break;
                    }
                }
                Log.d("Left Side Clear After",leftString);
                Log.d("Operator Clear After", operatorString);
                Log.d("Right Side Clear After",rightString);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
       getMenuInflater().inflate(R.menu.main_menu, menu);
       return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        int mul = Color.parseColor("#000000");
        switch (item.getItemId())
        {
            case R.id.Colors:
                break;
            case R.id.purpleMode:
                color = Color.parseColor("#8229FF");
                break;
            case R.id.redMode:
                color = Color.parseColor("#FF4141");
                break;
            case R.id.greenMode:
                color = Color.parseColor("#65D122");
                break;
            case R.id.blueMode:
            color = Color.parseColor("#2990FF");
            break;
            default:
                color = Color.parseColor("#8229FF");
                break;
        }
        equals.getBackground().setColorFilter(new LightingColorFilter(mul, color));
        numberBox.setBackgroundColor(color);
        return super.onOptionsItemSelected(item);
    }
}
