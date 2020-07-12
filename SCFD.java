package standardCFs;
import java.util.Scanner;

public class SCFD {
	
	public static void main(String[] args){
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the amount of a-values in the continued fraction:");
		int n = keyboard.nextInt();
		
		
		int aArray[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			
			System.out.println("a"+i+" = ");
			aArray[i] = keyboard.nextInt();
		}
		
		keyboard.close();
		
		
		int hArray[] = new int[n+2];
		int kArray[] = new int[n+2];
		
		hArray[0]=0;
		hArray[1]=1;
		
		kArray[0]=1;
		kArray[1]=0;
		
		for(int i = 2; i < n + 2; i++) {
			hArray[i] = (aArray[i-2]*hArray[i-1])+hArray[i-2];
			kArray[i] = (aArray[i-2]*kArray[i-1])+kArray[i-2];
		}
		
		System.out.println("h = "+hArray[n+1]);
		System.out.println("k = "+kArray[n+1]);
		
		double h = Double.valueOf(hArray[n+1]);
		double k = Double.valueOf(kArray[n+1]);
		
		System.out.println("h/k = "+h/k);
	}
		}
	


	

