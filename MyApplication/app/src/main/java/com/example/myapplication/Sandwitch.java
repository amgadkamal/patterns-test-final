package com.example.myapplication;

public abstract class Sandwitch {

    final String prepareRecipe() {
        String Katchup = new String();
        String Pickles = new String();
        String Tomato = new String();
        String Lettuce = new String();
        String Cheese = new String();

        if (orderKatchup()) { Katchup = addKatchup();}

        if (orderPickles()) { Pickles= addPickles(); }

        if (orderTomato()) { Tomato = addTomato(); }

        if(orderLettuce()){ Lettuce=addLettuce(); }
        if(ordercheese()){ Cheese=addCheese(); }

        String newSandwitch=   Bread()+ Burgertype()+Spred()+Cheese+Katchup+Pickles+Tomato+Lettuce+Packing();
        return newSandwitch;

    }

    abstract String Burgertype();
    boolean ordercheese(){return false;}
    boolean orderKatchup(){return false;}
    boolean orderPickles(){return false;}
    boolean orderTomato(){return true;}
    boolean orderLettuce(){return true;}



    final String addKatchup(){
        return "Add katchup to sandwitch"; }

    final String addPickles(){
        return "Add Pickles to sandwitch"; }

    final String addTomato(){
        return "Add tomatos to sandwitch";    }

    final String addLettuce(){
        return "Add Lettuce to sandwitch";    }

    final String addCheese(){
        return "Add cheese to sandwitch";    }


    final String Bread(){
        return "Two pieces of bread"; }

    String Spred(){
        return "Add sandwitch spread"; }

    final String Packing(){
        return "Put sandwitch in bag"; }


}

