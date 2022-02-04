package Generic;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = {2, 2, 3, 4, 5};
       // PrintUtil.printInteger(arr);
        System.out.println();
        Double[] doubles = {2.4, 3.6, 9.8};
       // PrintUtil.printInteger(doubles);
        System.out.println();
        String[] strings = {"amir", "reza"};
       // PrintUtil.printInteger(strings);

        Person[] people = new Person[2];
        people[0] = new Person("a", "b", 10);
        people[1] = new Person("c", "d", 20);
      //  PrintUtil.printInteger(people);

        System.out.println(PrintUtil.maxx(12, 55, 50));


    }
}
