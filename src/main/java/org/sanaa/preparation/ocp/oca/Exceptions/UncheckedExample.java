package org.sanaa.preparation.ocp.oca.Exceptions;
//
public class UncheckedExample {

    public static void main (String[] args){
        try {
         int result = 10/ 0;
        } catch(ArithmeticException e) {
          System.out.println("this cant be devided by zero " + e.getMessage());
        }
    }
}
