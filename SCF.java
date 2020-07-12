package standardCFs;
import java.util.Scanner;
public class SCF{
	public static void main(String[] args) {
		double x;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a rational number in the form of a decimal:");
		
		x = keyboard.nextDouble();
		keyboard.close();
		
		double aDouble = Math.floor(x);
		int aInt = (int) aDouble;
		
		System.out.print("[ " + aInt + "; ");
		
		int i = 0;
		
		while(i<Integer.MAX_VALUE) {
			double y = Math.floor(1/(x-Math.floor(x)));
			int z = (int)y;
			if (y>1E3) {
				System.out.print("]");
				System.exit(0);
			}
			
			System.out.print(z + " ");
			
			if (x-Math.floor(x)!=0) {
				x = 1/(x-Math.floor(x));
				i++;
				}
			else {
			}
		
		}
	
	}
	
}