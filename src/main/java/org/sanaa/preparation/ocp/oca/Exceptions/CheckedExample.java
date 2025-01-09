package org.sanaa.preparation.ocp.oca.Exceptions;

import java.io.FileReader;
import java.io.IOError;
import java.io.IOException;
//In Java, an exception is an event that occurs during the execution of a program
// Exception handling in Java allows developers to manage runtime errors effectively by using mechanisms like try-catch block, finally block, throwing Exceptions, Custom Exception handling, etc.
// Checked at Compile-Time: The compiler requires them to be either handled using a try-catch block or declared with throws.
// IOException
//SQLException
public class CheckedExample {
public  static void main (String [] args){
    try{
        FileReader reader = new FileReader("file.txt");

    } catch (IOException e){

    }
}
}
