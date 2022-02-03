package C;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("javad", "akbari", 23);
        Person person1 = new Person("reza", "mahmoodi", 24);
        Person person2 = new Person("sara", "kamali", 19);

        Person[] people = new Person[3];
        people[0] = person;
        people[1] = person1;
        people[2] = person2;

        Arrays.sort(people);

        for (Person item : people) {
            System.out.println(item);
        }


        String[] arr = {"zzzzzz", "cde", "fghi", "ab"};
//        Arrays.sort(arr, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                if (o1.length() > o2.length()) return 1;
//                else if (o1.length() < o2.length()) return -1;
//                else return 0;
//            }
//        });
        Arrays.sort(arr , ((o1, o2) -> o1.length()-o2.length()));



        for (String s : arr) {
            System.out.println(s);
        }


    }
}
