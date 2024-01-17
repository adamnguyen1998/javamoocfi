import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> points;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.points = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrades(points));
        this.points.add(points);
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received: this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public static int pointsToGrades(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }
    
    public double averageOfGrades(){
        
        double sum = 0;
        int count = 0;
        
        for (double grade: grades){
            sum += grade;
            count++;
        }
        
        if (count == 0){
            return -1;
        }
        
        double average = sum/count;
        
        return average;
        
    }
    
    public double averageOfPoints() {
        
        if (points.isEmpty()){
            return (int) -1;
        }
        
        double sum = 0;
        
        for (double point: points){
            sum += point;
        } 
        
        double average = sum/points.size();
        
        return average;
    }
}
