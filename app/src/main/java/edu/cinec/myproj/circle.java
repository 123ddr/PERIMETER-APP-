package edu.cinec.myproj;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class circle extends AppCompatActivity {

    Button Main7;
    Button Back7;

    EditText editTextRadius;

    EditText editTextResult;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle);

        //button click

        Main7 = findViewById(R.id.myButtonCircle);

        Back7 = findViewById(R.id.myButtonCircleBack);


        Back7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(),MainActivity.class);
                startActivity(intent);
            }
        });


        // Initialize EditText views
        editTextRadius = findViewById(R.id.text1);
        //editTextWidth = findViewById(R.id.text2);
        editTextResult = findViewById(R.id.text3);

        // Initialize the Button and set the click listener
        Button myButtonSquare = findViewById(R.id.myButtonCircle);
        myButtonSquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the user-entered height and width from the EditText views
                String RadiusStr = editTextRadius.getText().toString();
                //String widthStr = editTextWidth.getText().toString();

                // Check if the input is empty
                if (RadiusStr.isEmpty() ) {
                    editTextResult.setText("Please enter value for Radius");
                    return;
                }

                // Convert the input to numeric values
                double radius = Double.parseDouble(RadiusStr);
                //double width = Double.parseDouble(widthStr);

                // Calculate the perimeter of the square (P = 4 * side)
                double perimeter = 2 * 3.14 *(radius) ;

                // Display the result in the EditText view
                editTextResult.setText("Circumference: " + perimeter);
            }
        });
    }
}