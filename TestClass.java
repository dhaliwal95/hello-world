
import java.util.Scanner;

public class TestClass {

	public static void main(String args[])
	{
	  Scanner in;
	   int x, y, z;
	   System.out.println("Enter two integers to calculate their addition: ");
	   in = new Scanner(System.in);
	   x = in.nextInt();
	   y = in.nextInt();
	   z = x * y;
	   System.out.println("Multiplication of entered integers = "+z);
	}
}

