package org.sanaa.preparation.ocp.Generics;
// problems before generics
//generic type is a generic class or interface that is parameterized types.
public class Box <T> {

    T thing ;

    public void stPrint (T thing){
        this.thing = thing ;
    }

    public T getThing (){
      return thing ;
    }

}