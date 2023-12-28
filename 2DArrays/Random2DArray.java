import java.util.Random;
/**
 * Store a 2-D array and provide methods to
 * get the average values of any row, any
 * column, or the entire array.
 *
 * Step 1: Enter your name for @author and today's date for @version
 * @author  
 * @version 
 */
public class Random2DArray
{
    public final int LOW_LIMIT = -10;
    public final int HIGH_LIMIT = 10;
    
    // Step 2: Declare an instance variable of a 2-D
    //         array of int
    private int[][] arrayInt;

    // Step 3: Complete the constructor
    /**
     * Constructs an object of class Random2DArray
     * by initializing the instance variable to
     * the passed in parameter.
     * 
     * @param array a 2-D array of int
     */
    public Random2DArray(int[][] array)
    {
        arrayInt = array; 
    
    }

    // Step 4: Complete the constructor
    /**
     * Constructs an object of class Random2DArray.
     * It creates a 2-D array of int with the 
     * specified rows and columns for the instance
     * variable, then creates a Random object with
     * the specified seed and use it to fill the
     * entire array with random numbers in the 
     * range of [LOW_LIMIT, HIGH_LIMIT].
     * 
     * @param rows number of rows of the 2-D array
     * @param cols number of columns of the 2-D array
     * @param seed the seed of the Random generator
     */
    public Random2DArray(int rows, int cols, int seed)
    {
        Random generator = new Random(seed);
        arrayInt = new int[rows][cols];
        for ( int row = 0; row < rows; row ++)
        {
            for (int col = 0; col < cols; col ++)
            {
                arrayInt[row][col] = generator.nextInt(HIGH_LIMIT - LOW_LIMIT + 1 ) + LOW_LIMIT;
            }
        }
        
    }

    // Step 5: Complete method rowAverage()
    /**
     * Gets the average value of the specified row.
     * 
     * You should use the enhanced for loop.
     *
     * @param  rowIndex the index of the specified row
     * @return the double average of the specified row
     */
    public double rowAverage(int rowIndex)
    {
        double sum = 0.0;
        int count = 0;
        for (int num: arrayInt[rowIndex])
        {
            sum += num;
            count ++;
        }
        return sum / count;
        
    }
    
    // Step 6: Complete method colAverage()
    /**
     * Gets the average value of the specified column.
     *
     * @param  colIndex the index of the specified column
     * @return the double average of the specified column
     */
    public double colAverage(int colIndex)
    {
        int rows = arrayInt.length;
        double sum = 0.0;
        for ( int row = 0; row < rows; row ++)
        {
            sum += arrayInt[row][colIndex];
        }
        return sum/ rows;
    }
    
    // Step 7: Complete method arrayAverage()
    /**
     * Gets the average value of the entire array.
     *
     * @return the double average of the entire array
     */
    public double arrayAverage()
    {
    int rows = arrayInt.length;
    int cols = arrayInt[0].length;
    double sum = 0.0;
    for ( int row = 0; row < rows; row ++)
    {
        for (int col = 0; col < cols; col ++)
        {
            sum += arrayInt[row][col];
        }

    }
    return sum / (rows * cols); 
    }
}

