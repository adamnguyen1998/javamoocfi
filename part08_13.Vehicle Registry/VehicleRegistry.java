    import java.util.HashMap;
    import java.util.ArrayList;
    import java.util.*;

public class VehicleRegistry{
    

    private String owner;
    private HashMap<LicensePlate,String> hashmap;
    
    public VehicleRegistry(){
        
        this.owner = owner;
        this.hashmap = new HashMap<>();
        
    }
    
    
    public boolean add(LicensePlate licensePlate, String owner){
        /*assigns the owner it received as a parameter to a car that corresponds to the license plate received as a parameter. 
        If the license plate doesn't have an owner, the method returns true. 
        If the license already has an owner attached, the method returns false and does nothing.*/
        
        if (!hashmap.containsKey(licensePlate)){
            
            hashmap.put(licensePlate,owner);
            
            return true;
        }
        return false;
        
    }
    
    public String get(LicensePlate licensePlate){
        /*returns the owner of the car corresponding to the license plate received as a parameter. 
        If the car isn't in the registry, the method returns null.*/
        
        if (hashmap.containsKey(licensePlate)){
            return hashmap.get(licensePlate);
        }
        return null;
    }
    
    
    public boolean remove(LicensePlate licensePlate){
        /*removes the license plate and attached data from the registry. 
        The method returns true if removed successfully and false if the license plate wasn't in the registry.*/
        if (hashmap.containsKey(licensePlate)){
            hashmap.remove(licensePlate);
            return true;
        }
        else
            return false;
    }
    
    public void printLicensePlates(){
        /*prints the license plates in the registry.*/
        for (LicensePlate licensePlate: hashmap.keySet()){
            System.out.println(licensePlate);
        }
        
    }
    
    public String getOwner(){
        return owner;
    }
    
    public void printOwners(){
        /*prints the owners of the cars in the registry. 
        Each name should only be printed once, even if a particular person owns more than one car.*/
        
        /*Useful tip! In the printOwners method, you can create a list used for remembering the owners that were already printed. 
        If an owner is not on the list, their name is printed and they are added to the list; 
        conversely, if an owner is on the list, their name isn't printed.*/
        
        ArrayList<String> owners = new ArrayList<>();
        
        for (String owner: hashmap.values()){
            if (!owners.contains(owner)){
                owners.add(owner);
            }
        }
        
        for (String i: owners){
            System.out.println(i);
        }
        
    }
    
    
    
}
