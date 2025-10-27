// ========== SOAL 1 - Class dan Object ==========
class Course {
    private String courseName;
    private int credit;
    private String instructorName;
    
    public Course(String courseName, int credit, String instructorName) {
        this.courseName = courseName;
        this.credit = credit;
        this.instructorName = instructorName;
    }
    
    public void displayInfo() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Credit: " + credit);
        System.out.println("Instructor: " + instructorName);
        System.out.println("------------------------");
    }
}
