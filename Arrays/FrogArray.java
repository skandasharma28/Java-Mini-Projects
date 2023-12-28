/**
 * Manages a partial array of class Frog.
 *
 * Step 1: Enter your name for @author and the password for @version
 * @author  Skanda Rohit Sharma
 * @version 11/12/2022
 */
public class FrogArray
{
    // Step 2: Declare two instance variables to 
    //         manage a partial array of class Frog
    private Frog[] array;
    private int size;

    // Step 3: Write the constructor according to the comment
    //         including possible Javadoc tags
    /**
     * The constructor has two parameters for the two
     * instance variables:
     *      array: an array of Frog
     *      count: the number of frogs in array
     *@param length is the size of the array.
     *@param frog is the frog in the array.
     * 
     */
    public FrogArray (Frog[] frog,int length)
    {
        size = length;
        array = frog;
    }

    // Step 4: Write method add() according to the comment
    //         including possible Javadoc tags
    /**
     * The method has one parameter of class Frog. If the 
     * array is not full, the method will add the frog at 
     * the end of the array and update the number of frogs 
     * in the array; otherwise, it will not do nothing.
     *@param f is the frog being added. 
     */
    public void add(Frog f)
    {
        if (size < array.length)
        {
          array[size] = f;
          size ++;
        }
        
    }
    
    // Step 5: Write method delete() according to the comment
    //         including possible Javadoc tags
    /**
     * The method has one parameter for the index of a frog to
     * be deleted from the array. If the index is valid, the
     * method will remove the frog from the array, shifting 
     * all subsequent elements to the left by one position, 
     * and return the frog. Otherwise, the method will not
     * change the aray at all and return null.
     * @param index is the index of the deleting Frog.
     * @return removed is the Frog that has been deleted.
     */
    public Frog delete(int index)
    {
        Frog removed = null;
        if (index >=0 && index < size)
        {
            removed = array[index];
            for ( int i = index; i < size -1; i ++)
            {
                array [i] = array [i+1];
            }
            size --;
        }
        return removed;
    }
    
    // Step 6: Write method lastOutOfRange() according to the comment
    //         including possible Javadoc tags
    /**
     * The method has two int parameters for the low and high
     * limits and will return the last frog in the array whose
     * weight is not in the specified range (smaller than the 
     * low limit or larger than the high limit). The method 
     * will return null if no frog is out of the range.
     * @param low is the low limit.
     * @param high is the high limit.
     * @return outofRange is the last frog out of range.
     */
    public Frog lastOutOfRange(int low, int high)
    {
        Frog outRange = null;
        for(int i = size -1; i >= 0; i--)
        {
            Frog f = array[i];
            int weight = f.getWeight();
            if(weight < low || weight > high)
            {
                outRange = f;
                return outRange;
            }
        }
        return outRange;
    }
    
    // Step 7: Override method toString() according to the comment
    //         including possible Javadoc tags
    /**
     * The method has no parameters and will return a string 
     * in the following format:
     *         [Frog[...], Frog[...], ..., Frog[...]]
     * where each Frog[...] is the string returned by method
     * toString() on a frog in the array.
     * 
     * Do not use an if statement inside the loop.
     * @return s + ] where s is all the frog values. 
     */
    public String toString()
    {
        String s = "[";
        if (size>0)
        {
            s+= array[0].toString();
            for (int i = 1; i < size; i++)
            {
                s += ", " + array[i].toString();
            }
        }
        return s + "]";
    }

}
