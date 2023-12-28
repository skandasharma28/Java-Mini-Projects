import java.util.*;
/**
 * Prompt for a positive integer then draw that number of random rectangles
 *
 * @author Skanda Rohit Sharma
 * @version 10/29/2022
 */
public class RandomRectangles
{
    public static final int MAX_X = 100;
    public static final int MAX_Y = 500;
    public static final int MIN_WIDTH = 30;
    public static final int MAX_WIDTH = 100;
    public static final int MIN_HEIGHT = 20;
    public static final int MAX_HEIGHT = 80;
    public static final int GENERATOR_SEED = 202210;

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a positive integer for the number of rectangles: ");
        while (!in.hasNextInt())
        {
            String line = in.nextLine();
            System.out.println( "Not an integer:" + "\" " + line + "\"" +  ".");
            System.out.print("Enter a positive integer for the number of rectangles: ");
        }
        int rectNum = in.nextInt();
        while(rectNum <= 0)
        {
            if(!in.hasNextInt())
            {
                while(!in.hasNextInt())
                {
                    String line = in.nextLine();
                    System.out.println( "Not an integer:" + "\" " + line + "\"" +  ".");
                    System.out.print("Enter a positive integer for the number of rectangles: ");
                }
            }
            System.out.println("Not positive: " + "\"" + rectNum + "\"" + ".");
            System.out.print("Enter a positive integer for the number of rectangles: ");
            rectNum = in.nextInt();
        }
        System.out.println("The number of rectangles: " + rectNum + ".");
        Random generator = new Random(GENERATOR_SEED);

        int areaTemp = MAX_HEIGHT * MAX_WIDTH;
        Rectangle rectSmall = new Rectangle(0, 0, 0, 0);
        for(int i = 0; i < rectNum; i++)
        {
            int x = generator.nextInt(MAX_X);
            int y = generator.nextInt(MAX_Y);
            int width = generator.nextInt(MAX_WIDTH - MIN_WIDTH) + MIN_WIDTH;
            int height = generator.nextInt(MAX_HEIGHT - MIN_HEIGHT) + MIN_HEIGHT;
            int area = height * width;

            Rectangle r1 = new Rectangle(x, y, width, height);
            if(area <= areaTemp)
            {
                areaTemp = area;
                rectSmall = r1;
            }
            Color red = new Color(255, 0, 0);
            r1.setColor(red);
            r1.draw();
        }
        Color yellow = new Color(255, 255, 0);
        rectSmall.setColor(yellow);
        rectSmall.fill();
        System.out.println(areaTemp);
    }
}