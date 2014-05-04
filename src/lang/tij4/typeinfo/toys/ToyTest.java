package lang.tij4.typeinfo.toys;

interface HasBatteries {}

interface Waterproof {}

interface Shoots {}

class Toy {

    // Comment out this will cause
    // obj = up.newInstance(); having "Cannot instantiate"
    Toy() {
    }

    Toy(int i) {
    }
}

class FancyToy extends Toy
    implements HasBatteries, Waterproof, Shoots {

    FancyToy() {
        super(1);
    }
}

public class ToyTest {

    static void printInfo(Class cc) {
        System.out.println("Class name: " + cc.getName()
                           + " is interface? [" + cc.isInterface() + "]");
        System.out.println("Simple name: " + cc.getSimpleName());
        System.out.println("Canonical name: " + cc.getCanonicalName());
        System.out.println("---------------------------------");
    }

    public static void main(String[] args) {
        Class c = null;
        try {
            c = Class.forName("lang.tij4.typeinfo.toys.FancyToy");
        } catch(ClassNotFoundException e) {
            System.out.println("Can't find FancyToy");
            System.exit(1);
        }
        printInfo(c);
        for (Class face : c.getInterfaces()) {
            printInfo(face);
        }
        Class up = c.getSuperclass();
        Object obj = null;
        try {
            // Requires default constructor
            obj = up.newInstance();
        } catch (InstantiationException e) {
            System.out.println("Cannot instantiate");
            System.exit(1);
        } catch (IllegalAccessException e) {
            System.out.println("Cannot access");
            System.exit(1);
        }
        printInfo(obj.getClass());
    }
}

///////////////////////////////////////////////////////////////////////////
// <===================OUTPUT===================>                        //
// Class name: lang.tij4.typeinfo.toys.FancyToy is interface? [false]    //
// Simple name: FancyToy                                                 //
// Canonical name: lang.tij4.typeinfo.toys.FancyToy                      //
// ---------------------------------                                     //
// Class name: lang.tij4.typeinfo.toys.HasBatteries is interface? [true] //
// Simple name: HasBatteries                                             //
// Canonical name: lang.tij4.typeinfo.toys.HasBatteries                  //
// ---------------------------------                                     //
// Class name: lang.tij4.typeinfo.toys.Waterproof is interface? [true]   //
// Simple name: Waterproof                                               //
// Canonical name: lang.tij4.typeinfo.toys.Waterproof                    //
// ---------------------------------                                     //
// Class name: lang.tij4.typeinfo.toys.Shoots is interface? [true]       //
// Simple name: Shoots                                                   //
// Canonical name: lang.tij4.typeinfo.toys.Shoots                        //
// ---------------------------------                                     //
// Class name: lang.tij4.typeinfo.toys.Toy is interface? [false]         //
// Simple name: Toy                                                      //
// Canonical name: lang.tij4.typeinfo.toys.Toy                           //
// ---------------------------------                                     //
///////////////////////////////////////////////////////////////////////////
