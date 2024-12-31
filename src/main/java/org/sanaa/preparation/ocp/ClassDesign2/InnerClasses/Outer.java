package org.sanaa.preparation.ocp.ClassDesign2.InnerClasses;

// this is nasted class  : to group classes that belong together
class Outer {
// create an object of the outer class, and then create an object of the inner
    class InnerClass {
        int y = 5;
    }
// can't be instantieted
private class InnerClass2 {
int y = 5;
}

    // a. Static Inner Class
    //can be instanciated without an outer class
static class staticIner {

    // Can only access static members of the outer class.
    void display (){
        System.out.println("inner class");
    }

//b. Local Inner Class
    // Defined within a method.
    //Has access to method's local variables if they are final.
void localdisplay (){
        final int num = 10;
        class LocalInner {
            void print (){
                System.out.println("local inner num: +num");
            }
        }
}


}

  //  Anonymous : a class without  name Used to implement an interface or extend a class in a single instance.
    // class or interface, without having to actually subclass a class.
    interface Printer {
        void print ();
    }

    Printer printer = new Printer() {

        public void print() {
            System.out.println("anonymous inner");
        }
    };

//    printer.print();
}
