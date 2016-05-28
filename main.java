package com.acadgild.assignment.interfaces;

import java.util.Scanner;

public class main implements nbr,sq_nbr{
	
	public static void main(String[] args) {	
		main obj = new main();
		obj.number();
		obj.sq_number();
	}

	@Override
	public void sq_number() {	
		System.out.println();
		System.out.println("Again enter the number : ");
		Scanner scan = new Scanner(System.in);
		int nb = scan.nextInt();
		System.out.println("The square of the number is :"+nb*nb);	
	}

	@Override
	public void number() {
		System.out.println("Enter the number : ");
		Scanner scan = new Scanner(System.in);
		int nb = scan.nextInt();
		System.out.println("The number is :"+nb);	
	}
}
