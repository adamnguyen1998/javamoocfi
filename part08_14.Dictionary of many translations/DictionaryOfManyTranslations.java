import java.util.*;

public class DictionaryOfManyTranslations
{
    private HashMap<String, ArrayList<String>> hashmap;
    
    public DictionaryOfManyTranslations(){
        this.hashmap = new HashMap<>();
    }
    
    
    public void add(String word, String translation){
        /*adds the translation for the word and preserves the old translations.*/
        
        hashmap.putIfAbsent(word, new ArrayList<>());
        
        ArrayList<String> translations = hashmap.get(word);
        translations.add(translation);
        
        //Or hashmap.get(word).add(translation);
        
    }
    
    
    public ArrayList<String> translate(String word){
        /* returns a list of the translations added for the word. If the word has no translations, the method should return an empty list.*/
        
        hashmap.putIfAbsent(word, new ArrayList<>());
        
        return hashmap.get(word);
        
        /*ArrayList item = hashmap.get(word);
		if (item == null) {
			ArrayList<String> empty = new ArrayList<>();
			return empty;
		} else {
			return item;
		}*/
        
    }
    
    
    public void remove(String word){
        /*removes the word and all its translations from the dictionary.*/
        
        hashmap.remove(word);
    }
    
    
    
    
    
    
	public static void main(String[] args) {
		DictionaryOfManyTranslations dictionary = new DictionaryOfManyTranslations();
        dictionary.add("lie", "maata");
        dictionary.add("lie", "valehdella");

        dictionary.add("bow", "jousi");
        dictionary.add("bow", "kumartaa");

        System.out.println(dictionary.translate("lie"));
        dictionary.remove("bow");
        System.out.println(dictionary.translate("bow"));
	}
}
