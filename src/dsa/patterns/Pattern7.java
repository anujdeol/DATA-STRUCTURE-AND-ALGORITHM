package dsa.patterns;

import java.util.Scanner;

public class Pattern7 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		
		int sp=0;
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<sp; j++) {
				System.out.print(" ");
			}
			sp++;
			System.out.print("* \n");
			
			
		}
		
		
		
	}

}