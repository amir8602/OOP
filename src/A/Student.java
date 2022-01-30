package A;

public class Student extends Person {
    private Book book;
    private String sid;

    public Student(String name, String family, Integer age, Book book, String sid) {
        super(name, family, age);
        this.book = book;
        this.sid = sid;
    }

    public Student() {
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    @Override
    public String toString() {
        return String.format("[name : %s - family : %s - age :  %d ]", this.getName(), this.getFamily(), this.getAge());
    }

    public void talk(){
        System.out.println("Student talk");
    }

    @Override
    public boolean equals(Object obj) {

        Student caller = this;
        if(!(obj instanceof Student)){
            System.out.println("insta");
        }
        Student argument = (Student) obj;
        if (caller.getName().equals(argument.getName()))
            if (caller.getFamily().equals(argument.getFamily()))
                if (caller.getAge()==argument.getAge())
                    return true;
        return false;
    }
}
