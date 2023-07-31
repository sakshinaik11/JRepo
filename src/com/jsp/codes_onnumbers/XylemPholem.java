package com.jsp.codes_onnumbers;

public class XylemPholem{
	public static boolean isXylemPholem(int n) {
		
		int temp = n;
		int sum1=0; int sum2 = 0;
		int count1 = 0; int count2= 0;
		
		// count number of Digits
		while(n > 0) {
			n = n/10;
			count1 ++;
		}
		
		// Perform Sum 
		while(n>0) {
			int lastdigit = n %10;
			count2 ++;
			
			if(count2 == 1 || count2 == count1) {
				sum1 = sum1 + lastdigit;
			}
			else {
				sum2 = sum2 + lastdigit;
			}
		}
		n = n/10;
		
		if(sum1 == sum2) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public static void main(String args[]) {
		
		System.out.println(isXylemPholem(1245));
	}
	
}