package edu.cinec.myproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    androidx.cardview.widget.CardView Square;
    androidx.cardview.widget.CardView Parallelogram;

    androidx.cardview.widget.CardView Rectangle;

    androidx.cardview.widget.CardView Rhombus;

    androidx.cardview.widget.CardView Trapezoid;

    androidx.cardview.widget.CardView Triangle;

    androidx.cardview.widget.CardView Circle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Square = findViewById(R.id.card_square);

        Parallelogram = findViewById(R.id.card_paralelogram);

        Rectangle = findViewById(R.id.card_rectangle);

        Rhombus = findViewById(R.id.card_rhombus);

        Trapezoid = findViewById(R.id.card_trapezoid);

        Triangle = findViewById(R.id.card_triangle);

        Circle = findViewById(R.id.card_circle);

        //square
        Square.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(),square.class);
                startActivity(intent);
            }
        });

        //parallelogram
        Parallelogram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), paralelogram.class);
                startActivity(intent);
            }
        });

        //rectangle
        Rectangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(),Rectangle.class);
                startActivity(intent);
            }
        });

        //rhombus
        Rhombus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(),rhombus.class);
                startActivity(intent);
            }
        });

        //trapezoid
        Trapezoid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(),trapezoid.class);
                startActivity(intent);
            }
        });

        //triangle
        Triangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(),triangle.class);
                startActivity(intent);
            }
        });

        //circle
        Circle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(),circle.class);
                startActivity(intent);
            }
        });
    }
}