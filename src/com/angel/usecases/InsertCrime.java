package com.angel.usecases;

import java.sql.Date;
import java.util.Scanner;

import com.angel.CrimeListDao;
import com.angel.CrimeListDaoImpl;
import com.angel.model.CrimeList;

public class InsertCrime {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter FIR ID: ");
		int firID = sc.nextInt();
		
		System.out.println("Enter date: ");
		int date = sc.nextInt();
		
		System.out.println("Enter place: ");
		String place = sc.next();
		
		System.out.println("Enter description: ");
		String description = sc.next();
		
		System.out.println("Enter no. of victims: ");
		int x = sc.nextInt();
		String victims = "";
		while(x!=0) {
			victims+=sc.next()+", ";
			x--;
		}
		
		System.out.println("Enter main suspect: ");
		String mainSuspect = sc.next();
		
		String detailDesc="";
		if(sc.nextLine()!=null) {
			detailDesc = sc.nextLine();
		}
		
		CrimeListDao dao = new CrimeListDaoImpl();
		
		CrimeList crimeList = new CrimeList(date,place,description,victims,detailDesc, mainSuspect, firID);
		
		String result = dao.insertCrimeDetails(crimeList);
		
		System.out.println(result);
		
	}

}
