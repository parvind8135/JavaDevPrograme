package com.arvind.DefaultAndStaticMethods;

interface Shape{
    void noOfSides(int n);
    void nameOfShape();
    default void objectCreation(){
        System.out.println("shape has been Created");

    }
    static void property()
    {
        System.out.println("All the boundaries are enclosed and it has definite area");
    }
}



class Rectangle implements Shape{
    @Override
    public void noOfSides(int n) {
        System.out.println("Shape has "+n+" no of sides");
    }

    @Override
    public void nameOfShape() {
        System.out.println("it is called Recangle");
    }
}

class Pentagon implements Shape{
    @Override
    public void noOfSides(int n) {
        System.out.println("Shape has "+n+" no of sides");
    }

    @Override
    public void nameOfShape() {
        System.out.println("it is called Pentagon");
    }

    @Override
    public void objectCreation() {                             //Default Methods are overriden
        System.out.println("Pentagon has been created");
    }
}

class MainClass{
    public static void main(String[] args) {
        Rectangle rec   = new Rectangle();
        rec.noOfSides(4);
        rec.nameOfShape();
        rec.objectCreation();
        Shape.property();

        System.out.println();

        Shape pen = new Pentagon();
        pen.noOfSides(5);
        pen.nameOfShape();
        pen.objectCreation();
        Shape.property();
    }
}
