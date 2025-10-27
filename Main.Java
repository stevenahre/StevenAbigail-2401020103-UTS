// ===== MAIN CLASS =====
public class Main {
    public static void main(String[] args) {
        System.out.println("===== SOAL 1: Class dan Object =====");
        Course course1 = new Course("Object-Oriented Programming", 3, "Pak dodit");
        course1.displayInfo();
        
        System.out.println("\n===== SOAL 2: Encapsulation =====");
        Course course2 = new Course("Data Structures", 4, "Pak Budi");
        System.out.println("Kredit: " + course2.getCredit());
        course2.setCredit(-2);
        course2.setCredit(3);
        System.out.println("Jumlah Kredit : " + course2.getCredit());
        
        System.out.println("\n===== SOAL 3: Relationship (Aggregation) =====");
        Student student1 = new Student("Aldi", "S001");
        student1.enrollCourse(course1);
        student1.displayInfo();
        
        System.out.println("\n===== SOAL 4: Inheritance dan Polymorphism =====");
        Person[] people = new Person[3];
        people[0] = new Person("Jono", 25);
        people[1] = new StudentPerson("Emma", 20, "S002");
        people[2] = new Lecturer("Pak dodit", 45, "L001");
        
        for (Person person : people) {
            person.introduce(); 
        }
        
        System.out.println("\n===== SOAL 5: Abstract Class & Interface =====");
        Assessment exam = new Exam("UTS", 100, 85);
        Assessment assignment = new Assignment("Project 1", 100, 80, 10);
        
        exam.displayInfo();
        System.out.println("Nilai Akhir: " + exam.calculateFinalScore() + "%");
        
        assignment.displayInfo();
        System.out.println("Nilai Akhir: " + assignment.calculateFinalScore() + "%");
        
        GradableExam gradableExam = new GradableExam("UAS", 100, 90);
        System.out.println("\nPenilaian Akhir: " + gradableExam.getGrade() + "%");
    }
}