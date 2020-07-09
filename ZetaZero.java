package standardCFs;
import java.util.Scanner;
import java.lang.*;

public class ZetaZero {

	public static void main(String[] args) {

		System.out.println("Enter a number:");
		Scanner keyboard = new Scanner(System.in);
		double num = keyboard.nextDouble();
		double 	Z = 1-(1/Math.pow(2,num))+(1/Math.pow(3,num))-(1/Math.pow(4,num))+(1/Math.pow(5,num))-(1/Math.pow(6,num))+(1/Math.pow(7,num))-(1/Math.pow(8,num))+(1/Math.pow(9,num))-(1/Math.pow(10,num))+(1/Math.pow(11,num))-(1/Math.pow(12,num))+(1/Math.pow(13,num))-(1/Math.pow(14,num))+(1/Math.pow(15,num))-(1/Math.pow(16,num))+(1/Math.pow(17,num))-(1/Math.pow(18,num))+(1/Math.pow(19,num))-(1/Math.pow(20,num))
				;
				System.out.println("Z("+num+")"+" = "+Z);
		
		
		
	}
}
