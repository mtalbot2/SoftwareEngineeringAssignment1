package com.codebind;
import java.util.ArrayList;

public class module 
{
	
	private String modName;
	private int modID;
	private String modStudent;
	private String course;
	private ArrayList<String> students;

	public module(String modName, int modID, String modStudent, String course)
	{
		this.modName = modName;
		this.modID = modID;
		this.modStudent = modStudent;
		this.course = course;
		students = new ArrayList<String>();
	}
	
	public String getName()
	{
		return modName;
	}
	
	public ArrayList<String> getStudents()
	{
		return students;
	}
	
	public void addStudent(String student)
	{
		students.add(student);
	}
	
	@Override
	public String toString()
	{
		return modName;
	}
}
