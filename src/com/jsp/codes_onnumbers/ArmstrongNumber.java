package com.jsp.codes_onnumbers;

public class ArmstrongNumber{
	
	public static boolean isArmstrong(int n) {
		
		int sum = 0;
		int temp = n;
		int count = 0;
		
		//count number of digits
		
		while(temp>0) {
			temp = temp/10;
			count ++;
		}
		
		//last digit
		
		while(temp>0) {
			int lastdigit = temp%10;
			
			int prod = 1;
			for(int i = 1; i<= count; i++) {
				prod = prod * lastdigit;
				
				sum = sum + lastdigit;
			}
			
			temp = temp/10;
			
		}
		if(sum == n) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String args[]) {
		System.out.println(isArmstrong(370));
	}
}