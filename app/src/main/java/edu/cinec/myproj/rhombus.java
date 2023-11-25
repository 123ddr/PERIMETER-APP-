package edu.cinec.myproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class rhombus extends AppCompatActivity {

    Button Main4;
    Button Back4;

    EditText editTextHeight;

    EditText editTextResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rhombus);

        //button click

        Main4 = findViewById(R.id.myButtonRhombus);

        Back4 = findViewById(R.id.myButtonRhombusBack);


        Back4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(),MainActivity.class);
                startActivity(intent);
            }
        });

        // Initialize EditText views
        editTextHeight = findViewById(R.id.text1);
        //editTextWidth = findViewById(R.id.text2);
        editTextResult = findViewById(R.id.text3);

        // Initialize the Button and set the click listener
        Button myButtonSquare = findViewById(R.id.myButtonRhombus);
        myButtonSquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the user-entered height and width from the EditText views
                String heightStr = editTextHeight.getText().toString();
                //String widthStr = editTextWidth.getText().toString();

                // Check if the input is empty
                if (heightStr.isEmpty() ) {
                    editTextResult.setText("Please enter values for both height and width.");
                    return;
                }

                // Convert the input to numeric values
                double height = Double.parseDouble(heightStr);
                //double width = Double.parseDouble(widthStr);

                // Calculate the perimeter of the square (P = 4 * side)
                double perimeter = 4 * (height);

                // Display the result in the EditText view
                editTextResult.setText("Perimeter: " + perimeter);
            }
        });

    }
}