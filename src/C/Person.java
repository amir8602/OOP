package C;

import java.util.Comparator;

public class Person implements Comparable<Person> {
    private String name;
    private String family;
    private Integer age;

    public Person(String name, String family, Integer age) {
        this.name = name;
        this.family = family;
        this.age = age;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void talk(){
        System.out.println("Person talk");
    }


    @Override
    protected void finalize() throws Throwable {
        System.out.printf("object destroy %s" , this.getName());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", family='" + family + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        if (this.getAge()>o.getAge())return 1;
        else if (this.getAge()<o.getAge()) return -1;
        else return 0;
    }

//    @Override
//    public int compareTo(Person o) {
//        Person caller = this;
//        Person person = o;
//        if (caller.getAge()>person.getAge())
//            return 1;
//        else if(caller.getAge()<person.getAge())
//            return -1;
//        else return 0;
//    }

//    @Override
//    public int compare(Person o1, Person o2) {
//        if(o1.getAge()>o2.getAge())return 1;
//        else if (o1.getAge()<o2.getAge()) return -1;
//        else return 0;
//    }
}
