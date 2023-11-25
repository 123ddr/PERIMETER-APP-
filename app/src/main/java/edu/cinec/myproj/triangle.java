package edu.cinec.myproj;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class triangle extends AppCompatActivity {

    Button Main6;
    Button Back6;

    EditText editTextHeight1;
    EditText editTextHeight2;
    EditText editTextHeight3;


    EditText editTextResult;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangle);

        Main6 = findViewById(R.id.myButtonTriangle);

        Back6 = findViewById(R.id.myButtonTriangleBack);


        Back6.setOnClickListener(new View.OnClickListener() {
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

        //editTextWidth = findViewById(R.id.text2);
        editTextResult = findViewById(R.id.text3);

        // Initialize the Button and set the click listener
        Button myButtonSquare = findViewById(R.id.myButtonTriangle);
        myButtonSquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the user-entered height and width from the EditText views
                String heightStr1 = editTextHeight1.getText().toString();
                String heightStr2 = editTextHeight2.getText().toString();
                String heightStr3 = editTextHeight3.getText().toString();

                //String widthStr = editTextWidth.getText().toString();

                // Check if the input is empty
                if (heightStr1.isEmpty() || heightStr2.isEmpty()|| heightStr3.isEmpty()) {
                    editTextResult.setText("Please enter values for both height and width.");
                    return;
                }

                // Convert the input to numeric values
                double side1 = Double.parseDouble(heightStr1);
                double side2 = Double.parseDouble(heightStr2);
                double side3 = Double.parseDouble(heightStr3);


                //double width = Double.parseDouble(widthStr);

                // Calculate the perimeter of the square (P = 4 * side)
                double perimeter = (side1 + side2 + side3);

                // Display the result in the EditText view
                editTextResult.setText("Perimeter: " + perimeter);
            }
        });
    }
}