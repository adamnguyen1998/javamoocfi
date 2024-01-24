/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class LiquidContainers
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		int firstContainer = 0;
		int secondContainer = 0;
		final int max = 100;
		final int min = 0;
		
		while (true){
		//System.out.println(firstContainer);
		String first = "First: " + firstContainer + "/100";
		String second = "Second: " + secondContainer + "/100";
		//System.out.println(firstContainer);
		
		System.out.println(first + "\n" + second);
		System.out.println("Input command: ");
		
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
        String[] parts = input.split(" ");

        //String command = parts[0];
        //int amount = Integer.valueOf(parts[1]);
        
        if (parts.length == 1){
            if (parts[0].equals("quit")){
                System.out.println("Shutting down...");
                return;
            }
            else
                continue;
        }
        String command = parts[0];
        int amount = Integer.valueOf(parts[1]);
        
        switch (command){
                
            case "add":
                if(amount >= 0){
                    //System.out.println("HELLO");
                    if (firstContainer + amount <= max){
                        //System.out.println(firstContainer);
                        firstContainer += amount;
                        //System.out.println(firstContainer);
                    }
                    else{
                        firstContainer = max;
                    }
                }
                else{
                    System.out.println("Whole numbers please!");
                }
                break;
            case "move":    
                if (amount >= 0){
                    if (firstContainer - amount >= min){
                        if (secondContainer + amount <= max){
                        firstContainer -= amount;
                        secondContainer += amount;
                        }
                        else{
                        secondContainer = max;
                        firstContainer -= amount;
                        }
                    }
                    else if(firstContainer - amount < min){
                        if (secondContainer + firstContainer <= max){
                            
                        
                        
                        secondContainer = secondContainer + firstContainer;
                        
                        firstContainer = min;
                        //System.out.println("HELLO");
                        }
                        else{
                            //System.out.println("HELLO");
                        secondContainer = max;
                        firstContainer = min;
                        }
                    }
                    
                    }
                else{
                System.out.println("Whole numbers please!");
                }
                break; 
            case "remove":
                if (amount >= 0){
                    if (secondContainer - amount >= min){
                        secondContainer -= amount;
                    }
                    else
                        secondContainer = min;
                }
                else
                System.out.println("Whole numbers please!");
                break;
            
            }
        } //end while loop bracket
	}
	}

