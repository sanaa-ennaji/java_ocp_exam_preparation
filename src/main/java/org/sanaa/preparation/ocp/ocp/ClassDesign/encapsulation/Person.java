package org.sanaa.preparation.ocp.ocp.ClassDesign.encapsulation;

// encapsulation: mecanisme consiste a  regroupe
// les methodes et les donnee et en cachant l'implementation de l'objet,
// c’est-à-dire en empêchant l’accès aux données par un autre moyen que les services proposés.

public class Person {
    private String name;
    private int age ;
    // we acess to this data using the setters and getters
    public String getName(){
        return name ;
    }

    public void setName (String name){
        this.name = name ;
    }

    public int getAge (){
        return age;
    }
    public void setAge (int age){
        this.age =  age;
    }

}
