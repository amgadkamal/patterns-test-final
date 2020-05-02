package com.example.myapplication;
import android.app.Activity;
import android.content.Intent;
import java.util.ArrayList;
import static com.example.myapplication.MainActivity.d;
import static com.example.myapplication.MainActivity.dd;
import static com.example.myapplication.MainActivity.ddd;


public class Totalorder implements Order {

    public String type;

    int i;

    ArrayList<String> menuItems;

    public Totalorder() {
        if (dd==1){
            type="fish"; }

        if (dd==1){
            type="chicen";}

        if (ddd==3){
            type="cheese"; }

        menuItems = new ArrayList<String>();
       if(type=="chicen") {
        addItem("ChicenBurger");

    }

       if(type=="fish"){
       addItem("Fil-O-Fish");
    }

      if(type=="cheese") {
           addItem("Cheese");
      }
    }

    public void addItem(String name)
    {
        menuItems.add(name);
    }

    public ArrayList<String> getMenuItems() {
        return menuItems;
    }

    public Iterator createIterator() {
        return new TotalOrderIterator(menuItems);
    }

    public String toString() {
        return "Total Order";
    }


}

