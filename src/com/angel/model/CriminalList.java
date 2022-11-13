package com.angel.model;

public class CriminalList {
	
	private String name;
	private int age;
	private String gender;
	private String address;
	private String identifyingMark;
	private String areaFirstArrested;
	private String attachedCrime;
	
	public CriminalList() {
		// TODO Auto-generated constructor stub
	}

	public CriminalList(String name, int age, String gender, String address, String identifyingMark,
			String areaFirstArreted, String attachedCrime) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.identifyingMark = identifyingMark;
		this.areaFirstArrested = areaFirstArreted;
		this.attachedCrime = attachedCrime;
	}


	@Override
	public String toString() {
		return "CriminalList [name=" + name + ", age=" + age + ", gender=" + gender + ", address=" + address
				+ ", identifyingMark=" + identifyingMark + ", areaFirstArreted=" + areaFirstArrested + ", attachedCrime="
				+ attachedCrime+"]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getIdentifyingMark() {
		return identifyingMark;
	}

	public void setIdentifyingMark(String identifyingMark) {
		this.identifyingMark = identifyingMark;
	}

	public String getAreaFirstArrested() {
		return areaFirstArrested;
	}

	public void setAreaFirstArrested(String areaFirstArreted) {
		this.areaFirstArrested = areaFirstArreted;
	}

	public String getAttachedCrime() {
		return attachedCrime;
	}

	public void setAttachedCrime(String attachedCrime) {
		this.attachedCrime = attachedCrime;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
