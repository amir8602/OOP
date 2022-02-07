package Collections;

public class Person implements Comparable {
    private int age;
    private String name;
    private String family;

    public Person(int age, String name, String family) {
        this.age = age;
        this.name = name;
        this.family = family;


    }

    public Person() {
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", family='" + family + '\'' +
                '}';
    }


    public Person(String name, String family) {
        this.name = name;
        this.family = family;
    }


    @Override
    public boolean equals(Object obj) {
        Person caller = this;
        Person arg = (Person) obj;
        if (caller.getName().equals(arg.getName()))
            if (caller.getFamily().equals(arg.getFamily()))
                return true;
        return false;
    }

    @Override
    public int compareTo(Object o) {
        Person arg = (Person) o;
        return this.getAge()-arg.getAge();
    }

    @Override
    public int hashCode() {
        return this.getName().hashCode()*31+age+this.getFamily().hashCode()*3;
    }
}
