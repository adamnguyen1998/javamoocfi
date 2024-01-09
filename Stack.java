import java.util.ArrayList;

public class Stack{
    
    private ArrayList<String> stack;
    
    public Stack(){
        this.stack = new ArrayList<>();
    }
    
    public boolean isEmpty(){
        if (this.stack.size() == 0){
            return true;
        }
        
        return false;
    }
    
    public void add(String value){
        this.stack.add(value);
    }
    
    public ArrayList<String> values(){
        return this.stack;
    }
    
    public String take(){
        
        
        
        String i = this.stack.get(this.stack.size()-1);
        
        this.stack.remove(this.stack.size()-1);
        
        return i;
    }
    
    public static void main(String[] args){
        Stack s = new Stack();
        System.out.println(s.isEmpty());
        System.out.println(s.values());
        s.add("Value");
        System.out.println(s.isEmpty());
        System.out.println(s.values());
        String taken = s.take();
        System.out.println(s.isEmpty());
        System.out.println(s.values());
        System.out.println(taken);
        
        
s.add("1");
s.add("2");
s.add("3");
s.add("4");
s.add("5");//

while (!s.isEmpty()) {
    System.out.println(s.take());
}
    }
    
    
}