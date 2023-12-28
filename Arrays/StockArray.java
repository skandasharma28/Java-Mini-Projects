
/**
 * Practice with StockArrays
 *
 * @author Skanda Rohit Sharma
 * @version 11/14/2022
 */
public class StockArray
{
    private Stock[] array;
    private int num;
    
    /**
     * Constructs an array of Stocks with a specifed size. 
     * @param numOfStocks is the length. 
     */
    public StockArray (int numOfStocks)
    {
        this.num = 0;
        this.array = new Stock[numOfStocks];
    }
    /**
     * Adds the stock at a specified index.
     * @param stock is the stock being addded.
     * @param index is th int index.
     */
    public void insert(Stock stock, int index) 
    {
        if (index >= 0 && index <= num && num < array.length)
        {
            if (index < num)
            {
                for ( int i = num; i > index; i --)
                {
                    array[i] = array[i-1];
                }
               
            }
            array[index] = stock;
            num ++; 
            
        }
    }
    /**
     * Swaps 2 stocks if the indicies are valid
     * @param index1 is the first index.
     * @param index2 is the second index.
     */
    public void swap(int index1, int index2)
    {
        if ((index1 >= 0 && index1 < num) && (index2 >= 0 && index2 < num))
        {
            Stock temp = array[index1];
            array[index1] = array[index2];;
            array[index2] = temp;
            
        }

    }
    /**
     * Gets and a returns the price of a given symbol.
     *@param symbol is the symbol of the stock
     *@return price is the price of the stock.
     */
    public double quote(String symbol)
    {
        double price = -1;
        for ( int i = 0; i < num; i++)
        {
            String s = array[i].getSymbol();
            if( s.equals(symbol))
            {
               price =  array[i].getPrice();
            }
        }
        return price;
    }
    /**
     *Returns the array to string
     *@return s is the array to string separated with commas. 
     */
    public String toString()
    {
        String s = "[";
        if ( num > 0)
        {
            s += array[0].toString();
            for (int i = 1; i < num; i++)
            {
                s += ", " + array[i].toString();
            }
        }
        return s + "]";

    }

    
}
