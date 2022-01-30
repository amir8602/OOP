package A;

public class Person {
    private String name;
    private String family;
    private Integer age;

    public Person(String name, String family, Integer age) {
        this.name = name;
        this.family = family;
        this.age = age;
    }

    public Person() {
        System.out.println("hi");
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

    public void talk() {
        System.out.println("Person talk");
    }
}
