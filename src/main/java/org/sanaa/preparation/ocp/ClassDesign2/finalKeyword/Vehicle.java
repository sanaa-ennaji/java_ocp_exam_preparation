package org.sanaa.preparation.ocp.ClassDesign2.finalKeyword;
// final class : cant be have subclasses
// final method : we cant override it
// final varibale we cnat change its value after intialization
final  class Vehicle {
  final void start (){

  }
    // Error: Cannot extend final class
    // Error: Cannot override final method
    final int speed = 60;
    // speed = 80; // Error: Cannot reassign a final variable

}
