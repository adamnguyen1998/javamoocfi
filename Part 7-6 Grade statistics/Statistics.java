import java.util.*;

public class Statistics{
    private ArrayList<Integer> grades;
    private ArrayList<Integer> passingGrades;
    //private Scanner scanner;
    
    public Statistics(){
        
        this.grades = new ArrayList<>();
        this.passingGrades = new ArrayList<>();
        //this.scanner = scanner;
    }
    
    
    public void enterGrades(){
		//ArrayList<Integer> grades = new ArrayList<>();
		//String test = "-42\n24\n42\n72\n80\n52\n-1\n";
		
	    //Scanner scanner = new Scanner(test);
	    Scanner scanner = new Scanner(System.in);
	    
		System.out.println("Enter point totals, -1 stops:");
		
		while (true){
		    
		    
		    int grade = Integer.valueOf(scanner.nextLine());
		    
		    if (grade == -1){
		        break;
		    }
		    else if(grade >= 0 && grade <= 100){
		    this.grades.add(grade);
		    if (grade >=50){
		        passingGrades.add(grade);
		    }
		    }
		    else {
		        System.out.println("Enter range [0-100]");
		    }
		}
	    }
    
    public void pointAverage(){
	        int total = 0;
	        for (int i = 0; i<grades.size();i++){
	            total += grades.get(i);
	        }
	        double pointAverage = (double) total/grades.size();
	        System.out.println("Point average (all): " + pointAverage);
	    }
	    
	 public void passingPointAverage(){
	        double total = 0;
	        for (int i = 0; i<passingGrades.size();i++){
	            total += passingGrades.get(i);
	        }
	        double pointAverage = total/passingGrades.size();
	        
	        if (passingGrades.isEmpty()){
	            System.out.println("Point average (all): -");
	        }
	        else
	        System.out.println("Point average (passing): " + pointAverage);
	 }
	 
	 public void passPercentage(){
	        double percentage = (passingGrades.size() * 100.0) / grades.size();
	        System.out.println("Pass percentage: " + percentage);
	        
	 }
	 
	public void gradeDistribution() {
        int grades[] = new int[] {0, 0, 0, 0, 0, 0};
        for (int points : this.grades)
            if (points < 50)
                grades[0]++;
            else if (points < 60)
                grades[1]++;
            else if (points < 70)
                grades[2]++;
            else if (points < 80)
                grades[3]++;
            else if (points < 90)
                grades[4]++;
            else if (points <= 100)
                grades[5]++;
            printStars(grades);    
	}
	
	public void printStars(int[] grades){
	    System.out.println("Grade distribution: ");
	    
	    for (int i = grades.length-1; i >= 0; i--){
	        System.out.print(i + ": "); 
	        for (int j = 0; j < grades[i]; j++){
	        System.out.print("*");
	        }
	        System.out.println();
	    }
	}
	
	
	
	
	 public String toString(){
	     return "Hello, World!";
	 }
    
}