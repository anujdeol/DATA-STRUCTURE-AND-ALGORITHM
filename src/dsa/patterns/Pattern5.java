package dsa.patterns;

import java.util.Scanner;

public class Pattern5 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int sp=n/2;
		int st=1;
		int temp =n;
		for(int i=0; i<temp; i++)
		{
			
			for(int j=0; j<=sp; j++)
			{
				System.out.print(" ");
			}
			for(int j=0; j<st; j++)
			{
				System.out.print("*");
			}
		
			if(i<n/2)
			{
				sp--;
				st+=2;
			}
			else {
				sp++;
				st-=2;
			}
			
			System.out.println("\n");
			
		}
		
		
	}

}
