package Collections;

import java.util.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        String []strings = new String[5];
//        strings[0]="ali";
//
//        ArrayList<String> strings1 = new ArrayList<String>();
//        strings1.add("amir");
//        ArrayList<Integer> integers =new ArrayList<Integer>();
//        integers.add(3);
//        integers.add(45);
//        integers.set(1,30);
//        integers.add(1,50);

        List <String> strings1 = new LinkedList<String>();





        Person person = new Person(20,"reza","akbari");
        ArrayList <Person> personArrayList =new ArrayList<Person>();
        personArrayList.add(person);
        personArrayList.add(new Person(30,"sara","rahmati"));
        for (Person person1 : personArrayList) {
            System.out.println(person1);
        }

        Scanner scanner = new Scanner(System.in);
        String [] strings = scanner.nextLine().split(" ");
        personArrayList.remove(new Person(strings[0] , strings[1]));

        for (Person person1 : personArrayList) {
            System.out.println(person1);
        }


        Person [] dummy = personArrayList.toArray(new Person[personArrayList.size()]);
        ArrayList<Person> personArrayList1 = new ArrayList<Person>(Arrays.asList(dummy));



    }




}
