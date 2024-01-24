import java.util.Scanner;
public class AverageOfPositiveNumbers
{
	public static void main(String[] args) {
	    
	    Scanner scanner = new Scanner(System.in);
		
		System.out.println("Give positive numbers and average of them will be calculated.");
		
		double total = 0;
		int count = 0;
		double number = 0.0;
		
		while(true){
		    
		String input = scanner.nextLine();
		
		/*if (input.equals("0")){
		    System.out.println("Okay");
		break;
		}*/
		
		/*if(scanner.hasNextInt()||scanner.hasNextDouble()) {
        
		number = Double.valueOf(input);
		
		}
		
		else{
		System.out.println("Numbers only.");
		continue;
		}*/
		
		number = Double.valueOf(input);
		
		if (number == 0){
		    System.out.println("Input ended and will calculate average...");
		    break;
		}
		
		if (number < 0){
		    System.out.println("Positive numbers only! Or \"0\" to end inputs...");
		    continue;
		}
		count++;
		total+= number;
		}
		
		double average = total/count;
		
		if (count != 0){
		System.out.println("Average is " + average);
		}
		else{
		    System.out.println("Cannot calculate the average");
		}
		
	}
}
