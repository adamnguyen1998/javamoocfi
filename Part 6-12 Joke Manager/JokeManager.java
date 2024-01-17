import java.util.ArrayList;
import java.util.*;

public class JokeManager
{
  private ArrayList < String > jokes;

  public JokeManager ()
  {
    this.jokes = new ArrayList <> ();

  }

  public void addJoke (String joke)
  {
    this.jokes.add (joke);
  }				//- adds a joke to the manager.
  
  
  
  public String drawJoke()
  {
    System.out.println ("Drawing a joke.");

    if (jokes.isEmpty ())
      {
	return "Jokes are in short supply.";
      }
    else
      {
	Random draw = new Random ();
	int index = draw.nextInt (jokes.size ());
	return jokes.get (index);
      }
  }				/*- chooses one joke at random and returns it. 
  It there are no jokes stored in the joke manager, the method should return the string "Jokes are in short supply.".*/
  
  
  
  public void printJokes ()
  {
    System.out.println ("Printing the jokes.");
  for (String joke:jokes)
      {
	System.out.println (joke);
      }				//- prints all the jokes stored in the joke manager.
  }
}
