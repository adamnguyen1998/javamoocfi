import java.util.*;

public class TextUI{
    private Scanner scanner;
    private SimpleDictionary simpleDictionary;
    
    TextUI(Scanner scanner, SimpleDictionary simpleDictionary){
        
        this.scanner = scanner;
        this.simpleDictionary = simpleDictionary;
        
    }
    
    public void start(){
        
        System.out.print("Command: ");
        String input = scanner.nextLine();
        
        while(!input.equals("end")){
            /*if (input.equals("add")){
                add();
            }
            
            else if (input.equals("search")){
                search();
            }
            else{
                System.out.println("Unknown command");
            }
            System.out.print("Command: ");
            input = scanner.nextLine();*/
            
            switch (input){
                case "add":{
                    add();
                    break;
                }
                case "search":{
                    search();
                    break;
                }
                default:
                System.out.println("Unknown command");
            }
            System.out.print("Command: ");
            input = scanner.nextLine();
        }
        
        System.out.println("Bye bye!");
    }
    
    public void add(){
        System.out.print("Word: ");
        String word = scanner.nextLine();
        System.out.print("Translation: ");
        String translation = scanner.nextLine();
        simpleDictionary.add(word, translation);
    }
    
        public void search() {
        System.out.print("To be translated: ");
        String wordToTranslate = scanner.nextLine();
        if (this.simpleDictionary.translate(wordToTranslate) != null) {
            System.out.println("Translation: " + this.simpleDictionary.translate(wordToTranslate));
        } else {
            System.out.println("Word " + wordToTranslate + " was not found");
        }    
    }

    
}