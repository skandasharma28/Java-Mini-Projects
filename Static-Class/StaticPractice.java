import java.util.ArrayList;
/**
 * Practice with Static methods.
 *
 * @author Skanda Rohit Sharma
 * @version 11/25/2022
 */
public class StaticPractice
{
    /**
     * Computes and returns the average of the positve intergers in the array.
     *
     * @param numbers an array list of Integer.
     * @param size is the size of the array.
     * @return the average of the postive numbers. 
     */
    public static double averageOfPositive (int[] numbers, int size)
    {
        double avg = 0;
        double sum = 0;
        int count = 0;
        for ( int i = 0; i < size; i++)
        {
            int num = numbers[i];
            
            if ( num > 0)
            {
               sum = sum + num;
               count ++;  
            }
            
        }
        if ( count > 0)
        {
            avg = sum / count;
        }
        return avg; 
    }
    /**
     * Computes and returns the average of the positve intergers in the ArrayList.
     *
     * @param numbers an array list of Integer.
     * @return the average of the postive numbers. 
     */
    public static double averageOfPositive (ArrayList<Integer> numbers)
    {
        double avg = 0;
        int sum = 0;
        int count = 0;
        for (int num: numbers)
        {
            if ( num > 0)
            {
               sum = sum + num;
               count ++;  
            }
        }
        if ( count > 0)
        {
            avg = sum / count;
        }
        return avg; 
        
    }
    /**
     * Computes and returns the count of targets met. 
     *
     * @param list is the array of strings.
     * @param size is the array size
     * @param target is the String target
     * @return the number of times targets have been met. 
     */
    public static int targetCount(String[] list, int size, String target)
    {
        int count = 0;
        for (int i = 0; i < size; i++)
        {
            String s = list[i];
            if (s.equals(target))
            {
                count ++;
            }
        }
        return count;
    }
    /**
     * Computes and returns the count of targets met in the list.
     *
     * @param list is the list of strings.
     * @param target is the String target
     * @return the number of times targets have been met. 
     */
    public static int targetCount(ArrayList<String> list, String target) 
    {
        int count = 0;
        for(String s : list)
        {
            if (s.equals(target))
            {
                count ++;
            }
        }
        return count; 
    }

}
