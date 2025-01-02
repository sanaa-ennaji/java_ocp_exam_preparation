package org.sanaa.preparation.ocp.Generics;

public class Main {

    public static void  main(String [] args){
         Box<String>  stringBox = new Box<>();
         stringBox.stPrint("HackerOne");
         String varb =  stringBox.getThing();
         System.out.println(varb);

         Box<Integer> integerBox = new Box<>();
         integerBox.stPrint(23);
         System.out.println(integerBox.getThing());

    }
}
