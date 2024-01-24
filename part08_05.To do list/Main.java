/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
//import java.io.*; 
import java.util.*; 
public class Main
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner (System.in);
	    
	    
		TodoList list = new TodoList();
        list.add("read the course material");
        list.add("watch the latest fool us");
        list.add("take it easy");

        list.print();
        list.remove(2);

        System.out.println();
        list.print();

        list.clear();
        System.out.println();

        list.add("read the course material");
        list.add("watch the latest fool us");
        list.add("take it easy");
        list.print();
        System.out.println();
        list.remove(2);
        list.print();
        System.out.println();
        list.add("buy rasins");
        list.print();
        System.out.println();
        list.remove(1);
        list.remove(1);
        list.print();
        System.out.println();

        list.clear();
        
        
        UserInterface ui = new UserInterface(list, scanner);
        
        ui.start();
	}
}
