package lang.tij4.holding;

import java.util.ArrayList;

class GrannySmith extends Apple {}
class Gala extends Apple {}
class Fuji extends Apple {}
class Braeburn extends Apple {}

public class GenericsAndUpcasting {

    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<Apple>();
        apples.add(new GrannySmith());
        apples.add(new Gala());
        apples.add(new Fuji());
        apples.add(new Braeburn());

        for (Apple c : apples) {
            System.out.println(c);
        }
    }
}
////////////////////////////////////////////////////
// <===================OUTPUT===================> //
// lang.tij4.holding.GrannySmith@a4911d           //
// lang.tij4.holding.Gala@331dd0                  //
// lang.tij4.holding.Fuji@1ea7821                 //
// lang.tij4.holding.Braeburn@74f9fb              //
////////////////////////////////////////////////////
