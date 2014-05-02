package lang.tij4.holding;

import lang.tij4.typeinfo.pets.*;

import java.util.*;


public class PetMap {
    public static void main(String[] args) {
        Map<String, Pet> petMap = new HashMap<String, Pet>();
        petMap.put("My Cat", new Cat("Molly"));
        petMap.put("My Dog", new Dog("Ginger"));
        petMap.put("My Hamster", new Hamster("Bosco"));
        System.out.println(petMap);
        Pet dog = petMap.get("My Dog");
        System.out.println(dog);
        System.out.println(petMap.containsKey("My Dog"));
        System.out.println(petMap.containsValue(dog));
    }
}
/////////////////////////////////////////////////////////////////////
// <===================OUTPUT===================>                  //
// {My Dog=Dog Ginger, My Cat=Cat Molly, My Hamster=Hamster Bosco} //
// Dog Ginger                                                      //
// true                                                            //
// true                                                            //
/////////////////////////////////////////////////////////////////////
