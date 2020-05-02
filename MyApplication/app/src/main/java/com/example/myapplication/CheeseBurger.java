package com.example.myapplication;

public class CheeseBurger extends Sandwitch {
    String Burgertype(){
        //System.out.println("Steeping the tea bag");
        return "add piece of burger";
    }

    boolean ordercheese(){return true;}
    boolean orderKatchup(){return true;}
    boolean orderPickles(){return true;}
    boolean orderLettuce(){return false;}
}
