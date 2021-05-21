package com;

public class factorial {
	public static void main(String[] args) {
		int j=1;
		int n=6;
		int i=1;
		for(i=1;i<=n;i++) {
			j=j*i ;
		}
		System.out.println("the factorial of "+n+" is "+ j);
	}

}
