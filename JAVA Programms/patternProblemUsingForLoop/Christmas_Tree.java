package patternProblemUsingForLoop;

import java.util.Scanner;

public class Priyankas_Christmas_Tree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i =1; i<=n;i++) {
            
				for(int j=1;j<=n-i;j++) {
					System.out.print(" ");
				}

				for(int j=1; j<=i;j++) {
					System.out.print("* ");
				}
				System.out.println();
		}
		
		
			for(int i=1; i<=n/2-1; i++) {
				
				for(int j=1; j<=n-2; j++) {
					System.out.print(" ");
				}
				
				for(int j=1; j<=2; j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
			
			for(int i =1; i<=n;i++) {
	            for(int j=1;j<=i-1;j++) {
	                System.out.print(" ");
	            }
	            for(int j=1; j<=n-i+1;j++) {
	                System.out.print("* ");
	        }
	            System.out.println();
	        }
	}
}


