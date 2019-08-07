package com.arvind.Threadimpl;


import java.util.concurrent.*;

public class ThreadImpleWithCallableInterface {


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(4);
        Future<Integer> future = service.submit(new Task1());
        Integer value = future.get();
        System.out.println(value);






    }
    static class Task1 implements Callable<Integer>{

        @Override
        public Integer call() throws Exception {
            System.out.println("Thread Created by Callable Interface");
            return 5;
        }
    }


}
