import java.awt.Rectangle;
import java.util.Scanner;
public class KFS_AreaTester_Main
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Width of the rectangle: ");
        int height = input.nextInt();
        
        System.out.println("Height of the rectangle: ");
        int width = input.nextInt();
        
        Rectangle rect = new Rectangle(height, width);
        
        height = (int) rect.getHeight();
        width = (int) rect.getWidth();
        double area = width * height;
        
        System.out.println("Width is: " + width + "    Height is: " + height);
        System.out.println("Area is : " + area);
    }
}


