/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

public class Main
{
  public static void main (String[]args)
  {
    SimpleCollection s = new SimpleCollection ("alphabet");
      System.out.println (s);

      System.out.println ();

      s.add ("a");
      System.out.println (s);

      System.out.println ();

      s.add ("b");
      System.out.println (s);

      System.out.println ();

      s.add ("c");
      System.out.println (s);
      
      System.out.println();

      s.removeAll();
      
      System.out.println("Clearing... \n");

      System.out.println (s);

      System.out.println ();

      s.add ("magneto");
      System.out.println (s);

      System.out.println ();

      s.add ("mystique");
      System.out.println (s);

      System.out.println ();

      s.add ("phoenix");
      System.out.println (s);
  }
}
