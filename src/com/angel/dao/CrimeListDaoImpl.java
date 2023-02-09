package com.angel.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.angel.exceptions.CrimeListExecption;
import com.angel.model.CrimeList;
import com.angel.utilities.DBUtil;

public class CrimeListDaoImpl implements CrimeListDao{

	@Override
	public String insertCrimeDetails(CrimeList crimeList) throws CrimeListExecption {
		
		String message = "Not inserted...";
		
		try(Connection conn = DBUtil.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement(
					"insert into crimelist values(?,?,?,?,?,?,?)");
			
			ps.setInt(1, crimeList.getFirID());
			ps.setDate(2, (Date) crimeList.getDate());
			ps.setString(3, crimeList.getPlace());
			ps.setString(4, crimeList.getVictims());
			ps.setString(5, crimeList.getDescription());
			ps.setString(6, crimeList.getDetailDesc());
			ps.setString(7, crimeList.getMainSuspect());
			
			
			int x = ps.executeUpdate();
			
			if(x>0)
				message = "Record inserted succesfully";
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new CrimeListExecption(e.getMessage());
		}
		
		return message;
		
	}

	
	
	

}
