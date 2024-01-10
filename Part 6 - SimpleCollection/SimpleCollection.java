
//import java.util.ArrayList;
import java.io.*;
import java.util.*;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public void removeAll(){
        this.elements.clear();
    }

    public String toString() {
        
        String output = "";

        if (this.elements.isEmpty()){
            return "The collection alphabet is empty.";
        }
        
        for (String e: elements){
            
            if (e.equals(elements.get(elements.size()-1))){
            output += e;
            }
            
            else{
                output += e + "\n";
            }
            
        }
        
        String stringOutput1 = "The collection alphabet has " + getElements().size() + " element: \n" 
        + output;
        
        String stringOutput2 = "The collection alphabet has " + getElements().size() + " elements: \n" 
        + output;
        
        if (getElements().size() == 1){
        return stringOutput1;
        }
        
        
        return stringOutput2;
        
        
    }

}
