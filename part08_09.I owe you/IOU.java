import java.util.HashMap;

public class IOU
{
    //private String person;
    //private int amount;
    
    private HashMap<String,Double> hashmap;
    
    
    public IOU(){
        //this.person = person;
        //this.amount = amount;
        this.hashmap = new HashMap<>();
        
    }
    
    
    public void setSum(String toWhom, double amount){
        /*saves the amount owed and the person owed to to the IOU.*/
        hashmap.put(toWhom,amount);
    }
    
    
    public double howMuchDoIOweTo(String toWhom){
        /*returns the amount owed to the person whose name is given as a parameter. If the person cannot be found, it returns 0.*/
        return hashmap.getOrDefault(toWhom, (double) 0);
    }
    
    
    
    
    
	public static void main(String[] args) {
		IOU mattsIOU = new IOU();
mattsIOU.setSum("Arthur", 51.5);
mattsIOU.setSum("Michael", 30);

System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));
System.out.println(mattsIOU.howMuchDoIOweTo("Michael"));

System.out.println("");

mattsIOU.setSum("Arthur", 10.5);

System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));
	}
}
