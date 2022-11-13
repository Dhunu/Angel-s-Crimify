package com.angel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.angel.model.CrimeList;
import com.angel.utilities.DBUtil;

public class CrimeListDaoImpl implements CrimeListDao{

	@Override
	public String insertCrimeDetails(CrimeList crimeList) {
		
		String message = "Not inserted...";
		
		try(Connection conn = DBUtil.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement(
					"insert into crimelist values(?,?,?,?,?,?,?)");
			
			ps.setInt(1, crimeList.getDate());
			ps.setString(2, crimeList.getPlace());
			ps.setString(3, crimeList.getDescription());
			ps.setString(4, crimeList.getVictims());
			ps.setString(5, crimeList.getDetailDesc());
			ps.setString(6, crimeList.getMainSuspect());
			ps.setInt(7, crimeList.getFirID());
			
			int x = ps.executeUpdate();
			
			if(x>0)
				message = "Record inserted succesfully";
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return message;
		
	}
	
	

}
