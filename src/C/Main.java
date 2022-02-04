package C;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("javad", "akbari", 22);
        Person person1 = new Person("reza", "mahmoodi", 24);
        Person person2 = new Person("sara", "kamali", 19);
        Person person4 = new Person("saraaaa", "kamaliiii", 26);

        Person[] people = new Person[4];
        people[0] = person;
        people[1] = person1;
        people[2] = person2;
        people[3] =person4;



        System.out.println("by age-------------------------------------------------------");

        Arrays.sort(people);

        for (Person person3 : people) {
            System.out.println(person3);
        }

//---------------------------------------------------------------------------------------------------------
        System.out.println("by name------------------------------------------------------");
        NameCompare nameCompare = new NameCompare();
        Arrays.sort(people,nameCompare);

        for (Person person3 : people) {
            System.out.println(person3);
        }


//---------------------------------------------------------------------------------------------------------
        System.out.println("by family----------------------------------------------------");

        FamilyCompare familyCompare = new FamilyCompare();
        Arrays.sort(people,familyCompare);

        for (Person person3 : people) {
            System.out.println(person3);
        }

        Person pp = new Person();
        pp=null;
        for (int i = 0; i <1000000000 ; i++) {
            System.gc();
        }





//        Arrays.sort(people, new Comparator<Person>() {
//
//
//                @Override
//                public int compare(Person o1, Person o2) {
//                    if(o1.getAge()>o2.getAge())return 1;
//                    else if (o1.getAge()<o2.getAge()) return -1;
//                    else return 0;
//
//            }
//        });
//
//        for (Person item : people) {
//            System.out.println(item);
//        }
//
//
//        String[] arr = {"zzzzzz", "cde", "fghi", "ab"};
//        Arrays.sort(arr, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                if (o1.length() > o2.length()) return 1;
//                else if (o1.length() < o2.length()) return -1;
//                else return 0;
//            }
//        });
//        Arrays.sort(arr , ((o1, o2) -> o1.length()-o2.length()));
//
//
//
//        for (String s : arr) {
//            System.out.println(s);
//        }
//

    }
}
