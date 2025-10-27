// ===== SOAL 2: Encapsulation =====
public class Course {
    private String courseName;
    private int credit;
    private String instructor;
    
    public Course(String courseName, int credit, String instructor) {
        this.courseName = courseName;
        this.credit = credit;
        this.instructor = instructor;
    }
    
    public void displayInfo() {
        System.out.println("Nama Mata Kuliah: " + courseName);
        System.out.println("Jumlah SKS: " + credit);
        System.out.println("Dosen Pengampu: " + instructor);
    }
    
    public int getCredit() {
        return credit;
    }
    
    public void setCredit(int credit) {
        if (credit > 0) {
            this.credit = credit;
        } else {
            System.out.println("Kredit harus lebih dari 0!");
        }
    }
    
    public String getCourseName() {
        return courseName;
    }
}
