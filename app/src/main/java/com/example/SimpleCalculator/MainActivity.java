package com.example.SimpleCalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.varshastro.R;
import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    float a,b,sol;
    boolean add,sub,mul,div,mod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simplecalc);

        TextView et1 = findViewById(R.id.result_textv);
        TextView et2 = findViewById(R.id.ope_tv);
        MaterialButton b0 = findViewById(R.id.button_zero);
        MaterialButton b1 = findViewById(R.id.button_one);
        MaterialButton b2 = findViewById(R.id.button_two);
        MaterialButton b3 = findViewById(R.id.button_three);
        MaterialButton b4 = findViewById(R.id.button_four);
        MaterialButton b5 = findViewById(R.id.button_five);
        MaterialButton b6 = findViewById(R.id.button_six);
        MaterialButton b7 = findViewById(R.id.button_seven);
        MaterialButton b8 = findViewById(R.id.button_eight);
        MaterialButton b9 = findViewById(R.id.button_nine);
        MaterialButton badd = findViewById(R.id.button_add);
        MaterialButton bsub = findViewById(R.id.button_subtract);
        MaterialButton bmul = findViewById(R.id.button_multiply);
        MaterialButton bdiv = findViewById(R.id.button_divide);
        MaterialButton bmod = findViewById(R.id.button_modulus);
        MaterialButton beq = findViewById(R.id.button_equals);
        MaterialButton bc = findViewById(R.id.button_C);
        MaterialButton bac = findViewById(R.id.button_AC);
        MaterialButton bdot = findViewById(R.id.button_point);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et1.setText(et1.getText() + "1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et1.setText(et1.getText() + "2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et1.setText(et1.getText() + "3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et1.setText(et1.getText() + "4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et1.setText(et1.getText() + "5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et1.setText(et1.getText() + "6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et1.setText(et1.getText() + "7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et1.setText(et1.getText() + "8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et1.setText(et1.getText() + "9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et1.setText(et1.getText() + "0");
            }
        });
        bac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et1.setText("");
                et2.setText("");
            }
        });
        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et1.setText(et1.getText().toString().substring(0,et1.getText().length()-1));
            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et1.setText(et1.getText() + ".");
            }
        });
        badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Float.parseFloat(et1.getText().toString());
                et1.setText("");
                et2.setText("+");
                add = true;
            }
        });
        bsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Float.parseFloat(et1.getText().toString());
                et1.setText("");
                et2.setText("-");
                sub = true;
            }
        });
        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Float.parseFloat(et1.getText().toString());
                et1.setText("");
                et2.setText("*");
                mul = true;
            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Float.parseFloat(et1.getText().toString());
                et1.setText("");
                et2.setText("/");
                div=true;
            }
        });
        bmod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Float.parseFloat(et1.getText().toString());
                et1.setText("");
                et2.setText("%");
                mod = true;
            }
        });
        beq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (add == true) {
                    b = Float.parseFloat(et1.getText().toString());
                    sol = a + b;
                    String ans = String.valueOf(sol);
                    if(ans.endsWith(".0"))
                    {
                        ans=ans.replace(".0","");
                    }
                    et1.setText(ans);
                    et2.setText("");
                    add = false;
                } else if (sub == true) {
                    b = Float.parseFloat(et1.getText().toString());
                    sol = a - b;
                    String ans = String.valueOf(sol);
                    if(ans.endsWith(".0"))
                    {
                        ans=ans.replace(".0","");
                    }
                    et1.setText(ans);
                    et2.setText("");
                    sub = false;
                } else if (mul == true) {
                    b = Float.parseFloat(et1.getText().toString());
                    sol = a * b;
                    String ans = String.valueOf(sol);
                    if(ans.endsWith(".0"))
                    {
                        ans=ans.replace(".0","");
                    }
                    et1.setText(ans);
                    et2.setText("");
                    mul = false;
                } else if (mod == true) {
                    b = Float.parseFloat(et1.getText().toString());
                    sol = a % b;
                    String ans = String.valueOf(sol);
                    if(ans.endsWith(".0"))
                    {
                        ans=ans.replace(".0","");
                    }
                    et1.setText(ans);
                    et2.setText("");
                    mul = false;
                } else if (div == true) {
                    b = Float.parseFloat(et1.getText().toString());
                    sol = a / b;
                    String ans = String.valueOf(sol);
                    if(ans.endsWith(".0"))
                    {
                        ans=ans.replace(".0","");
                    }
                    et1.setText(ans);
                    et2.setText("");
                    div = false;
                }


            }

        });
    }

    @Override
    public void onClick(View view) {

    }
}


