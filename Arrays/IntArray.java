
/**
 * Works with an integer array.
 *
 * @author Skanda Rohit Sharma
 * @version 11/14/2022
 */
public class IntArray
{
    private int [] array;
    private int num;
    
    public IntArray(int[] Intarray, int length)
    {
        array = Intarray;
        num = length;
    }
    public void add(int value)
    {
        if (num < array.length)
        {
            array[num] = value;
            num++;
        }
    }
    public void remove(int index)
    {
        
        if (index >= 0 && index < num)
        {
            for ( int i = index; i < num - 1; i++)
            {
                array[i] = array [i+1];
            }
            num --;
        }
        
    }
    public int countOfOutRange(int low, int high)
    {
        int count = 0;
        for (int i = 0; i < num; i++)
        {
            int x = array[i];
            if (x < low || x > high)
            {
                count ++;
            }
        }
        return count; 
    }
    public int lastNegative()
    {
        int lastNeg = 0;
        for (int i = num -1 ; i >= 0; i--)
        {
            int y = array[i];
            if (y < 0)
            {
                lastNeg = y;
                return lastNeg;
            }
            
        }
        return lastNeg;
    }
    public String toString () 
    {
        String s = "[";
        if (num > 0)
        {
            s += array[0];
            for (int i = 1; i < num; i++)
            {
                s += ", " + array[i]; 
            }
        }
        return s + "]"; 
    }

}
