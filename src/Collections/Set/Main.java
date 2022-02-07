package Collections.Set;

import Collections.Person;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
//        Set<String> strings = new HashSet<String>();
//        strings.add("reza");
//        strings.add("ali");
//        strings.add("davvod");
//        strings.add("reza");
//        strings.add("javad");
//        System.out.println(strings.isEmpty());
//
//        for (String string : strings) {
//            System.out.println(string);
//        }
        Set<Person> people = new HashSet<Person>();
        people.add(new Person(23,"reza","ahmadi"));
        people.add(new Person(23,"reza","ahmadi"));
        people.add(new Person(233,"rezaa","ahmadii"));


        for (Person person : people) {
            System.out.println(person);
        }

        Predicate<Person> personWhoseAgeIsMoreThanTen = (Person person3) ->  person3.getAge()>10;
        people.removeIf(personWhoseAgeIsMoreThanTen);



    }
}
