package org.sanaa.preparation.ocp.ClassDesign2.LambdaExpression;

import java.util.Arrays;
import java.util.List;

// introduced in java 8
//lambda Expressions: short block of code which takes in parameters and returns a value
interface Calculator {

    int add(int a, int b);
}

//    Calculator calc = (a,b) -> a + b ;
//    System.out.println("sum: " + calc.add(5, 3));



//lambda expressions with iteration
//        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
//        names.forEach(name -> System.out.println(name));
