package com.arvind.DefaultAndStaticMethods;

import java.util.Optional;

public class Optionalimpl {

    public static void main(String[] args) {
        int i=0;
        String[] str = new String[11];
        str[5] = "Hello";
        str[2] = "NOTHing";

        for (String s : str){

            Optional<String> toCheck = Optional.ofNullable(s);
            if(toCheck.isPresent()){
                System.out.println("Original String: "+toCheck.get());
                System.out.println("After Operation String is: "+ toCheck.get().toUpperCase());
                System.out.println("After Operation String is: "+ toCheck.get().toLowerCase());
                System.out.println();
            }else {
                System.out.println("No String is present at :"+i);
            }

            i++;
        }
        System.out.println();
        System.out.println("Using Method Reference we can directly print the present value :");
        for (String s : str){

            Optional<String> toCheck = Optional.ofNullable(s);
            toCheck.ifPresent(System.out::println);
        }




    }
}
