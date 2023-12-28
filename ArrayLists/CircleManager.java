// Step 1: import Java class ArrayList
import java.util.ArrayList;
/**
 * The class manages an array list of Circle objects.
 * 
 * Step 2: Enter your name for @author and today's date for @version
 * @author  Skanda Rohit Sharma
 * @version 11/9/2022
 */
public class CircleManager
{
    public static final double TARGET_RADIUS = 10.0;
    public static final double LARGEST_AREA = 999999;
    
    // Step 3: Declare an instance variable of
    //         an array list of class Circle
    private ArrayList<Circle> circleList;

    // Step 4: Complete the default constructor according
    //         to the comment.
    /**
     * Constructs an object of CircleList by initializing the
     * instance variable to an empty array list of Circle.
     */
    public CircleManager()
    {
        circleList = new ArrayList<Circle>(); 
    }

    // Step 5: Complete method add() according to the comment
    /**
     * Adds a Circle object at the beginning of the list.
     * 
     * @param circle the circle to add
     */
    public void add(Circle circle)
    {
        circleList.add(circle);
    }

    // Step 6: Complete method smallestCircle() according to the comment
    /**
     * Gets the circle in the list with the smallest area.
     * If multiple circles have the same smallest area,
     * return the first one with the smallest area.
     * If the list is empty, return null.
     * 
     * You must use the enhanced for loop.
     * 
     * @return the first circle with the smallest area
     *         null if the list is empty
     */
    public Circle firstSmallestCircle()
    {
       Circle smallest = null;
       double smallArea = LARGEST_AREA;
       for (Circle c : circleList)
       {
           double area = c.getArea();
           if ( area < smallArea)
           {
               smallArea = area;
               smallest = c; 
           }
       }
       return smallest;
    }
    
    // Step 7: Complete method hasCircleWithRadiusGreaterThan10() 
    //         according to the comment
    /**
     * Returns true if the list has a circle with radius larger
     * that TARGET_RADIUS (10.0), false otherwise.
     * You should use the while loop and exit the loop right 
     * after such a circle is found.
     * 
     * @return true if the list has a circle with radius > TARGET_RADIUS
     *         false otherwise
     */
    public boolean hasCircleWithRadiusGreaterThan10()
    {
         boolean hasRadius = false;
         int i = 0;
         while (i < circleList.size())
         {
             Circle c = circleList.get(i);
             double radius = c.getRadius();
             if ( radius > TARGET_RADIUS )
             {  
                 hasRadius = true; 
                 break; 
             }
             i ++; 
         }
         return hasRadius; 
    }
    
    // Step 8: Override method toString() according to the comment
    /**
     * Gets a string representation for this CircleManager object.
     * 
     * @return a string including all circles in theList in the format
     *         "CircleManager" + CircleArrayList_toString
     *         where CircleArrayList_toString is the string returned from  
     *         the toString() method of theList
     */
    @Override
    public String toString()
    {
         return "CircleManager" + circleList.toString(); 
    }
}
