package ipn.cecyt9.practica1_calculadora;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    Double numberX, numberY, result;
    String operator;

    public void onClickButton0(View myView) {
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText(value + "0");
    }
    public void onClickButton1(View myView) {
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText(value + "1");
    }
    public void onClickButton2(View myView) {
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText(value + "2");
    }
    public void onClickButton3(View myView) {
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText(value + "3");
    }
    public void onClickButton4(View myView) {
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText(value + "4");
    }
    public void onClickButton5(View myView) {
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText(value + "5");
    }
    public void onClickButton6(View myView) {
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText(value + "6");
    }
    public void onClickButton7(View myView) {
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText(value + "7");
    }
    public void onClickButton8(View myView) {
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText(value + "8");
    }
    public void onClickButton9(View myView) {
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText(value + "9");
    }
    public void onClickButtonDot(View myView) {
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText(value + ".");
    }


    public void onClickOperatorCaptureNumberX(View myView) {
        TextView tv = (TextView) findViewById(R.id.textView);
        numberX = Double.parseDouble(tv.getText().toString());
        tv.setText("");
    }

    public void onClickSum(View myView) {
        operator = "+";
        onClickOperatorCaptureNumberX(myView);
    }
    public void onClickMinus(View myView) {
        operator = "-";
        onClickOperatorCaptureNumberX(myView);
    }
    public void onClickMulti(View myView) {
        operator = "x";
        onClickOperatorCaptureNumberX(myView);
    }
    public void onClickDivision(View myView) {
        operator = "/";
        onClickOperatorCaptureNumberX(myView);
    }


    public void onClickEqual(View myView) {
        TextView tv = (TextView) findViewById(R.id.textView);
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
        } catch(NullPointerException e) {
            Toast.makeText(this,"Incorrect Number", Toast.LENGTH_SHORT).show();
        }
    }

    public void onClickButtonClear(View myView) {
        TextView tv = (TextView) findViewById(R.id.textView);
        tv.setText("");
    }


}