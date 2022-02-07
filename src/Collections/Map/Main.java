package Collections.Map;

import Collections.Person;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer , String> map = new HashMap<Integer , String>();
        map.put(12,"reza");
        map.put(19,"javad");
        map.put(12,"davood");
        System.out.println(map.size());
        System.out.println(map.get(12));



        Map<Integer , Person> personalData = new HashMap<Integer , Person>();
        personalData.put(123456789,new Person(34 , "peyman","dodange"));
        personalData.put(129845849,new Person(25 , "Amir","Ghaderi"));
        personalData.put(198496789,new Person(34 , "Fateme","farahani"));

        Person person = personalData.get(123456789);
        System.out.println(person);


    }
}
