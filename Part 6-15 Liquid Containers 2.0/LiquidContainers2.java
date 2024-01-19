import java.util.Scanner;
import java.util.ArrayList;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //int firstContainer = 0;
        //int secondContainer = 0;
        
        Container firstContainer = new Container();
        Container secondContainer = new Container();

        while (true) {
            System.out.println("First: "+ firstContainer);
            System.out.println("Second: "+ secondContainer);
            String input = scan.nextLine();
            String[] parts = input.split(" ");
            if (parts.length == 1) {
                if (parts[0].equals("quit")) {
                    break;
                }
            } else {
                String command = parts[0];
                int amount = Integer.valueOf(parts[1]);
                switch (command) {
                    case "add":
                        if (firstContainer.contains() + amount <= 100 && amount >= 0) {
                            firstContainer.add(amount);
                        } else if(amount >=0) {
                            firstContainer.setAmount(100);
                        }
                        else{
                            System.out.println("Whole Numbers please!");
                        }
                        break;
                    case "move":
                        if (firstContainer.contains() - amount >= 0 && amount >= 0) {
                            if (secondContainer.contains() + amount <= 100) {
                                
                                    firstContainer.remove(amount);
                                    secondContainer.add(amount);
                                 
                            } else {
                                firstContainer.remove(amount);
                                secondContainer.setAmount(100);
                            }
                        } else if(amount >= 0) {
                            if (secondContainer.contains() + firstContainer.contains() <= 100){
                            secondContainer.add(firstContainer.contains());
                            firstContainer.setAmount(0);
                            }
                            else{
                            secondContainer.setAmount(100);
                            firstContainer.setAmount(0);
                            }
                        } else {
                            System.out.println("No negative numbers please!");
                        }     
                        break;
                    case "remove":
                        if (secondContainer.contains() - amount >= 0 && amount >= 0) {
                            secondContainer.remove(amount);
                        } else if(amount >=0){
                            secondContainer.setAmount(0);
                        }
                        else {
                            System.out.println("No negative numbers please!");
                        }
                }    
            }         
        }
    }
}
