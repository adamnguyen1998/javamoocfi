public class Container{
    
    private int amount;
    final private int max;
    final private int min;
    
    public Container(){
        
        this.amount = amount;
        this.max = 100;
        this.min = 0;
    }
    
    public int contains(){
        return amount;
    }
    
    public void add(int amount){
        if(amount > 0){
            if (this.amount + amount <= max){
                this.amount += amount;
            }
            else{
                this.amount = max;
            }
        }
    }
    
    public void remove(int amount){
        if (amount > 0){
            if (this.amount - amount >= min){
                this.amount -= amount;
            }
            else{
                this.amount = min;
            }
        }
    }
    
    public String toString(){
        return amount + "/100";
    }
    
    public void set(int amount) {
        this.amount = amount;
    }
}