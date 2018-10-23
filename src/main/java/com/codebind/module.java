package com.codebind;
import java.util.ArrayList;

public class module 
{
	
	private String modName;
	private String modID;
	private ArrayList<student> modStudents;

	public module(String modName, String modID, ArrayList<student> students)
	{
		this.modName = modName;
		this.modID = modID;
		this.modStudents = students;
	}
	
	public void addStudent(student student)
	{
		this.modStudents.add(student);
		student.addModule(this);
	}
	
	public void removeStudent(student student)
	{
		int index = this.modStudents.indexOf(student);
		this.modStudents.remove(index);
	}
	
	public ArrayList<student> getStudents()
	{
		return modStudents;
	}
	
	public void setStudents(ArrayList<student> students)
	{
		this.modStudents = students;
	}
	
	public String getName()
	{
		return modName;
	}
	
	public void setName(String name)
	{
		this.modName = name;
	}
	
	public String getId()
	{
		return modID;
	}
	
	public void setId(String id)
	{
		this.modID = id;
	}
	
}
