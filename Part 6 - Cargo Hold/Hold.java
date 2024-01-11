import java.util.ArrayList;

public class Hold{
    
    private int maxWeight;
    private ArrayList<Suitcase> storage; 
    private int count = 0;
    private int weight = 0;
    
    public Hold(int maxWeight){
        this.maxWeight = maxWeight;
        this.storage = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase){
        if(this.weight + suitcase.totalWeight() <= this.maxWeight){
        this.storage.add(suitcase);
        this.weight += suitcase.totalWeight();
        count++;
        }
    }
    
    public int totalWeight(){
        return this.weight;
    }
    
    public void printItems(){
        for(Suitcase stuff: storage){
            stuff.printItems();
        }
    }
    
    public String toString(){
        //"x suitcases (y kg)"
        return this.count+" suitcases (" + this.weight +" kg)";
    }
}