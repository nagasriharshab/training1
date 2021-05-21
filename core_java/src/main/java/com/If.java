package com;

public class If {

	public static void main(String[] args) {
		int marks=37;
		int n=5;
		
		if(marks>60) {
			n=1;
		}
		else {
			if(marks>=45  && marks<60) {
				n=2;
			}
			else {
				if(marks>=33  && marks<45) {
					n=3;
				}
				else {
					n=4;
				}
			}
		}
		System.out.println("the class is "+n);

	}

}
