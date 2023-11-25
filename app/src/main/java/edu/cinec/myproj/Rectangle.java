package edu.cinec.myproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Rectangle extends AppCompatActivity {

    Button Main3;
    Button Back3;

    EditText editTextHeight;
    EditText editTextWidth;
    EditText editTextResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangle);

        //button click

        Main3 = findViewById(R.id.myButtonRectangle);

        Back3 = findViewById(R.id.myButtonRectangleBack);


        Back3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(),MainActivity.class);
                startActivity(intent);
            }
        });

        // Initialize EditText views
        editTextHeight = findViewById(R.id.text1);
        editTextWidth = findViewById(R.id.text2);
        editTextResult = findViewById(R.id.text3);

        // Initialize the Button and set the click listener
        Button myButtonSquare = findViewById(R.id.myButtonRectangle);
        myButtonSquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the user-entered height and width from the EditText views
                String heightStr = editTextHeight.getText().toString();
                String widthStr = editTextWidth.getText().toString();

                // Check if the input is empty
                if (heightStr.isEmpty() || widthStr.isEmpty()) {
                    editTextResult.setText("Please enter values for both height and width.");
                    return;
                }

                // Convert the input to numeric values
                double height = Double.parseDouble(heightStr);
                double width = Double.parseDouble(widthStr);

                // Calculate the perimeter of the square (P = 4 * side)
                double perimeter = 2 * (height + width);

                // Display the result in the EditText view
                editTextResult.setText("Perimeter: " + perimeter);
            }
        });


    }
}