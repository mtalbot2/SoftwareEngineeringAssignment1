package com.codebind;
public class student 
{
	public static String name;
	public static int age;	
	public String DOB;
	public int ID;
	public static String username;

	
	public student(String name, int age, String DOB, int ID)
	{
		this.name = name;
		this.age = age;
		this.DOB = DOB;
		this.ID = ID;		
	}

	public String getUsername() 
	{
		name = getName();
		age = getAge();
		username = name + age;
		return username;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public String getDOB()
	{
		return DOB;
	}
	
	public int getID()
	{
		return ID;
	}
}
