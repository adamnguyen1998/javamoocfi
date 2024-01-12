import java.util.*;

public class UserInterface{
    private TodoList todoList;
    private Scanner scanner;
    
    public UserInterface(TodoList todoList, Scanner scanner){
        this.todoList = todoList;
        this.scanner = scanner;
        
    }
    
    public void start(){
        while(true){
            
            
            //String input = scanner.nextLine();
            System.out.println("Command: ");
            String input = scanner.nextLine();
            //System.out.println(input+ "2");
            //System.out.println("2");
            //System.out.print("Command: ");
            
            switch (input){
                
                case "stop":
                    stop();
                    return;
                
                case "add":
                    add();
                    break;
                
                case "list":   
                    list();
                    break;
                case "remove": 
                    remove();
                    break;
                    
                    
                default:
                    System.out.println("???");
                    break;
                
                
            }
        }
    }    
    public void stop(){
        System.out.println("Shutting down: ");
        return;
    }
    
    public void add(){
        System.out.print("To add: ");
        String input = scanner.nextLine();
        this.todoList.add(input);
    }
    
    public void list(){
        this.todoList.print();
    }
    
    public void remove(){
        System.out.print("Which one is removed? ");
        int input = Integer.valueOf(scanner.nextLine());
        this.todoList.remove(input);
        /*System.out.print("Which one is removed? ");
        int index = scanner.nextInt();
        
        todoList.remove(index);*/
    }
        
    
}
