package org.sanaa.preparation.ocp.oca.Exceptions;

import java.io.FileReader;
import java.io.IOError;
import java.io.IOException;
public class CheckedExample {
public  static void main (String [] args){
    try{
        FileReader reader = new FileReader("file.txt");

    } catch (IOException e){

    }
}
}
