package A;

public class Main {
    public static void main(String[] args) {
//        Student s = new Student();
//        s.setName("davoood");
//        Object o = new Student();
//        System.out.println(o.getClass());
//        Class x = Person.class;
//        System.out.println(x);
//        Book book = new Book();
//        Student student = new Student("Amir" , "Amiri" , 12 , book , "123");
//        System.out.println(student.toString());
//        Student student2 = new Student("Amir" , "Amiri" , 12 , book , "123");
//        System.out.println(student.equals(student2));
//
        Student student = new Student();
        Person person = new Person();
        Student student1 = (Student) new Person();
        Person person1 = new Student();
        student1.getBook();


    }
}
