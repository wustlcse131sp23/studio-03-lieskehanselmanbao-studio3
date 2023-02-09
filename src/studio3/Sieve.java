package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("How many numbers in the array? ");
		int n = in.nextInt();
		int[] array = new int[n-2];

		for(int i=0; i<array.length; i++) {
			array[i]=i+2;
		}

		for(int j = 0; j<array.length; j++) {
			if(array[j]!=0) {
				for(int k = j+1; k<array.length; k++) {
					if(array[k]%array[j]==0) {
						array[k]=0;
					}
				}
			}
		}
		for(int i=0; i<array.length; i++) {
			if(array[i]!=0) {
				System.out.print(array[i]+" ");
			}
		}

	}

}
