package yuvaraj.practice;

import java.util.Scanner;

public class day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	int arr[]= {1,2,3,4,5};
		//System.out.println(arr.length);
		//for(int i=0;i<arr.length;i++) {
		//	System.out.println(i);
	//	}
		int i=arr.length;
		while(i>0) {
			System.out.println(arr[i-1]);
			i--;
		}*/
		//Palindrome:
		int r,sum=0,temp;    
		System.out.println("Enter number");
		Scanner sc=new Scanner(System.in);
		  int n=sc.nextInt();//It is the number variable to be checked for palindrome  
		  
		  temp=n;    
		  while(n>0){    
		   r=n%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
		}  

}
