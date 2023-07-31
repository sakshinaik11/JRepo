package com.jsp.codes_onnumbers;

public class SpyNumber{
	
	public static boolean isSpyNum(int n) {
		int sum = 0;
		int prod = 0;
		
		while(n > 0) {
			int lastdigit = n % 10;
			sum = sum + lastdigit;
			prod = prod + lastdigit;
			n = n/10;
		}
		if(sum == prod) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String args[]) {
		
		System.out.println(SpyNumber.isSpyNum(1124));
	}
}