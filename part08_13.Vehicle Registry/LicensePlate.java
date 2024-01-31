import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
public class LicensePlate {
    
    
    
    
    // these instance variables have been defined as final, meaning
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }
    
    public boolean equals(Object object){
        
        if (this == object){
            return true;
        }
        
        if (!(object instanceof LicensePlate)){
            return false;
        }
        
        LicensePlate comparedObject = (LicensePlate) object;
        
        if (this.liNumber == comparedObject.liNumber && this.country == comparedObject.country){
            return true;
        }
        
        return false;
        
    }
    
    public int hashCode(){
        
        if (this.country == null){
            return Objects.hash(liNumber);
        }
        
        return Objects.hash(this.liNumber,this.country);
        
    }
    
    
    public static void main(String[] args){
                LicensePlate li1 = new LicensePlate("FI", "ABC-123");
        LicensePlate li2 = new LicensePlate("FI", "UXE-465");
        LicensePlate li3 = new LicensePlate("D", "B WQ-431");

        ArrayList<LicensePlate> finnishPlates = new ArrayList<>();
        finnishPlates.add(li1);
        finnishPlates.add(li2);

        LicensePlate newLi = new LicensePlate("FI", "ABC-123");
        if (!finnishPlates.contains(newLi)) {
            finnishPlates.add(newLi);
        }
        System.out.println("finnish: " + finnishPlates);
        // if the equals-method hasn't been overwritten, the same license number will be added to the list againg

        HashMap<LicensePlate, String> owners = new HashMap<>();
        owners.put(li1, "Arto");
        owners.put(li3, "Jürgen");

        System.out.println("omistajat:");
        System.out.println(owners.get(new LicensePlate("FI", "ABC-123")));
        System.out.println(owners.get(new LicensePlate("D", "B WQ-431")));
        // if the hasCode-method hasn't been overwritten, the owners won't be found
    }
}
