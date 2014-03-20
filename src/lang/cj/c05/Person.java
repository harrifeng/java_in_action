package lang.cj.c05;

import java.util.Objects;

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


  public boolean equals(Object otherObject) {
    //a quick test to see if the objects are identical
    if (this == otherObject) {
      return true;
    }

    //must return false if the explicit parameter is null
    if (otherObject == null) {
      return false;
    }

    // if the classes don't match, they can't be equal
    if (getClass() != otherObject.getClass()) {
      return false;
    }

    // now we know otherObject is a non-null Employee
    Person other = (Person) otherObject;

    // test whether the fields have identical values;
    return Objects.equals(name, other.name);

  }
}
