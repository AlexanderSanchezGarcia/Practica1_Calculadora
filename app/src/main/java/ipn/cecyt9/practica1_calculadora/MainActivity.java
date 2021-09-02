package ipn.cecyt9.practica1_calculadora;

import static java.lang.Math.cos;
import static java.lang.Math.sin;
import static java.lang.Math.tan;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    Double numberX, numberY, result;
    String operator;
    Boolean filter = true;

    public void onClickButton0(View myView) {
        if(filter = true) {
            TextView tv = findViewById(R.id.textView1);
            String value = tv.getText().toString();
            tv.setText(value + "0");
        }
    }
    public void onClickButton1(View myView) {
        if(filter = true) {
            TextView tv = findViewById(R.id.textView1);
            String value = tv.getText().toString();
            tv.setText(value + "1");
        }
    }
    public void onClickButton2(View myView) {
        if(filter = true) {
            TextView tv = findViewById(R.id.textView1);
            String value = tv.getText().toString();
            tv.setText(value + "2");
        }
    }
    public void onClickButton3(View myView) {
        if(filter = true) {
            TextView tv = findViewById(R.id.textView1);
            String value = tv.getText().toString();
            tv.setText(value + "3");
        }
    }
    public void onClickButton4(View myView) {
        if(filter = true) {
            TextView tv = findViewById(R.id.textView1);
            String value = tv.getText().toString();
            tv.setText(value + "4");
        }
    }
    public void onClickButton5(View myView) {
        if(filter = true) {
            TextView tv = findViewById(R.id.textView1);
            String value = tv.getText().toString();
            tv.setText(value + "5");
        }
    }
    public void onClickButton6(View myView) {
        if(filter = true) {
            TextView tv = findViewById(R.id.textView1);
            String value = tv.getText().toString();
            tv.setText(value + "6");
        }
    }
    public void onClickButton7(View myView) {
        if(filter = true) {
            TextView tv = findViewById(R.id.textView1);
            String value = tv.getText().toString();
            tv.setText(value + "7");
        }
    }
    public void onClickButton8(View myView) {
        if(filter = true) {
            TextView tv = findViewById(R.id.textView1);
            String value = tv.getText().toString();
            tv.setText(value + "8");
        }
    }
    public void onClickButton9(View myView) {
        if(filter = true) {
            TextView tv = findViewById(R.id.textView1);
            String value = tv.getText().toString();
            tv.setText(value + "9");
        }
    }
    public void onClickButtonDot(View myView) {
        if(filter = true) {
            TextView tv = findViewById(R.id.textView1);
            String value = tv.getText().toString();
            tv.setText(value + ".");
        }
    }


    public void onClickOperatorCaptureNumber(View myView) {
        TextView tv = (TextView) findViewById(R.id.textView1);
        numberX = Double.parseDouble(tv.getText().toString());
        tv.setText("");
    }

    public void onClickSum(View myView) {
        operator = "+";
        onClickOperatorCaptureNumber(myView);
    }
    public void onClickMinus(View myView) {
        operator = "-";
        onClickOperatorCaptureNumber(myView);
    }
    public void onClickMulti(View myView) {
        operator = "x";
        onClickOperatorCaptureNumber(myView);
    }
    public void onClickDivision(View myView) {
        operator = "/";
        onClickOperatorCaptureNumber(myView);
    }


    public void onClickEqual(View myView) {
        TextView tv = (TextView) findViewById(R.id.textView1);
        numberY = Double.parseDouble(tv.getText().toString());

        try {
            switch (operator) {
                case "+":
                    result = numberX + numberY;
                    break;
                case "-":
                    result = numberX - numberY;
                    break;
                case "x":
                    result = numberX * numberY;
                    break;
                case "/":
                    result = numberX / numberY;
                    break;
                default:
                    break;
            }
            tv.setText(result.toString());
            filter = false;
        } catch(NullPointerException e) {
            Toast.makeText(this,"Incorrect Number", Toast.LENGTH_SHORT).show();
        }
    }

    public void onClickButtonSen(View myView) {
        TextView tv = (TextView) findViewById(R.id.textView1);
        try {
            numberX = Double.parseDouble(tv.getText().toString());
            double numberXrd = Math.toRadians(numberX);
            result = Math.sin(numberXrd);
            tv.setText(String.valueOf(result));
            filter = false;
        } catch(NullPointerException e) {
            Toast.makeText(this,"Incorrect Number", Toast.LENGTH_SHORT).show();
        }
        tv.setText(result.toString());
    }
    public void onClickButtonCos(View myView) {
        TextView tv = (TextView) findViewById(R.id.textView1);
        try {
            numberX = Double.parseDouble(tv.getText().toString());
            double numberXrd = Math.toRadians(numberX);
            result = Math.sin(numberXrd);
            tv.setText(String.valueOf(result));
            filter = false;
        } catch(NullPointerException e) {
            Toast.makeText(this,"Incorrect Number", Toast.LENGTH_SHORT).show();
        }
        tv.setText(result.toString());
    }
    public void onClickButtonTan(View myView) {
        TextView tv = (TextView) findViewById(R.id.textView1);
        try {
            numberX = Double.parseDouble(tv.getText().toString());
            double numberXrd = Math.toRadians(numberX);
            result = Math.sin(numberXrd);
            tv.setText(String.valueOf(result));
            filter = false;
        } catch(NullPointerException e) {
            Toast.makeText(this,"Incorrect Number", Toast.LENGTH_SHORT).show();
        }
        tv.setText(result.toString());
    }

    public void onClickButtonClear(View myView) {
        TextView tv = (TextView) findViewById(R.id.textView1);
        tv.setText("");
        filter = true;
    }

}