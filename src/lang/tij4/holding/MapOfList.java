package lang.tij4.holding;

import lang.tij4.typeinfo.pets.*;

import java.util.*;

public class MapOfList {
    public static Map<Person, List<? extends Pet>> petPeople =
            new HashMap<Person, List<? extends Pet>>();

    static {
        petPeople.put(new Person("Dawn"),
                Arrays.asList(new Cymric("Molly"), new Mutt("Spot")));
        petPeople.put(new Person("Kate"),
                Arrays.asList(new Cat("Shackleton"),
                        new Cat("Elsie May"),
                        new Dog("Margrett"))
        );
        petPeople.put(new Person("Marilyn"),
                Arrays.asList(new Pug("Louie aka Louis Snorkelstein Dupree"),
                        new Cat("Standard aka Stinky el Negro"),
                        new Cat("Pinkola"))
        );
        petPeople.put(new Person("Luke"),
                Arrays.asList(new Rat("Fuzzy"),
                        new Rat("Fizzy"))
        );
        petPeople.put(new Person("Isaac"),
                Arrays.asList(new Rat("Freckly")));
    }

    public static void main(String[] args) {
        System.out.println("People: " + petPeople.keySet());
        System.out.println("Pets: " + petPeople.values());
        for (Person person : petPeople.keySet()) {
            System.out.println(person + " has");
            for (Pet pet : petPeople.get(person)) {
                System.out.println("    " + pet);
            }
        }
    }
}

///////////////////////////////////////////////////////////////////
// <===================OUTPUT===================>                //
// People: [Person Marilyn, Person Dawn, Person Luke, \          //
// Person Isaac, Person Kate]                                    //
// Pets: [[Pug Louie aka Louis Snorkelstein Dupree, \            //
// Cat Standard aka Stinky el Negro, Cat Pinkola], \             //
// [Cymric Molly, Mutt Spot], [Rat Fuzzy, Rat Fizzy], \          //
// [Rat Freckly], [Cat Shackleton, Cat Elsie May, Dog Margrett]] //
// Person Marilyn has                                            //
//     Pug Louie aka Louis Snorkelstein Dupree                   //
//     Cat Standard aka Stinky el Negro                          //
//     Cat Pinkola                                               //
// Person Dawn has                                               //
//     Cymric Molly                                              //
//     Mutt Spot                                                 //
// Person Luke has                                               //
//     Rat Fuzzy                                                 //
//     Rat Fizzy                                                 //
// Person Isaac has                                              //
//     Rat Freckly                                               //
// Person Kate has                                               //
//     Cat Shackleton                                            //
//     Cat Elsie May                                             //
//     Dog Margrett                                              //
///////////////////////////////////////////////////////////////////
