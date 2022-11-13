package com.angel;

import java.util.Scanner;

import com.angel.exceptions.CrimeListExecption;
import com.angel.exceptions.CriminalListException;
import com.angel.usecases.InsertCrime;
import com.angel.usecases.InsertCriminal;

public class Main {
	public static void main(String[] args) throws CrimeListExecption, CriminalListException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What would you like to do?");
		System.out.println("1. File an FIR");
		System.out.println("2. Add criminal to database");
		System.out.println("3. Search for a criminal");
		
		int choice = sc.nextInt();
		
		switch (choice) {
		case 1:
			InsertCrime insertCrime = new InsertCrime();
			insertCrime.main(args);
			break;
		case 2:
			InsertCriminal insertCriminal =  new InsertCriminal();
			insertCriminal.main(args);
			break;
			
		case 3:
			
			
		default:
			throw new IllegalArgumentException("Unexpected value: " + choice);
		}
		
		
	}

}
