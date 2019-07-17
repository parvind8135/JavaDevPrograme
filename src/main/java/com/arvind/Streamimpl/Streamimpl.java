package com.arvind.Streamimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Product{
    String name;
    int price;
    int id;

    public Product(String name, int price, int id) {
        this.name = name;
        this.price = price;
        this.id = id;
    }
}

class MainClass{
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product("Cake" , 11,1821));
        list.add(new Product("Shampoo" , 80,7632));
        list.add(new Product("laptop" , 2839,9822));
        list.add(new Product("Phone" , 2392,1711));
        list.add(new Product("brush" , 8,3728));



        //Calculating Execution time with Parallel Stream and series stream.
        long startTime = System.nanoTime();
        System.out.println("Using Stream");
        Stream<Product> filterList1 = list.stream().filter(Product->Product.price>50);
        filterList1.forEach(Product -> System.out.println(Product.name+"     "+Product.price+"      "+ Product.id));
        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("Execution time with Stream "+totalTime);

        long startTime1 = System.nanoTime();
        System.out.println();
        System.out.println("Using Parallel Stream");
        Stream<Product> filterList2 = list.parallelStream().filter(Product->Product.price>50);
        filterList2.forEach(Product -> System.out.println(Product.name+"     "+Product.price+"      "+ Product.id));
        long endTime1   = System.nanoTime();
        long totalTime1 = endTime1 - startTime1;
        System.out.println("Execution time with Parallel Stream "+ totalTime1);
        System.out.println("Time difference : "+(totalTime-totalTime1)+" nano Seconds");
        System.out.println();

        List<Integer> listOfInteger = new ArrayList<>();
        listOfInteger.add(23);
        listOfInteger.add(64);
        listOfInteger.add(73);
        listOfInteger.add(36);
        listOfInteger.add(25);

        System.out.println("UnSorted Array list");
        listOfInteger.forEach(x-> System.out.println(x));

        System.out.println("Sorted list");
        List<Integer> sortedlist = new ArrayList<>();
        sortedlist = listOfInteger.stream().sorted().collect(Collectors.toList());
        sortedlist.forEach(System.out::println);    //Printing list using method reference
    }
}