/**
 * A Java class to manage a 2-D array of Frog.
 *
 * Step 1: Enter your name for @author and the password for @version
 * @author Skanda Rohit Sharma
 * @version SampleExamTwo
 */
public class Frog2DArray
{
    // Step 2: Declare a 2-D array of Frog as the instance variable
    private Frog[][] frog2D;
   
    // Step 3: Complete the constructor
    /**
     * Initializes the instance variable to the passed
     * in parameter.
     *
     * @param array a 2-D array of Frog
     */
    public Frog2DArray(Frog[][] array)
    {
        frog2D = array;
    }

    // Step 4: Complete method rowMaxFrog()
    /**
     * Gets a frog in the specified row that has the
     * max weight among all frogs in the same row.
     *
     * You should use the enhanced for loop.
     *
     * @param  rowIndex the index of the specified row
     * @return a frog with the max weight in the specified row
     */
    public Frog rowMaxFrog(int rowIndex)
    {
         int temp = Integer.MIN_VALUE;
         Frog max = new Frog(0);
         for (Frog frog: frog2D[rowIndex])
         {
             if (frog.getWeight() > temp)
             {
                 temp = frog.getWeight();
                 max = frog;
             }
         }
         return max;
    }

    // Step 5: Complete method colAverage()
    /**
     * Gets the average weight of all frogs in
     * the specified column.
     *
     * @param  colIndex the index of the specified column
     * @return the average weight of all frogs in the specified column
     */
    public double colAverage(int colIndex)
    {
         double sum = 0;
         int rows = frog2D.length;
         for (int r = 0; r < rows; r++)
         {
             sum += frog2D[r][colIndex].getWeight();
         }
         double average = sum / rows;
         return average;
    }
   
    // Step 6: Complete method totalCount()
    /**
     * Gets the total count of frogs in the 2-D array
     * that have the specified number of legs.
     *
     * You should use nested enhanced for loops.
     *
     * @param  legs the specified number of legs
     * @return the count of frogs with the specified legs
     */
    public int totalCount(int legs)
    {
        int count = 0;
        for (Frog[] row: frog2D)
        {
            for (Frog num: row)
            {
                if (num.getLegs() == legs)
                {
                    count++;
                }
            }
        }
        return count;
    }
}
