import java.util.ArrayList;

public class Package{
    private ArrayList<Gift> gifts;
    
    
    public Package(){
        this.gifts = new ArrayList<>();
    }
    
    public void addGift(Gift gift){
        //Method public void addGift(Gift gift), which adds the gift passed as a parameter to the package. The method returns no value.
        gifts.add(gift);
    }
    
    
    
    public int totalWeight(){
        
        int total = 0;
        //Method public int totalWeight(), which returns the total weight of the package's gifts.
        for (Gift i: gifts){
            total = total + i.getWeight();
        }
        
        return total;
    }
    
    
}