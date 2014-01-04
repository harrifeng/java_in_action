package cj.c05;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;

/**
 * Created by hfeng on 1/4/14.
 */
public class ReflectionTest {
    public static void main(String[] args) {
        String name;
        if (args.length > 0) {
            name = args[0];
        } else {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter class name(e.g. java.util.Date)");
            name = in.next();
        }

        try {
            //print class name and superclass name (if != Object)
            Class cl = Class.forName(name);
            Class supercl = cl.getSuperclass();
            String modifiers = Modifier.toString(cl.getModifiers());
            if (modifiers.length() > 0) {
                System.out.println(modifiers + " ");
            }
            System.out.println("class " + name);

            if (supercl != null && supercl != Object.class) {
                System.out.print(" extends" + supercl.getName());
            }
            System.out.printf("\n{\n");
            printConstructors(cl);
            System.out.println("\n---------------------");
            printMethonds(cl);
            System.out.println("\n----------------------");
            printFields(cl);
            System.out.println("}");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void printConstructors(Class cl) {
        Constructor[] constructors = cl.getDeclaredConstructors();

        for (Constructor c : constructors) {
            String name = c.getName();
            System.out.printf("  ");
            String modifiers = Modifier.toString(c.getModifiers());
            if (modifiers.length() > 0) {
                System.out.printf(modifiers + " ");
            }
            System.out.printf(name + " (");

            // print parameter types
            Class[] paramTypes = c.getParameterTypes();
            for (int j = 0; j < paramTypes.length; j++) {
                if (j > 0) {
                    System.out.printf(", ");
                }
                System.out.printf(paramTypes[j].getName());
            }
            System.out.println(");");
        }
    }

    public static void printMethonds(Class cl) {
        Method[] methods = cl.getDeclaredMethods();
        for (Method m : methods) {
            Class retType = m.getReturnType();
            String name = m.getName();
            System.out.printf(" ");
            // print modifiers, return type and method name
            String modifiers = Modifier.toString(m.getModifiers());
            if (modifiers.length() > 0 ) {
                System.out.printf(modifiers + " ");
            }
            System.out.printf(retType.getName() + " " + name + "(");

            Class[] paramTypes = m.getParameterTypes();
            for (int j = 0; j < paramTypes.length; j++) {
                if (j > 0) {
                    System.out.printf(", ");
                }
                System.out.printf(paramTypes[j].getName());
            }
            System.out.println("); ");
        }
    }

    public static void printFields(Class cl) {
        Field[] fields = cl.getDeclaredFields();

        for (Field f : fields) {
            Class type = f.getType();
            String name = f.getName();
            System.out.printf("  ");
            String modifiers = Modifier.toString(f.getModifiers());
            if (modifiers.length() > 0) {
                System.out.printf(modifiers + " ");
            }
            System.out.println(type.getName() + " " + name + " ");
        }
    }
}
