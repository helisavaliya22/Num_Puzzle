package com.example.num_puzzle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,reset;
    TextView display,win;
    String b1,b2,b3,b4,b5,b6,b7,b8,b9;
    ArrayList list=new ArrayList<>();
    int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = findViewById(R.id.display);
        win = findViewById(R.id.win);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        reset = findViewById(R.id.reset);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        reset.setOnClickListener(this);
        reset();
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == reset.getId())
        {
            reset();
        }

        b1 = btn1.getText().toString();
        b2 = btn2.getText().toString();
        b3 = btn3.getText().toString();
        b4 = btn4.getText().toString();
        b5 = btn5.getText().toString();
        b6 = btn6.getText().toString();
        b7 = btn7.getText().toString();
        b8 = btn8.getText().toString();
        b9 = btn9.getText().toString();

        if(v.getId() == btn1.getId())
        {
            if (b2.isEmpty())
            {
                btn2.setText(b1);
                btn1.setText("");
                win();
            }
            if(b4.isEmpty())
            {
                btn4.setText(b1);
                btn1.setText("");
                win();
            }
        }

        if(v.getId() == btn2.getId())
        {
            if (b1.isEmpty())
            {
                btn1.setText(b2);
                btn2.setText("");
                win();
            }
            if (b3.isEmpty())
            {
                btn3.setText(b2);
                btn2.setText("");
                win();
            }
            if (b5.isEmpty())
            {
                btn5.setText(b2);
                btn2.setText("");
                win();
            }
        }

        if (v.getId() == btn3.getId())
        {
            if (b2.isEmpty())
            {
                btn2.setText(b3);
                btn3.setText("");
                win();
            }
            if (b6.isEmpty())
            {
                btn6.setText(b3);
                btn3.setText("");
                win();
            }
        }

        if (v.getId() == btn4.getId())
        {
            if (b1.isEmpty())
            {
                btn1.setText(b4);
                btn4.setText("");
                win();
            }
            if (b5.isEmpty())
            {
                btn5.setText(b4);
                btn4.setText("");
                win();
            }
            if (b7.isEmpty())
            {
                btn7.setText(b4);
                btn4.setText("");
                win();
            }
        }

        if (v.getId() == btn5.getId())
        {
            if (b2.isEmpty())
            {
                btn2.setText(b5);
                btn5.setText("");
                win();
            }
            if (b4.isEmpty())
            {
                btn4.setText(b5);
                btn5.setText("");
                win();
            }
            if (b6.isEmpty())
            {
                btn6.setText(b5);
                btn5.setText("");
                win();
            }
            if (b8.isEmpty())
            {
                btn8.setText(b5);
                btn5.setText("");
                win();
            }
        }
        if (v.getId() == btn6.getId())
        {
            if (b3.isEmpty())
            {
                btn3.setText(b6);
                btn6.setText("");
                win();
            }
            if (b5.isEmpty())
            {
                btn5.setText(b6);
                btn6.setText("");
                win();
            }
            if (b9.isEmpty())
            {
                btn9.setText(b6);
                btn6.setText("");
                win();
            }
        }
        if (v.getId() == btn7.getId())
        {
            if (b4.isEmpty())
            {
                btn4.setText(b7);
                btn7.setText("");
                win();
            }
            if (b8.isEmpty())
            {
                btn8.setText(b7);
                btn7.setText("");
                win();
            }
        }
        if (v.getId() == btn8.getId())
        {
            if (b7.isEmpty())
            {
                btn7.setText(b8);
                btn8.setText("");
                win();
            }
            if (b5.isEmpty())
            {
                btn5.setText(b8);
                btn8.setText("");
                win();
            }
            if (b9.isEmpty())
            {
                btn9.setText(b8);
                btn8.setText("");
                win();
            }
        }
        if (v.getId() == btn9.getId())
        {
            if (b6.isEmpty())
            {
                btn6.setText(b9);
                btn9.setText("");
                win();
            }
            if (b8.isEmpty())
            {
                btn8.setText(b9);
                btn9.setText("");
                win();
            }
        }
    }
    private void win()
    {
        if (b1.equals("1") && b2.equals("2") && b3.equals("3") &&
            b4.equals("4") && b5.equals("5") && b6.equals("6") &&
            b7.equals("7") && b8.equals("8") && b9.equals(""))
        {
            win.setText("Puzzle Solve");
        }
        else
        {
            win.setText("Continue");
        }
    }

    private void reset()
    {
        list.clear();
        count=0;
        while(count<9)
        {
            int max=10;
            int min=1;
            int r= new Random().nextInt(max-min)+min;
            System.out.println(r);
            if(list.isEmpty())
            {
                list.add(r);
                count++;
                System.out.println("count"+count);
            }
            if(!list.contains(r))
            {
                list.add(r);
                count++;
            }
        }
        btn1.setText(""+list.get(0));
        btn2.setText(""+list.get(1));
        btn3.setText(""+list.get(2));
        btn4.setText(""+list.get(3));
        btn5.setText(""+list.get(4));
        btn6.setText(""+list.get(5));
        btn7.setText(""+list.get(6));
        btn8.setText(""+list.get(7));
        btn9.setText(""+list.get(8));

        for (int i=0;i<list.size();i++)
        {
            if(list.get(i).equals(9))
            {
                int id = getResources().getIdentifier("btn"+(i+1),"id",getPackageName());
                Button b1 = findViewById(id);
                b1.setText("");
            }
        }
    }
}