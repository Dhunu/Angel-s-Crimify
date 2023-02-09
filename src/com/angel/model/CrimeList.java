package com.angel.model;

import java.sql.Date;

public class CrimeList {

	private java.util.Date date;
	private String place;
	private String description;
	private String victims;
	private String detailDesc;
	private String mainSuspect;
	private int firID;
	
	public CrimeList() {
		// TODO Auto-generated constructor stub
	}

	public CrimeList(java.util.Date d, String place, String description, String victims, String detailDesc, String mainSuspect,
			int firID) {
		super();
		this.date = d;
		this.place = place;
		this.description = description;
		this.victims = victims;
		this.detailDesc = detailDesc;
		this.mainSuspect = mainSuspect;
		this.firID = firID;
	}
	
	

	@Override
	public String toString() {
		return "CrimeList [date=" + date + ", place=" + place + ", description=" + description + ", victims=" + victims
				+ ", detailDesc=" + detailDesc + ", mainSuspect=" + mainSuspect + ", firID=" + firID + "]";
	}

	public java.util.Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getVictims() {
		return victims;
	}

	public void setVictims(String victims) {
		this.victims = victims;
	}

	public String getDetailDesc() {
		return detailDesc;
	}

	public void setDetailDesc(String detailDesc) {
		this.detailDesc = detailDesc;
	}

	public String getMainSuspect() {
		return mainSuspect;
	}

	public void setMainSuspect(String mainSuspect) {
		this.mainSuspect = mainSuspect;
	}

	public int getFirID() {
		return firID;
	}

	public void setFirID(int firID) {
		this.firID = firID;
	}
	
	
	
}
