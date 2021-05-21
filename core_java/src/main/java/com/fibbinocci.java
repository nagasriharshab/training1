package com;

public class fibbinocci {

	public static void main(String[] args) {
		int n=23;
		int i=0;
		int j=1;
		int k=1;
		int l;
		System.out.println(i);
		System.out.println(j);
		for(l=1;l<=n;l++) {
			k=i+j;
			System.out.println(k);
			i=j;
			j=k;
			
			
		}

	}

}
