package cj.c05;

/**
 * Created by hfeng on 14-1-4.
 */
public abstract class Person {
    ///////////////////////////////////////////////////////////////////
    // Some programmers don’t realize that abstract classes can have //
    // concrete methods. You should always move common fields and    //
    // methods (whether abstract or not) to the superclass (whether  //
    // abstract or not).                                             //
    ///////////////////////////////////////////////////////////////////
    private String name;

    public Person(String n) {
        name = n;
    }

    ////////////////////////////////////////////////////
    // a class with one or more abstract methods must //
    // itself be declared abstract.                   //
    ////////////////////////////////////////////////////
    public abstract String getDescription();

    public String getName() {
        return name;
    }
}
