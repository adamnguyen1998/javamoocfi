import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // insert test code here
        int[] array = {4, 1, 6, 55, 4, 11};
        //System.out.println(Arrays.sort(array));
        System.out.println(Arrays.toString(array));
        //Arrays.sort(array);
        sort(array);
        System.out.println(Arrays.toString(array));
        
        String[] array1 = {"Yana", "Sleepy", "Light", "Vaffle", "Poochy", "Yuu", "Amy"};
        System.out.println(Arrays.toString(array1));
        //Arrays.sort(array1);
        sort(array1);
        System.out.println(Arrays.toString(array1));
        
        ArrayList<Integer> integer = new ArrayList<>(Arrays.asList(3,1,2));
        System.out.println(integer);
        sortIntegers(integer);
        System.out.println(integer);
        
        ArrayList<String> string = new ArrayList<>();
        Collections.addAll(string, "c", "d","a","b");
        System.out.println(string);
        sortStrings(string);
        System.out.println(string);
        
    }
    
    public static void sort(int[] array) {
        Arrays.sort(array);
    }
    
    public static void sort(String[] array) {
        Arrays.sort(array);
    }
    
    public static void sortIntegers(ArrayList<Integer> integers) {
        Collections.sort(integers);
    }
    
    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);
    }

}
