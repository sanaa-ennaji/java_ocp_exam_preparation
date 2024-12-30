package org.sanaa.preparation.ocp.ClassDesign.Immutable;

//Create and Use Immutable Classes
// Declare the class as final.
//Make all fields final and private
// Don't provide setter methods.

public final class ImmutablePerson {


    private final String name ;
    private final int age ;


    public ImmutablePerson (String name, int age){

        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age ;
    }
}




















