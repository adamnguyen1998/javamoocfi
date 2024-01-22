import java.util.*;

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        System.out.println("How many books to create?");
        int numberOfBooks = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < numberOfBooks; i++) {
            books.add(new Book(i, "name for the book " + i));
        }

        System.out.println("Id of the book to search for?");
        int idToSearchFor = Integer.valueOf(scanner.nextLine());

        System.out.println("");
        System.out.println("Searching with linear search:");
        long start = System.currentTimeMillis();
        int linearSearchId = linearSearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (linearSearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(linearSearchId));
        }

        System.out.println("");

        System.out.println("");
        System.out.println("Seaching with binary search:");
        start = System.currentTimeMillis();
        int binarySearchId = binarySearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (binarySearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(binarySearchId));
        }

		
		
	}
	
	public static int linearSearch(ArrayList<Book> books, int searchedId){
	    /*which searches the list it received as a parameter, for a book with an id variable that matches the value of searchedId variable it received as a parameter.
	    If that book is found, the method, should return the index it's located at in the list it received as a parameter.
	    If the book isn't found, the method should return the value -1.*/
        
        for (int i = 0; i < books.size(); i++){
            if (books.get(i).getId() == searchedId){
                return i;
            }
        
	    }
	    return -1;
	}
	public static int binarySearch(ArrayList<Book> books, int searchedId){
	    //ArrayList<Book> sortedBooks = new ArrayList<>(books);
	    
        int begin = 0;
        int end = books.size() -1;
        while (begin <= end) {
            int middle = (end + begin) / 2; 
            if (books.get(middle).getId() < searchedId) {
                begin = middle + 1;
            } else if (books.get(middle).getId() > searchedId) {
                end = middle - 1; 
            } else if (books.get(middle).getId() == searchedId) {
                return middle;
            }
        }
        return -1; 

	}
}
