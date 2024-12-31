package org.sanaa.preparation.ocp.ClassDesign2.enums;

import java.time.DayOfWeek;// anums are used to define a set of constans
// static keyword : belongs to a class itself and not the object
public enum Day {
    // trated like static final object
    MONDAY("I hate this day"),
    FRIDAY("end of the week");
    private String message;
    Day (String message){
        this.message = message;
    }

    public void displayMessage() {
     System.out.println(message);
    }
}
// today refers to the FRIDAY constant of the Day enum.
//Day today = DayOfWeek.MONDAY;
// today.displayMessage(); // I hate this day
