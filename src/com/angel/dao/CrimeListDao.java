package com.angel.dao;

import com.angel.exceptions.CrimeListExecption;
import com.angel.exceptions.CriminalListException;
import com.angel.model.CrimeList;
import com.angel.model.CriminalList;

public interface CrimeListDao {

	public String insertCrimeDetails(CrimeList crimeList) throws CrimeListExecption;
	
}
