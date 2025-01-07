package org.sanaa.preparation.ocp.ocp.ClassDesign.Singloton;

// used to create one instance of the class
// used with database
public class Singleton {

    private static Singleton instance;


    private Singleton() {

    }   // private constructor

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
