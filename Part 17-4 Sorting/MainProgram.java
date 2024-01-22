/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class MainProgram
{
	public static void main(String[] args) {
		int[] numbers = {6, 5, 8, 7, 11};
        System.out.println("Smallest: " + MainProgram.smallest(numbers));
        
// indices:      0  1  2  3  4
int[] numbers2 = {6, 5, 8, 7, 11};
System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(numbers2));

// indices:       0  1  2  3   4
int[] numbers3 = {-1, 6, 9, 8, 12};
System.out.println(MainProgram.indexOfSmallestFrom(numbers3, 0));
System.out.println(MainProgram.indexOfSmallestFrom(numbers3, 1));
System.out.println(MainProgram.indexOfSmallestFrom(numbers3, 2));

int[] numbers4 = {3, 2, 5, 4, 8};

System.out.println(Arrays.toString(numbers4));

MainProgram.swap(numbers4, 1, 0);
System.out.println(Arrays.toString(numbers4));

MainProgram.swap(numbers4, 0, 3);
System.out.println(Arrays.toString(numbers4));

int[] numbers5 = {8, 3, 7, 9, 1, 2, 4};
MainProgram.sort(numbers5);
	}
	
	
	public static int smallest(int[] array){
	    
	    /*Arrays.sort(array);
	    return array[0];*/
	    
	    int minValue = Integer.MAX_VALUE;
        for (int number : array) {
            if (number <= minValue) {
                minValue = number;
            }
        }
        
        return minValue;
	}
	
	public static int indexOfSmallest(int[] array){
	    int index = 0;
	    int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= minValue) {
                minValue = array[i];
                index = i;
            }
        }
        
        return index;
	    
	    
	}
	
	public static int indexOfSmallestFrom(int[] table, int startIndex) {
    // write your code here
    //int index = 0;
	    int minValue = Integer.MAX_VALUE;
        for (int i = startIndex; i < table.length; i++) {
            if (table[i] <= minValue) {
                minValue = table[i];
                startIndex = i;
            }
        }
        
        return startIndex;
}
	public static void swap(int[] array, int index1, int index2) {
    // write your code here
    int a = array[index1];
    array[index1] = array[index2];
    array[index2] = a;
    
    //Arrays.asList(array,index1,index2);
}

    public static void sort(int[] array) {
        
        //System.out.println(Arrays.toString(array));
        
        for (int i = 0; i < array.length; i++){
            System.out.println(Arrays.toString(array));
        int small = indexOfSmallestFrom(array,i);
        swap(array,i,small);
    }
    }

}
