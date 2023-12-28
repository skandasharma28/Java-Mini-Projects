import java.util.Scanner;
/**
 * Reads and returns 2 highesst and tempratures that are below freezing
 *
 * @author Skanda Rohit Sharma
 * @version 10/21/2022
 */
public class Temperatures
{
    public static void main(String[] args)
    {
        final double FREEZE_POINT = 32.0; 
        Scanner in = new Scanner (System.in);
        System.out.print("Enter the first temperature Fahrenheit: ");
        double high = in.nextDouble();
        System.out.print("Enter the second temperature Fahrenheit: ");
        double secondHigh = in.nextDouble();
        
        if (secondHigh > high)
        {
            double x = high;
            high = secondHigh;
            secondHigh = x; 
        }
        System.out.print("Enter another temperature Fahrenheit or Q to quit: ");
        int freezeCount = 0; 
        int negetiveCount = 0; 
        
        while (in.hasNextDouble())
        {
            double temp = in.nextDouble();
            
            if (temp > secondHigh ) 
            {
                secondHigh = temp;
                
            }
            if (secondHigh > high)
            {
                double actualHigh = secondHigh;
                secondHigh = high;  
                high = actualHigh;
                
            }
            
            if (temp <= FREEZE_POINT)
            {
                freezeCount ++;
                
                if( temp < 0)
                {
                    negetiveCount ++; 
                }
            }

            System.out.print("Enter another temperature Fahrenheit or Q to quit: ");

        }
        
        while (!in.hasNextDouble())
            {   
                if (high < FREEZE_POINT)
                {
                    freezeCount= freezeCount + 2 ;
                    if( high < 0)
                    {
                        negetiveCount = negetiveCount + 2;
                    }
                }
                else if (high >= FREEZE_POINT && secondHigh < FREEZE_POINT)
                {
                    freezeCount= freezeCount + 1;
                    if( secondHigh < 0)
                    {
                        negetiveCount = negetiveCount + 1;
                    }
                }
                
                System.out.println("Number of negative temperatures: " + negetiveCount);
                System.out.println("Number of below freezing point temperatures: " + freezeCount);
                System.out.println("The highest temperature: " + high);
                System.out.println("The second highest temperature: " + secondHigh);
                break;
                
            }
            
        
        
        
        
        
    }
    
}

