import java.util.ArrayList;

public class Suitcase{
    private ArrayList<Item> items;
    private int maxWeight;
    private int count;
    private int weight;
    
    public Suitcase(int maxWeight){
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
        this.count = 0;
        this.weight = 0;
    }
    
    public void addItem(Item item){
        
        //System.out.println(item.getWeight());
        
        if(this.weight + item.getWeight() <= this.maxWeight){
        this.items.add(item);
        this.weight+= item.getWeight();
        count++;
        }
    }
    
    public void printItems(){
        for (Item s: items){
            System.out.println(s);
        }
    }
    
    public int totalWeight(){
        return this.weight;
    }
    
    public Item heaviestItem(){
        Item heavy = items.get(0);
        for (Item compared: items){
            if (heavy.getWeight() < compared.getWeight()){
                heavy = compared;
            }
        }
        return heavy;
    }
    
    public String toString(){
        // "x items (y kg)"
        return this.count + " items " + " (" + this.weight + (" kg)");
        //return null;
    }
    
    
}