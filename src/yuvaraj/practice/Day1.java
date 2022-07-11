package yuvaraj.practice;

import java.util.Scanner;

public class Day1 {
	
		
		
	
	public static void main(String[] args) {
		
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub
		int[] arr= { 16,19,4,7,5,3,2};
		System.out.println(arr[arr.length-1]);
		int max=arr.length-1;
		for(int i=arr.length-1;i>0;i--) {
			if(arr[i-1]>max) {
				max=arr[i-1];
				System.out.println(max);
			}
		}
	/*	int[] arr= {16,19,4,7,5,2};
		int j;
		for(int i=0;i<arr.length;i++) {//i01   3
			for(j=i+1;j<arr.length;j++) {//j12  4
				if(arr[i]<arr[j]) {
					
					break;
				}
				//System.out.printf("yuvi%d/n",j);
				//System.out.printf("yuvi%d/n",i);
			}if(j==arr.length) {
				System.out.printf("yuvi%d/n",j);
				System.out.println(arr.length);
				System.out.println(arr[i]);
			}
		}*/
		
		

	}

}
