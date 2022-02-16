import java.util.Scanner;
public class AreaofRectangle{
    public static void main(String[] args) {
        //area of a rectange
		//area= l*b;
        Scanner s =new Scanner(System.in);
		int length, breadth;
		double area;
        System.out.println("Enter length and breadth to calculate area of rectangle:");
		length = s.nextInt();
        breadth = s.nextInt(); 
        
        area = length*breadth;
		
		System.out.println("Area of a Rectangle is "+area+".");
    }
}