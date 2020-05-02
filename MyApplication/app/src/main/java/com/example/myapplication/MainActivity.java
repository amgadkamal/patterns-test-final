package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    Button ChickenButton,CheeseButton,FishButton,TotalButton;
    TextView ChickenText,CheeseText,FishText,Total;
    FiletOFish fishSandwitch = new FiletOFish();
    CheeseBurger cheeseBurger = new CheeseBurger();
    ChickenBurger chickenBurger = new ChickenBurger();
     public static int d;
    public static int dd;
    public static int ddd;
   public static String typpe;
   boolean ff=false;
    boolean fff=false;
    Totalorder totalorder = new Totalorder();
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ChickenButton = findViewById(R.id.chickenB);
        CheeseButton = findViewById(R.id.cheeseB);
        FishButton = findViewById(R.id.feloF);

        ChickenText = findViewById(R.id.chickenBT);
        CheeseText = findViewById(R.id.cheeseBT);
        FishText=findViewById(R.id.feloFT);



        FishButton.setOnClickListener(new View.OnClickListener() {
          public void onClick(View v) {

         FishText.setText ((fishSandwitch.prepareRecipe()));
         d=1;

         }});


        CheeseButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                CheeseText.setText ((cheeseBurger.prepareRecipe())+dd);

                dd=1;


            }


        });

        ChickenButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ChickenText.setText ((chickenBurger.prepareRecipe())+dd);
           ddd=1;
                }

        });



    Totalorder totalorder = new Totalorder();

    Iterator totalOrderIterator = totalorder.createIterator();

    printMenu(totalOrderIterator);}

    public void printMenu(final Iterator iterator) {

        Total = findViewById(R.id.totalBT);
        TotalButton = findViewById(R.id.totalB);

        TotalButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                while (iterator.hasNext()) {
                    String menuItem = (String)iterator.next();
                    Total.append(menuItem);

                }
            }

        });





    }


    }





