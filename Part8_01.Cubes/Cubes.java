import java.util.Scanner;
public class Cubes
{
	public static void main(String[] args) {
	    /*Write a program that reads strings from the user until the user inputs the string "end". 
	    As long as the input is not "end" the program should handle the input as an integer 
	    and print the cube of the integer (meaning number * number * number). Below are some sample outputs*/
		System.out.println("Hello World");
		Scanner scanner = new Scanner (System.in);
		
		while (true){
		
		System.out.println("Input numbers for the cube versions and input \"end\" to finish program");
		
		String input = scanner.nextLine();
		
		
		if (input.equals("end")){
		    System.out.println("Ending...");
		    break;
		}
		
		int number = Integer.valueOf(input);
		
		int cube = (int) Math.pow(number,3);
		
		System.out.println("Cube is this: " + cube);
		
		}
		
	}
}
