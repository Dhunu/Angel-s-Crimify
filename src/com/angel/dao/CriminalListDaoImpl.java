package com.angel.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.angel.exceptions.CriminalListException;
import com.angel.model.CriminalList;
import com.angel.utilities.DBUtil;

public class CriminalListDaoImpl implements CriminalListDao{

	@Override
	public String insertCriminalDetails(CriminalList criminalList) throws CriminalListException {
			
			String message = "Not inserted...";
		
			try(Connection conn = DBUtil.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement(
					"insert into criminals values(?,?,?,?,?,?,?)");
			
			ps.setString(1, criminalList.getName());
			ps.setInt(2, criminalList.getAge());
			ps.setString(3, criminalList.getGender());
			ps.setString(4, criminalList.getAddress());
			ps.setString(5, criminalList.getIdentifyingMark());
			ps.setString(6, criminalList.getAreaFirstArrested());
			ps.setString(7, criminalList.getAttachedCrime());
			
			int x = ps.executeUpdate();
			
			if(x>0)
				message = "Record inserted succesfully";
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new CriminalListException(e.getMessage());
		}
		
		return message;
	}

	@Override
	public CriminalList getCriminalByName(String name) {
		
		CriminalList criminalList = null;
		
		try(Connection conn = DBUtil.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("select * from criminals where name = ?");
			
			ps.setString(1, name);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				int id = rs.getInt("criminalID");
				String n = rs.getString("name");
				String a = rs.getString("age");
				String g = rs.getString("gender");
				String ad = rs.getString("identifyingMark");
				String ac = rs.getString("attachedCrime");
				String afa = rs.getString("areaFirstArrested");
				
				criminalList = new CriminalList(n,id,a,g,ad,ac,afa);
				
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return criminalList;
		
	}

}
