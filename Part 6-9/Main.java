/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    /*SimpleDictionary book = new SimpleDictionary ();
       book.add ("one", "yksi");
       book.add ("two", "kaksi");

       System.out.println (book.translate ("one"));
       System.out.println (book.translate ("two"));
       System.out.println (book.translate ("three")); */

    Scanner scanner = new Scanner (System.in);
    SimpleDictionary dictionary = new SimpleDictionary ();

    TextUI ui = new TextUI (scanner, dictionary);
      ui.start ();
  }
}
