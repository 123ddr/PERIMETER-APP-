package edu.cinec.myproj;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class trapezoid extends AppCompatActivity {

    Button Main5;
    Button Back5;

    EditText editTextHeight1;
    EditText editTextHeight2;
    EditText editTextHeight3;
    EditText editTextHeight4;

    EditText editTextResult;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trapezoid);


        Main5 = findViewById(R.id.myButtonTrapezoid);

        Back5 = findViewById(R.id.myButtonTrapezoidBack);


        Back5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(),MainActivity.class);
                startActivity(intent);
            }
        });


        // Initialize EditText views
        editTextHeight1 = findViewById(R.id.text1);
        editTextHeight2 = findViewById(R.id.text12);
        editTextHeight3 = findViewById(R.id.text13);
        editTextHeight4 = findViewById(R.id.text14);
        //editTextWidth = findViewById(R.id.text2);
        editTextResult = findViewById(R.id.text3);

        // Initialize the Button and set the click listener
        Button myButtonSquare = findViewById(R.id.myButtonTrapezoid);
        myButtonSquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the user-entered height and width from the EditText views
                String heightStr1 = editTextHeight1.getText().toString();
                String heightStr2 = editTextHeight2.getText().toString();
                String heightStr3 = editTextHeight3.getText().toString();
                String heightStr4 = editTextHeight4.getText().toString();
                //String widthStr = editTextWidth.getText().toString();

                // Check if the input is empty
                if (heightStr1.isEmpty() || heightStr2.isEmpty()|| heightStr3.isEmpty() || heightStr4.isEmpty()) {
                    editTextResult.setText("Please enter values for each sides");
                    return;
                }

                // Convert the input to numeric values
                double side1 = Double.parseDouble(heightStr1);
                double side2 = Double.parseDouble(heightStr2);
                double side3 = Double.parseDouble(heightStr3);
                double side4 = Double.parseDouble(heightStr4);

                //double width = Double.parseDouble(widthStr);

                // Calculate the perimeter of the square (P = 4 * side)
                double perimeter = (side1 + side2 + side3 + side4);

                // Display the result in the EditText view
                editTextResult.setText("Perimeter: " + perimeter);
            }
        });
    }
}