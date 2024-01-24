import java.util.*;

public class TodoList{
    
    private ArrayList<String> list;
    
    
    public TodoList(){
        this.list = new ArrayList<>();
        
    }
    
    
    public void add(String task){
        /* - add the task passed as a parameter to the todo list.*/
        list.add(task);
    }
    
    public void print(){
        /*- prints the exercises. Each task has a number associated with it on the print statement — use the task's index here (+1).*/
        int i = 1;
        for (String tasks: list){
            System.out.println(i +": " + tasks);
            i++;
        }
    }
    
    public void remove(int number){
        /*- removes the task associated with the given number; the number is the one seen associated with the task in the print.*/
        list.remove(number - 1);
    }
    
    public void clear(){
        list.clear();
    }
}