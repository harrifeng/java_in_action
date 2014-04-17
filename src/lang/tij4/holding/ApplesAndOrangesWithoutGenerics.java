package lang.tij4.holding;

import java.util.ArrayList;

class Apple {
    private static long counter;
    private final long id = counter++;
    public long id() {
        return id;
    }
}

class Orange {}

public class ApplesAndOrangesWithoutGenerics {

   @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList apples = new ArrayList();
        for (int i = 0; i < 3; i++) {
            apples.add(new Apple());
        }
        // Not prevented from adding an Orange to apples:
        apples.add(new Orange());
        for (int i = 0; i < apples.size(); i++) {
            ((Apple)apples.get(i)).id();
        }
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////////
// <===================OUTPUT===================>                                                     //
// Exception in thread "main" java.lang.ClassCastException:                                           //
// lang.tij4.holding.Orange cannot be cast to lang.tij4.holding.Apple                                 //
// at lang.tij4.holding.ApplesAndOrangesWithoutGenerics.main(ApplesAndOrangesWithoutGenerics.java:26) //
// at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)                                     //
// at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:57)                   //
// at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)           //
// at java.lang.reflect.Method.invoke(Method.java:606)                                                //
// at com.intellij.rt.execution.application.AppMain.main(AppMain.java:120)                            //
////////////////////////////////////////////////////////////////////////////////////////////////////////
