package com.arvind.TheoryFiles;



enum  Days{
    Monday, Tueaday, WednessDay;
}


public class ObjectOrientedProgramming {

    Days day;

    ObjectOrientedProgramming(Days day){
        this.day=day;
    }

    public void whichDay() {
        switch (day) {
            case Monday:
                System.out.println("today is Monday");
                break;
            case Tueaday:
                System.out.println("today is Tuesday");
                break;
            case WednessDay:
                System.out.println("today is wednessday");
                break;
            default:
                System.out.println("Weekend");

        }
    }

    public static void main(String[] args) {

        ObjectOrientedProgramming obj = new ObjectOrientedProgramming(Days.WednessDay);
        obj.whichDay();

    }
}

/**********

 * ObjectOriented Programming: Where we build and organise  our software as a combination of different kind of object which incorporate both
 data and behvior.

 *Basic concepts of OOPs are:
 * Object
 * CLass
 * Inheritance
 * Polymorphism
 * Abstaction
 * Encapsulation


  ##  (((JVM)+Libraries)=JRE +Development Tools)=JDK
    * JVM -> Abstrac Machine.
    * JRE and JDK -> Physycal Machines.



######## constructor doesnot have a return type, but it does return a instance of the current class which we cant use offcourse.

####### IOC: Shifting resposibility of creating object from our Application code to spring container. It is achieved by DI.

WEB-AWARE Spring application contex






########### Lifcycle of MAVEN:
        default - Deploy Project.
        clean - Clean The Project.
        site - Create Project site Documentation.






















 ***********/