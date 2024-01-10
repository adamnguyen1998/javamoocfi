import java.util.ArrayList;

public class Room{
    private ArrayList<Person> persons;
    
    public Room(){
        this.persons = new ArrayList<>();
    }
    
    public void add(Person person){
        this.persons.add(person);
    }
    
    public boolean isEmpty(){
        if (persons.isEmpty()){
            return true;
        }
        return false;
    }
    
    public ArrayList<Person> getPersons(){
        return this.persons;
        }
        
        /*Add a public Person shortest() method to the Room class, which returns the shortest person added to the room. 
        If the room is empty, a null reference is returned. The method should not remove a person from the room.*/
        
        public Person shortest(){
            if (persons.isEmpty()){
                return null;
            }
            Person shortest = persons.get(0);
            for (Person a : persons){
                if (a.getHeight() < shortest.getHeight()) {
                    shortest = a;
                }
                
            
            }
            return shortest;
        
        }
        
        /*Add a public Person take() method to the Room class, 
        which takes the shortest person in the room. 
        When a room is empty, it returns a null reference.*/
        
        public Person take(){
            if (persons.isEmpty()){
                return null;
            }
            
            Person shortest = shortest();
            
            this.persons.remove(shortest());
            
            return shortest;
            
        }
}
