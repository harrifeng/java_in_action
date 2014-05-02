package lang.tij4.exceptions;

class MyException extends Exception {
    public MyException() {}
    public MyException(String msg) { super(msg);}
}

public class FullConstructors {
    public static void f() throws MyException {
        System.out.println("Throwing MyException from f()");
        throw new MyException();
    }
    public static void g() throws MyException {
        System.out.println("Throwing MyException from g()");
        throw new MyException();
    }

    public static void main(String[] args) {
        try {
            f();
        } catch(MyException e) {
            e.printStackTrace(System.out);
        }
        try {
            g();
        } catch (MyException e) {
            e.printStackTrace(System.out);
        }
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////////
// <===================OUTPUT===================>                                                  //
// Throwing MyException from f()                                                                   //
// lang.tij4.exceptions.MyException                                                                //
// 	at lang.tij4.exceptions.FullConstructors.f(FullConstructors.java:11)                           //
// 	at lang.tij4.exceptions.FullConstructors.main(FullConstructors.java:20)                        //
// 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)                                 //
// 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)               //
// 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)       //
// 	at java.lang.reflect.Method.invoke(Method.java:483)                                            //
// 	at com.intellij.rt.execution.application.AppMain.main(AppMain.java:134)                        //
// Throwing MyException from g()                                                                   //
// lang.tij4.exceptions.MyException                                                                //
// 	at lang.tij4.exceptions.FullConstructors.g(FullConstructors.java:15)                           //
// 	at lang.tij4.exceptions.FullConstructors.main(FullConstructors.java:25)                        //
// 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)                                 //
// 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)               //
// 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)       //
// 	at java.lang.reflect.Method.invoke(Method.java:483)                                            //
// 	at com.intellij.rt.execution.application.AppMain.main(AppMain.java:134)                        //
/////////////////////////////////////////////////////////////////////////////////////////////////////
