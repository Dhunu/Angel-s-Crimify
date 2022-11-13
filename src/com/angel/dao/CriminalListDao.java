package com.angel.dao;

import com.angel.exceptions.CriminalListException;
import com.angel.model.CriminalList;

public interface CriminalListDao {
	
	public String insertCriminalDetails(CriminalList criminalList) throws CriminalListException;
	
	public CriminalList getCriminalByName(String name);

}
