package org.sanaa.preparation.ocp.ClassDesign.polymorphisme;

import java.util.Objects;

public class Person {
    private String name ;
    private int age ;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
//equals(): Compares two objects for equalit
    public boolean equals (Object obj)
    {
        if(this == obj) return true ;
        if (obj == null || getClass() != obj.getClass() )
            return false;
        Person person = (Person)  obj;
        return  age == person.age && name.equals(person.name);
    }
  // hashCode(): Returns an integer hash code that is used by hash-based collections
    @Override
    public int hashCode(){
        return Objects.hash(name, age );
    }

    // toString(): Provides a string representation of the object.
    public String toString (){
        return "Person {name='" + name + "', age=" + age + "}";
    }


}
