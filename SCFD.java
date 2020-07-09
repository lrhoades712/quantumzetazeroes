package standardCFs;
import java.util.Scanner;
import java.util.ArrayList;

public class SCFD {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How many numbers are there?");
	
		int n = keyboard.nextInt();
		 
		int[] contFrac = new int[n];
		System.out.println(contFrac.length);
		for(int i = 0; i<n; i++) {
			System.out.println("n"+i+"=");
			int ni=contFrac[i]=keyboard.nextInt();
		}
		
	
		}
		
}
	
	double loopIt(int[] array)
	{	
		double answer = array[0];
				
		for(int i=0;i<array.length;i++) {
			answer = array[i]+1/array[i+1];
			
			if(array[i+1]>0) {
				answer+loopIt[answer];
			}
			else {
				return answer;
			}
	}
}

	

