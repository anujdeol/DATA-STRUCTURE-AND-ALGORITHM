package dsa.patterns;

import java.util.Scanner;

public class Pattern8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int sp = n - 1;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < sp; j++) {

				System.out.print(" ");
			}
			System.out.print("* \n");
			sp--;

		}

	}

}
