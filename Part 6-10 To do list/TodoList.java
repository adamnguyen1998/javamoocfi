import java.util.*;

public class TodoList{
    private ArrayList<String> tasks;
    
    
    public TodoList(){
        this.tasks = new ArrayList<>();
    }
    
    
    public void add(String task){
        //public void add(String task) - add the task passed as a parameter to the todo list.
        this.tasks.add(task);
    }
    
    
    public void print(){
        int count = 1;
        //public void print() - prints the exercises. Each task has a number associated with it on the print statement — use the task's index here (+1).
        for (String s: tasks){
            System.out.print(count + ": ");
            System.out.println(s);
            count++;
        }
    }
    
    public void remove(int number){
        //public void remove(int number) - removes the task associated with the given number; the number is the one seen associated with the task in the print.
        //this.tasks.remove(this.tasks.contains((Integer.valueOf(number - 1))));
        /*for (int i=0;i< this.tasks.size();i++){
        if(this.tasks.contains(number)){
            this.tasks.remove(this.tasks.get(i));
        }
        }*/
        this.tasks.remove(this.tasks.get(number - 1));
    }
    
    
}
