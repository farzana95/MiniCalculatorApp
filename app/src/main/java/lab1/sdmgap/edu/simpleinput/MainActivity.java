package lab1.sdmgap.edu.simpleinput;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
//Declaring Variable
    private EditText editText1, editText2;
    private Button sumButton, subButton, mulButton, divButton;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.input1);
        editText2 = findViewById(R.id.input2);
        result = findViewById(R.id.result);

        sumButton = findViewById(R.id.sumButton);
        subButton = findViewById(R.id.subButton);
        mulButton = findViewById(R.id.mulButton);
        divButton = findViewById(R.id.divButton);

        sumButton.setOnClickListener(this);
        subButton.setOnClickListener(this);
        mulButton.setOnClickListener(this);
        divButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String number1 = editText1.getText().toString();
        String number2 = editText2.getText().toString();

        double num1 = Double.parseDouble(number1);
        double num2 = Double.parseDouble(number2);

        if(view.getId()==R.id.sumButton){
            double sum = num1 + num2;
            result.setText("Result :"+sum);
        }
        if(view.getId()==R.id.subButton){
            double sub = num1 - num2;
            result.setText("Result :"+sub);
        }
        if(view.getId()==R.id.mulButton){
            double mul = num1 * num2;
            result.setText("Result :"+mul);
        }
        if(view.getId()==R.id.divButton){
            double div = num1 / num2;
            result.setText("Result :"+div);
        }
    }
}