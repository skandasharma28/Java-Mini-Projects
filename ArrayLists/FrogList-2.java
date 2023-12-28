//Step 1: Import Java class ArrayList
import java.util.ArrayList;
/**
 * Manages an array list of class Frog.
 *
 * Step 2: Enter your name for @author and the password for @version
 * @author Skanda Rohit Sharma 
 * @version 11/12/2022
 */
public class FrogList
{
    // Step 3: Declare an instance variable of 
    //         array list of class Frog
    
    private ArrayList <Frog> list;
    // Step 4: Complete the constructor according
    //         to the comment
    /**
     * Constructs an object of class FrogList by
     * initializing the instance variable to a
     * given array list of class Frog.
     * @param lists is the list of frogs.
     */
    public FrogList(ArrayList<Frog> lists)
    {
        list = lists;
    }

    // Step 5: Complete the constructor according
    //         to the comment
    /**
     * Initializes the instance variable to an
     * empty array list of class Frog.
     *
     */
    public FrogList()
    {
        list = new ArrayList<Frog>();
    }
        
    

    // Step 6: Complete method addFirst() according
    //         to the comment
    /**
     * Adds a frog at the beginning of the list.
     *
     * @param frog the Frog object to add
     */
    public void addFirst(Frog frog)
    {  
        list.add(0,frog);
        
    }
    
    // Step 7: Complete method addLast() according
    //         to the comment
    /**
     * Adds a frog at the end of the list.
     *
     * @param frog the Frog object to add
     */
    public void addLast(Frog frog)
    {
        list.add(frog);
    }
    
    // Step 8: Complete method delete() according
    //         to the comment
    /**
     * Deletes the frog at the specified index and 
     * returns it if the index is valid. 
     * Otherwise, the method returns null without 
     * changing the list.
     *
     * @param  index the index of the frog to be deleted
     * @return the element at the specified index
     *         null if the index is invalid
     */
    public Frog delete(int index)
    {
        if ( index >= 0 && index < list.size())
        {
            Frog deleted = list.get(index);
            list.remove(index);
            return deleted;
        }
        return null;
    }
    
    // Step 9: Complete method swap() according to the comment
    /**
     * Swaps two frogs in the list if both indexes are valid.
     * The method does nothing otherwise.
     *
     * You should use only one tempary variable when swapping
     * the two frogs.
     * 
     * @param index1 the index of the first frog to swap
     * @param index2 the index of the second frog to swap
     */
    public void swap(int index1, int index2)
    {  
        if ((index1 >= 0 && index1 < list.size()) && (index2 >= 0 && index2 < list.size()))
        {
            Frog temp = list.get(index1);
            Frog f2 = list.get(index2);
            list.set(index1,f2);
            list.set(index2, temp);
        }

    }
    
    // Step 10: Write method countOfOutOfRange() according
    //          to the comment
    /**
     * Gets the number of frogs in the list whose weight
     * is not in the specified range.
     * 
     * You should use the enhanced for loop.
     *
     * @param lowLimit the low limit of the specified range
     * @param highLimit the high limit of the specified range
     * @return the number of frogs in the list whose weight
     *         is out of the specified range
     */
    public int countOfOutOfRange(int lowLimit, int highLimit)
    {
        int count = 0;
        for (int i = 0; i < list.size(); i++)
        {
            Frog f = list.get(i);
            double weight = f.getWeight();
            if (weight < lowLimit || weight > highLimit)
            {
                count ++; 
            }
                
        }
        return count; 
    }
    
    // Step 11: Override method toString() according
    //          to the comment
    /**
     * Overrides the toString() method and returns the string 
     * returned by the toString() method of the list.
     * 
     * @return the string returned by the toString() method of the list
     */
    @Override
    public String toString()
    {
        return list.toString();
    }
}

