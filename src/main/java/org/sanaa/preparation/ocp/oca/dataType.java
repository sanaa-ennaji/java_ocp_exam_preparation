package org.sanaa.preparation.ocp.oca;


//Type casting when you assign a value of a primitive data type to another type

import java.util.ArrayList;

// Widening Casting (automatically) - converting a smaller type to a larger type size
// byte -> short -> char -> int -> long -> float -> double
//Narrowing Casting (manually) - converting a larger type to a smaller size type
//double -> float -> long -> int -> char -> short -> byte
public class dataType {

// 1 primitive types
// casting char int
    char a = 'A';
    int I = a ; // 65

    // casting small ro large size data type
    int i = 10;
    long aLong = i ;

   // Explicit Casting (Narrowing): Larger → Smaller (Risky, might lose data)
    long l = 100L;
    int b = (int) l; // Requires explicit cast


    //2 Referece types like string store reference (addresse)
    // they can have null value
     String str = null ;// ok
    //  int x = null ;  // compile error
    //  Wrapper Classes : They convert primitive data types into objects
    // A Wrapper Class in Java is a class that wraps (or encapsulates) a primitive data type into an object. Each primitive data type in Java has a corresponding Wrapper Class in the java.lang package.
    // Example: ArrayList<int> is not allowed, but ArrayList<Integer> works.


    // 3 Autoboxing and Unboxing

    // Autoboxing
    Integer obj = 10; // int → Integer

    // Unboxing
    int num = obj; // Integer → int

    // 4 life cycle of an object and garbage collection
    // evry object go trough 4 phases
    // 4.1 is "creattion" he JVM allocates heap memory for the object.  (the objecct stocked in the heap and the reference varibale in the stack memory  )
    Object object =  new Object();
    //  4.2  "In Use" : The object is referenced by one or more variables.
    //While an object is referenced, it cannot be garbage-collected.

    Object inUse =  new Object(); // in use
   // 4 .3 "Dereferencing"  : When all references to an object are removed, the object becomes eligible for garbage collection.
     // 4.4  Garbage Collection (GC)  : The JVM's Garbage Collector (GC) frees memory by deleting dereferenced objects.
//resume
    // Object Creation	new keyword creates an object
    //Dereferencing	  Object loses reference. Nullifying, reassigning, or going out of scope
    //Garbage Collection	JVM automatically reclaims memory
    //System.gc(): Suggest JVM to run garbage collection, does not force it
    //Finalize Method: Rarely used, can be overridden for cleanup.
    //Eligible for GC	No active references to an object

// 5   string and String builder
    // String immutable
    // StringBuilder : Mutable (better of modifecatios)

    public static void main(String[] args) {
        // Autoboxing: int → Integer
        ArrayList<Integer> numbers = new ArrayList<>();
        // Autoboxing happens here
        numbers.add(10); // int is automatically converted to Integer
        numbers.add(20);
        numbers.add(30);
        System.out.println("ArrayList of Integers: " + numbers);
        // Unboxing: Integer → int
        int sum = 0;
        for (Integer num : numbers) {
            sum += num; // Integer is automatically converted to int
        }
        System.out.println("Sum of numbers: " + sum);
        // Key Takeaways
        //Wrapper classes convert primitives into objects.
        //Used for collections, synchronization, and null representation.
        //Autoboxing and Unboxing make conversions seamless.
        //Wrapper classes provide utility methods for easier data manipulation.






    }







}
