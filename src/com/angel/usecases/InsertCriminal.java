package com.angel.usecases;

import java.util.Scanner;

import com.angel.dao.CriminalListDao;
import com.angel.dao.CriminalListDaoImpl;
import com.angel.exceptions.CriminalListException;
import com.angel.model.CriminalList;

public class InsertCriminal {
	
	public static void main(String[] args) throws CriminalListException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name: ");
		String name = sc.next();
		
		System.out.println("Enter age: ");
		int age = sc.nextInt();
		
		System.out.println("Enter gender: ");
		String gender = sc.next();
		
		System.out.println("Enter address: ");
		String address = sc.next();
		
		System.out.println("Enter Identifying Mark: ");
		String identifyingMark = "";
		if(sc.nextLine()!=null) {
			identifyingMark = sc.nextLine();
		}
		
		System.out.println("Enter attached crime: ");
		String attachedCrime = sc.next();
		
		System.out.println("Enter area first attached: ");
		String areaFirstArrested = sc.next();
		
		CriminalListDao dao = new CriminalListDaoImpl();
		
		CriminalList criminalList = new CriminalList(
				name,age,gender,address,identifyingMark,attachedCrime,areaFirstArrested);	
		
		String result = dao.insertCriminalDetails(criminalList);
		
		System.out.println(result);
	}

}
