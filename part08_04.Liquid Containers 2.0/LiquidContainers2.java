import java.util.*;
public class LiquidContainers2{
    
	public static void main(String[] args) {
		System.out.println("Hello World. Add, move, remove, or quit.");
		
		Container firstContainer = new Container();
		Container secondContainer = new Container();
		final int max = 100;
		final int min = 0;
		
		while (true){
		//System.out.println(firstContainer);
		String first = "First: " + firstContainer;
		String second = "Second: " + secondContainer;
		//System.out.println(firstContainer);
		
		System.out.println(first + "\n" + second);
		System.out.println("Input command: ");
		
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
        String[] parts = input.split(" ");

        //String command = parts[0];
        //int amount = Integer.valueOf(parts[1]);
        
        if (parts.length == 1){
            if (parts[0].toLowerCase().equals("quit")){
                System.out.println("Shutting down...");
                return;
            }
            else
                continue;
        }
        String command = parts[0];
        int amount = Integer.valueOf(parts[1]);
        
        switch (command.toLowerCase()){
                
            case "add":
                if(amount >= 0){
                    //System.out.println("HELLO");
                    if (firstContainer.contains() + amount <= max){
                        //System.out.println(firstContainer);
                        firstContainer.add(amount);
                        //System.out.println(firstContainer);
                    }
                    else{
                        firstContainer.set(max);
                    }
                }
                else{
                    System.out.println("Whole numbers please!");
                }
                break;
            case "move":    
                if (amount >= 0){
                    if (firstContainer.contains() - amount >= min){
                        if (secondContainer.contains() + amount <= max){
                        firstContainer.remove(amount);
                        secondContainer.add(amount);
                        }
                        else{
                        secondContainer.set(max);
                        firstContainer.remove(amount);
                        }
                    }
                    else if(firstContainer.contains() - amount < min){
                        if (secondContainer.contains() + firstContainer.contains() <= max){
                            
                        
                        
                        secondContainer.add(firstContainer.contains());
                        
                        firstContainer.set(min);
                        //System.out.println("HELLO");
                        }
                        else{
                            //System.out.println("HELLO");
                        secondContainer.set(max);
                        firstContainer.set(min);
                        }
                    }
                    
                    }
                else{
                System.out.println("Whole numbers please!");
                }
                break; 
            case "remove":
                if (amount >= 0){
                    if (secondContainer.contains() - amount >= min){
                        secondContainer.remove(amount);
                    }
                    else
                        secondContainer.set(min);
                }
                else
                System.out.println("Whole numbers please!");
                break;
            
            }
        } //end while loop bracket
	}
	}

