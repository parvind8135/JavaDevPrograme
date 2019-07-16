package com.arvind.lamdaimpl;

interface PersonActivity{                   //functional Interface
    void run(String name, int v);
}

class Person1 implements PersonActivity{


   public void run(String name, int v){
       System.out.println("This output is produce by class implementing Inteface");
        System.out.println(name+" is running at : "+ v+"kms");
    }

}


class MainClass{

    public static void main(String[] args) {
        Person1 p1 = new Person1();                     //Method 1 using normal class and implementing interface
        p1.run("Arvind",23);

        PersonActivity p2 = new PersonActivity() {          //Method 2 using Anonymous Inner Class
            public void run(String name, int v) {
                System.out.println("This output is produce by Using Anonymous Inner Class");
                System.out.println(name+" is running at : "+ v+"kms");
            }
        };
        p2.run("Varun" , 21);


        PersonActivity p3 = (name,v) -> System.out.println(name+" is running at : "+ v+"kms");      //Method 3 using lambda Expression
        System.out.println("This output is produce by Using Lambda Expression");
        p3.run("John",17);

    }
}

