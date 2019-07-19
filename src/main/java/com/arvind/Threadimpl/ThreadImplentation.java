package com.arvind.Threadimpl;

public class ThreadImplentation {
    public static void main(String[] args) {

        Runnable r1 = new Runnable() {
            @Override
            public void run() {

                int j=10;
                while (j > 0) {
                    System.out.println("child Thread");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    j--;
                }

            }
        };
        Thread t1 = new Thread(r1);
        t1.start();


        int i=10;

        while (i>0)
        {
            System.out.println("main Thread");
            try {
                Thread.currentThread().sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            i--;

        }



    }
}
