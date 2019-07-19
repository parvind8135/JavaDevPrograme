package com.arvind.lamdaimpl;


interface GreetSomeone
{
    void sayHello();
}

class SayHelloClass
{
   public static void hello()
    {
        System.out.println("Hello Everyone with Method Reference");
    }
}
public class MethodReference {

    public static void main(String[] args) {
        GreetSomeone greeting = ()-> System.out.println("Hello with lambda expression");
        greeting.sayHello();

        GreetSomeone greeting2 = SayHelloClass::hello;
        greeting2.sayHello();



    }


}
