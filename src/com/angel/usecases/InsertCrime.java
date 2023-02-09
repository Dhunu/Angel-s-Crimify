package com.angel.usecases;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import com.angel.dao.CrimeListDao;
import com.angel.dao.CrimeListDaoImpl;
import com.angel.exceptions.CrimeListExecption;
import com.angel.model.CrimeList;

public class InsertCrime {
	
	public static void main(String[] args) throws CrimeListExecption {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter FIR ID: ");
			int firID = sc.nextInt();
			
			System.out.println("Enter date: ");
			String date = sc.next();
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");
			java.util.Date d=null;
			try {
				d = dateFormat.parse(date);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Date dateSql = new Date(d.getTime());
			
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
			
			CrimeList crimeList = new CrimeList(dateSql,place,description,victims,detailDesc, mainSuspect, firID);
			
			String result = dao.insertCrimeDetails(crimeList);
			
			System.out.println(result);
		}
		
	}

}
