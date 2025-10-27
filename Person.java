// ===== SOAL 4: Inheritance dan Polymorphism =====
public class Person {
    protected String name;
    protected int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void introduce() {
        System.out.println("Halo, nama saya " + name + " dan saya berumur " + age + " tahun.");
    }
}

class StudentPerson extends Person {
    private String studentId;
    
    public StudentPerson(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }
    
    @Override
    public void introduce() {
        System.out.println("Halo, nama saya " + name + ", saya berumur " + age + " tahun, dan NIM saya adalah " + studentId + ".");
    }
}

class Lecturer extends Person {
    private String lecturerId;
    
    public Lecturer(String name, int age, String lecturerId) {
        super(name, age);
        this.lecturerId = lecturerId;
    }
    
    @Override
    public void introduce() {
        System.out.println("Halo, nama saya " + name + ", saya berumur " + age + " tahun, dan saya adalah dosen dengan ID " + lecturerId + ".");
    }
}
