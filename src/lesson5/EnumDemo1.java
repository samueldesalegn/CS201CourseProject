package src.lesson5;

import java.util.Scanner;
enum Month {JAN, FEB, MAR, APR, MAY, JUN,
	JUL, AUG, SEP, OCT, NOV, DEC};

public class EnumDemo1 {
		public static void main(String[] args) {
				//values() returns an array containing all of the values 
				//of the enum in the order they are declared 
		//	setSize("Large");
		for(Month mon : Month.values())
			 System.out.println("Month Name : " + mon.name() + " and position :" + mon.ordinal());
	}
}
			
		
		
				
		