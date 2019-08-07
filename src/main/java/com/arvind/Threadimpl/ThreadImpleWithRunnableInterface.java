package com.arvind.Threadimpl;

public class ThreadImpleWithRunnableInterface {

    public static void main(String[] args) {


        /***************By Runnable Interface**************/

        //Implenting Runnable to a class
        class RunnableClass implements Runnable{
            @Override
            public void run(){
                System.out.println("Child_1 Thread running, By Implemtnting Runnable Inteface to a class");
            }
        }

        Thread t1 = new Thread(new RunnableClass());
        t1.start();

        //Implementing Runnable Interface with InnerClass
        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Child_2 Thread running, with Inner Class Implementation");
            }
        };
        Thread t2 = new Thread(r2);
        t2.start();

        //Implementing Runnable Interface with LambdaExpression
        Runnable r3 = ()-> System.out.println("Child_3 Thread running, With Lambda Expression");
        Thread t3 = new Thread(r3);
        t3.start();


        //Implementing Thread Class
        class ThreadClass extends Thread{
            @Override
            public void run(){
                System.out.println("Child_4 Thread running, By Extending Thread Class");
            }
        }
        ThreadClass t4 = new ThreadClass();
        t4.start();


        //implemtntaing Runnable Interface Directly to Thread Implementation
        Thread t5 = new Thread(()->{

            System.out.println("Child_5 Thread running, By using Lamda expression direclty to Thread implemntaton");
        });
        t5.start();


    }

























}
