package org.sanaa.preparation.ocp.ClassDesign.Immutable;
// static keyword
// static methods and varibales are shared accross all instances on the class
public class Counter {
    private static int count = 0;

    public static void increament (){
        count ++ ;
    }

    public static int getCount(){
        return  count ;
    }
}
