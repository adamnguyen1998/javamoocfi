/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main{
	public static void main(String[] args) {
	    Statistics grades = new Statistics();
	    Scanner scanner = new Scanner(System.in);
	    
        grades.enterGrades();
        grades.pointAverage();
        grades.passingPointAverage();
        grades.passPercentage();
        grades.gradeDistribution();
        System.out.println(grades);
	}
		/*public static void enterGrades(ArrayList<Integer> grades, Scanner scanner){
		    	    //ArrayList<Integer> grades = new ArrayList<>();
	    //Scanner scanner = new Scanner(System.in);
	    
		System.out.println("Enter point totals, -1 stops:");
		
		while (true){
		    
		    
		    int grade = Integer.valueOf(scanner.nextLine());
		    
		    if (grade == -1){
		        break;
		    }
		    else if(grade >= 0 && grade <= 100){
		    grades.add(grade);
		    }
		    else {
		        System.out.println("Enter range [0-100]");
		    }
		}
	    }*/
	    
	    /*public static void pointAverage(ArrayList<Integer> grades, Scanner scanner){
	        int total = 0;
	        for (int i = 0; i<grades.size();i++){
	            total += grades.get(i);
	        }
	        double pointAverage = (double) total/grades.size();
	        System.out.println("Point average (all): " + pointAverage);
	    } */
}
