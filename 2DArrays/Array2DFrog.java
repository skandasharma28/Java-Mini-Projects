/**
 * Store a 2-D array of class Frog and retrieve 
 * information from the 2-D array.
 *
 * Step 1: Enter your name for @author and the password for @version
 * @author Skanda Rohgit Sharma
 * @version SampleFinalExam
 */
public class Array2DFrog
{
    // Step 2: Declare one instance variable to
    //         store a 2-D array of Frog.
    private Frog[][] frog2D; 
    
    // Step 3: Complete the constructor
    /**
     * Constructor for objects of class Array2DFrog.
     * 
     * @param array a 2-D array of class Frog 
     */
    public Array2DFrog(Frog[][] array)
    {
        frog2D = array; 
    }

    // Step 4: Complete method averageWeight()
    /**
     * Gets the average weight of all frogs in the 2-D array.
     * We assume the 2-D array is not empty and not partial.
     *
     * You should use nested enhanced for loops.
     * DO NOT calculate the count in the nested for loops.
     * 
     * @return the average weight of all frogs in the
     *         2-D array
     */
    public double averageWeight()
    {
        double avgWeight = 0.0;
        double sum = 0.0;
        int cols = frog2D[0].length;
        int rows = frog2D.length;
        int count = 0;
        for (int row = 0; row < rows; row ++)
            for (int col = 0; col < cols; col ++)
            {
                Frog f = frog2D[row][col];
                double weight = f.getWeight();
                sum += weight;
                count ++;
            }
        
        avgWeight = sum/count;
        return avgWeight;
    }
    
    // Step 5: Complete method lastInTheRangeOfARow()
    /**
     * Gets the last frog in the specified row whose weight
     * is in the range of [low, high].
     * We assume the 2-D array is not empty and not partial.
     * We also assume the index is valid.
     * 
     * You should stop execution and return the frog after
     * finding the frog satisfying the condition.
     * 
     * @param rowIndex the row index of the specified row
     * @param low the low limit of the range
     * @param high the high limit of the range
     * @return the last frog in the specified row whose weight 
     *             is in the range of [low, high]
     *         null if no such frog in the specified row
     */
    public Frog lastInTheRangeOfARow(int rowIndex, double low, double high)
    {
        Frog lastInRange = null;
        int cols = frog2D[0].length;
        int rows = frog2D.length;
        for (int col = cols -1; col >= 0 ; col --)
        {
            Frog f = frog2D[rowIndex][col];
            double weight = f.getWeight();
            if (weight >= low && weight <= high)
            {
                lastInRange = f;
                return lastInRange;
                
            }
        }
        return lastInRange;        

    }
    
    // Step 6: Complete method maxOfACol()
    //         Make sure you compare double values using the
    //         correct approach.
    /**
     * Gets the first frog with the max weight among all frogs 
     * in a specified column.
     * We assume the 2-D array is not empty and not partial.
     * We also assume the index is valid.
     * 
     * @param colIndex the index of the specified column
     * @return the first frog with the max weight among all frogs 
     *             in the specified column
     */
    public Frog maxOfACol(int colIndex)
    {
        Frog firstMax = null;
        double max = Double.MIN_VALUE;
        int cols = frog2D[0].length;
        int rows = frog2D.length;
        for ( int row = rows - 1; row >= 0; row --)
        {
            Frog f = frog2D[row][colIndex];
            double weight = f.getWeight();
            if (weight>= max)
            {
                max = weight;
                firstMax = f; 
            }
        }
        return firstMax;
    }
}