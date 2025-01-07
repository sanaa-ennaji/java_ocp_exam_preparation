package org.sanaa.preparation.ocp.ocp.ClassDesign2.abstraction;
// abstrat class : a class declare with abstract keyword and cannot be instantiated
// a method without implementation and subclass must override it
abstract class Animal {
    abstract void sound ();

    void eat (){
        System.out.println("food");
    }
}
