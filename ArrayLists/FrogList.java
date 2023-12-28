
import java.util.ArrayList;

/**
 * This class manages a list of frogs.
 *
 * @author  Skanda Rohit Sharma
 * @version 10/29/2022
 */
public class FrogList
{
    // Step 2: Declaring an instance variable of an arraylist of class Frog
    private ArrayList<Frog> frogList;
    
    // Step 3: Constructing an object of FrogList 
    /**
     * Constructing an object of FrogList by initializing the instance variable
     */
    public FrogList()
    {
        frogList = new ArrayList<Frog>();
    }
    
    // Step 4: Completing the method add() with java doc tags
    /**
     * Adds a frog at the beginning of the list. 
     * 
     * @param frog the frog getting add to the beginning of the list.
     */
    public void add(Frog frog)
    {
        frogList.add(0,frog);
    }
    
    // Step 5: Completing the method get() with java doc tags
    /**
     * Returns the Frog object at position index without 
     * changing the list if the index is valid and returns null otherwise. 
     * 
     * @param index the index being found to get the frog's position
     * @return gets the index of the frog
     */
    public Frog get(int index)
    {
        if (index >= frogList.size())
        {
            return null;
        }
        return frogList.get(index);
    }
    
    // Step 6: Completing the countInRange method
    /**
     * Gets the number of frogs in the list that have a weight in the range between lowLimit and 
     * highLimit, inclusive. 
     * 
     * @param lowLimit contains the minimum number of frogs that can be produced
     * @param highLimit contains the maximum number of frogs that can be produced
     * @return gets the number of frogs that can be produced within the given range
     */
    public int countInRange(int lowLimit, int highLimit)
    {
        int count = 0;
        for (Frog frog: frogList)
        {
            if (frog.getWeight() >= lowLimit && frog.getWeight() <= highLimit)
            {
                countInRange++;
            }
        }
        return count;
    }
    
    // Step 7: Completing the toString method
    /**
     * Returns the string returned from calling the toString() method on the list. 
     * 
     * @return gets the String representation of the frogList including all frogs in the list by returning 
     * the string from the toString() method of the list.
     */
    @Override
    public String toString()
    {
        return frogList.toString();
    }
}
