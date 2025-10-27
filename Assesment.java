
// ===== SOAL 5: Abstract Class & Interface =====
interface Gradable {
    String getGrade();
}

abstract class Assessment {
    protected String title;
    protected int maxScore;
    protected int score;
    
    public Assessment(String title, int maxScore, int score) {
        this.title = title;
        this.maxScore = maxScore;
        this.score = score;
    }
    
    public abstract double calculateFinalScore();
    
    public void displayInfo() {
        System.out.println("\nJudul: " + title);
        System.out.println("Skor Maksimal: " + maxScore);
        System.out.println("Skor: " + score);
    }
}

class Exam extends Assessment {
    public Exam(String title, int maxScore, int score) {
        super(title, maxScore, score);
    }
    
    @Override
    public double calculateFinalScore() {
        return (double) score / maxScore * 100;
    }
}

class Assignment extends Assessment {
    private int bonus;
    
    public Assignment(String title, int maxScore, int score, int bonus) {
        super(title, maxScore, score);
        this.bonus = bonus;
    }
    
    @Override
    public double calculateFinalScore() {
        double baseScore = (double) score / maxScore * 100;
        return Math.min(baseScore + bonus, 100);
    }
}

class GradableExam extends Exam implements Gradable {
    public GradableExam(String title, int maxScore, int score) {
        super(title, maxScore, score);
    }
    
    @Override
    public String getGrade() {
        double finalScore = calculateFinalScore();
        if (finalScore >= 85) return "A";
        else if (finalScore >= 70) return "B";
        else if (finalScore >= 55) return "C";
        else if (finalScore >= 40) return "D";
        else return "E";
    }
}
