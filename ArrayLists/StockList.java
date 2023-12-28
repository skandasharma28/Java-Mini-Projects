// Step 1: importing the Array List class
import java.util.ArrayList;

/**
 * This list manages a list of stocks.
 *
 * @author  Skanda Rohit Sharma
 * @version 10/29/2022
 */
public class StockList
{
    // Step 2: Declaring an instance variable of an arraylist of class Stock
    private ArrayList<Stock> stockList;
   
    // Step 3: Constructor an object of StockList
    /**
     * Adds a stock s to the end of the list.
     */
    public StockList()
    {
        stockList = new ArrayList<Stock>();
    }
   
    // Step 4: Completing the method add() with java doc tags.
    /**
     * Adds a stock s to the end of the list.
     *
     * @param s is the stock that is being added to the end of the list
     */
    public void add(Stock s)
    {
        stockList.add(s);
    }
   
    // Step 6: Completing the swap method() with java doc tags.
    /**
     * Swaps the element at index1 with the element at index2.
     * If either index is out of bounds, do not changing anything.
     *
     * @param index1 represents the element at index1
     * @param index2 represents the element at index2
     */
    public void swap(int index1, int index2)
    {
        if (index1 < 0)
        {
           
        }
        else if (index2 < 0)
        {
           
        }
        else if (stockList.size() > index1 & stockList.size() > index2)
        {
            Stock temp = stockList.get(index1);
            stockList.set(index1,stockList.get(index2));
            stockList.set(index2,temp);
        }
    }
   
    // Step 7: Completing the cheapest() with an enhanced loop and java doc tags.
    /**
     * Gets the symbol for the Stock with the lowest price per share. If more than one Stock has the same price,
     * return the symbol for the first. If the list is empty, return null.
     *
     * @return the cheapest stock along with its symbol
     */
    public String cheapest()
    {
        Stock cheapestStock = null;
        for (Stock s: stockList)
        {
            if (cheapestStock == null || s.getPrice() < cheapestStock.getPrice())
            {
                cheapestStock = s;
            }
        }
       
        if (cheapestStock == null)
        {
            return null;
        }
        else
        {
            return cheapestStock.getSymbol();
        }
    }
   
    // Step 8: Completing the toString() method with java doc tags
    /**
     * Returns the string returned from calling the toString() method on the list.
     *
     * @return the string returned by the toString() on the stock list
     */
    public String toString()
    {
        return stockList.toString();
    }
}