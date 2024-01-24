import java.util.*;

public class UserInterface{
    
    private TodoList todoList;
    private Scanner scanner;
    
    public UserInterface(TodoList todoList, Scanner scanner){
        this.todoList = todoList;
        this.scanner = scanner;
    }
    
    public void start(){
        while (true){
            
            System.out.println("Input command: ");
            //Scanner scanner = new Scanner (System.in);
            
            String input = scanner.nextLine();
            
            switch (input.toLowerCase()){
                
                case "stop":
                    System.out.println("Shutting down...");
                    return;
                
                case "add":
                    
                    System.out.println("To add: ");
                    input = scanner.nextLine();
                    todoList.add(input);
                    
                break;
                
                case "list":
                    
                    todoList.print();
                    
                break;
                
                case "remove":
                    System.out.println("Which one to remove?");
                    int number = Integer.valueOf(scanner.nextLine());
                    todoList.remove(number);
                    
                break;
                
                
                
            }
            
            
            
        }
        
        
        
        
        
    }
    
    
}