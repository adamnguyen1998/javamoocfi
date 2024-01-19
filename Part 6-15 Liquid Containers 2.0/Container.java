//Make a class called Container. The class must have a constructor which does not take any parameters, and the following methods:

public class Container{
    
    private int amount;
    
    public Container(){
        this.amount = amount;
        
    }
    
    
    public int contains(){ //which returns the amount of liquid in a container as an integer.
        return this.amount;
    }
    
    
    /*which adds the amount of liquid given as a parameter to the container. 
    If the amount is negative, no liquid is added. A container can hold a maximum of 100 units of liquid.*/
    public void add(int amount){ 
        if (this.amount + amount <= 100 && amount >= 0){
        this.amount += amount;
        }
        else if(amount > 0){
            this.amount = 100;
        }
    }
    
    /*which removes the amount of liquid given as a parameter from the container. 
    If the amount is negative, no liquid is removed. A container can never hold less than 0 units of liquid.*/
    public void remove(int amount){
        if (this.amount - amount >= 0 && amount >= 0){
        this.amount -= amount;
    }
    else if(amount > 0){
        this.amount = 0;
    }
    }
    
    public void setAmount(int amount) {
        this.amount = amount;
    }

    
    /* which returns the container as a string formatted "amount of liquid/100, for example "32/100".*/
    public String toString(){
        return this.amount + "/100";
    }
    
    
}
