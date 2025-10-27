// ===== SOAL 3: Relationship (Aggregation) =====
public class Student {
    private String name;
    private String studentId;
    private Course enrolledCourse;
    
    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
    }
    
    public void enrollCourse(Course course) {
        this.enrolledCourse = course;
        System.out.println(name + " telah mendaftar ke mata kuliah " + course.getCourseName());
    }
    
    public void displayInfo() {
        System.out.println("Nama Mahasiswa: " + name);
        System.out.println("NIM: " + studentId);
        if (enrolledCourse != null) {
            System.out.println("Mata Kuliah yang Diambil: " + enrolledCourse.getCourseName());
        }
    }
}
