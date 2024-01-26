import java.util.HashMap;

public class Abbreviations{
    
    private HashMap<String,String> hashmap;
    
    
    
    public Abbreviations(){
        
        this.hashmap = new HashMap<>();
        
    }
    
    public void addAbbreviation(String abbreviation, String explanation){
        /*adds a new abbreviation and its explanation.*/
        
        if(!hasAbbreviation(abbreviation)){
            hashmap.put(abbreviation,explanation);
        }
        else
            System.out.println("Already added!");
    }
    
    
    public boolean hasAbbreviation(String abbreviation){
        /*checks if an abbreviation has already been added; returns true if it has and false if it has not.*/
        if (hashmap.containsKey(abbreviation)) {
            return true;
        }
        else
            return false;
    }
    
    public String findExplanationFor(String abbreviation){
        /*finds the explanation for an abbreviation; returns null if the abbreviation has not been added yet.*/
        if(hasAbbreviation(abbreviation)){
        
        return hashmap.get(abbreviation);
        }
        else
        return null;
    }
    /*[0.089s][warning][os,thread] Failed to start thread - pthread_create failed (EAGAIN) for attributes: stacksize: 1024k, guardsize: 0k, detached.
Error occurred during initialization of VM
java.lang.OutOfMemoryError: unable to create native thread: possibly out of memory or process/resource limits reached*/
    
}
