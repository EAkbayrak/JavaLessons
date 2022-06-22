package com.syntax.class18;

public class Cow {
    String breed;
    String colour;
    int age;
    double weight;

    Cow (String cowBreed, String cowColour, int cowAge, double cowWeight){
        breed=cowBreed;
        colour=cowColour;
        age=cowAge;
        weight=cowWeight;
    }

    public String getCowInfo(){
        return "The breed of the cow is "+breed+" and the colour is "+colour+
                " and the age is "+age+ "and the weight is"+weight;
    }

}
