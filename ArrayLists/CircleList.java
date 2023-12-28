// Step 1: import Java class ArrayList
import java.util.ArrayList;
/**
 * The class manages a list of circles. 
 * 
 * Step 2: Enter your name for @author and today's date for @version
 * @author  Skanda Rohit Sharma
 * @version 2020-10-25
 */
public class CircleList
{
    // Step 3: Declare an instance variable of
    //         an array list of class Circle
    
    private ArrayList <Circle> list;
    // Step 4: Complete the default constructor according
    //         to the comment.
    /**
     * Constructs an object of CircleList by initializing the
     * instance variable to an empty array list of Circle.
     */
    public CircleList()
    {
        list = new ArrayList <Circle>();
    }

    // Step 5: Complete method count() according to the comment,
    //         including Javadoc tags
    /**
     * Gets the number of circles in the list.
     * @return the number of circles in circleList
     */
    public int count()
    {
        return list.size();        
    }
    
    // Step 6: Complete method add() according to the comment,
    //         including Javadoc tags
    /**
     * Adds a Circle object at the end of the list.
     * 
     */
    public void add(Circle circle)
    {
        list.add(circle);
    }

    // Step 7: Complete method averageArea() according to the comment,
    //         including Javadoc tags
    /**
     * Gets the average area of all circles in the list.
     * Returns 0 if the list is empty. Use the ehanced
     * for loop to calculate the sum of areas of all
     * circles in the list.
     * return average of the areas in circleList
     */
    public double averageArea()
    { 
        double areaAvg = 0.0;
        int count = list.size();
        double sum = 0.0;
        if (list.size() > 0)
        {
            for (int i = 0; i < list.size(); i++)
            {
                Circle c = list.get(i);
                double area = c.getArea();
                sum += area;
            }
            areaAvg = sum/count;
        }
        return areaAvg;
    }
 
    
    // Step 8: Complete method largestArea() according to the comment,
    //         including Javadoc tags
    /**
     * Gets the largest area among all circles in the list.
     * Returns 0.0 if the list is empty.
     * return largest area in the list
     */
    public double largestArea()
    {
        double larArea = 0.0;
        if (list.size() > 0)
        {
            for (int i = 0; i < list.size(); i++)
            {
                Circle c = list.get(i);
                double area = c.getArea();
                if ( area > larArea)
                {
                    larArea = area;
                }
            }
        }
        return larArea;
    }
    
    // Step 9: Complete method updatingRadius() according to the comment,
    //         including Javadoc tags
    /**
     * Sets the radius of the circle at the specified index to
     * newRadius if index is valid, but do nothing otherwise.
     * 
     */
    public void updatingRadius(int index, double newRadius)
    {
        if( index >=0 && index < list.size())
        {
            Circle c = list.get(index);
            c.setRadius(newRadius);
        }
    }   
    
    // Step 10: Override method toString() according to the comment,
    //          including Javadoc tags
    /**
     * Gets a string representation for the list including all 
     * circles in the list by returning the string from the 
     * toString() method of the list.
     * 
     */
    @Override
    public String toString()
    {
       return list.toString();
    }

}
