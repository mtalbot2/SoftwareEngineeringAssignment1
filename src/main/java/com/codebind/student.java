package com.codebind;

import java.util.ArrayList;
import org.joda.time.DateTime;

public class student 
{
	private String name;
	private int age;	
	private DateTime DOB;
	private int ID;
	private String username;
	private ArrayList<module> module = new ArrayList <module>();
	private course collegecourse;

	
	public student(String name, int age, DateTime DOB, int ID)
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
	
	public DateTime getDOB()
	{
		return DOB;
	}
	
	public int getID()
	{
		return ID;
	}
	
    public void setId(int id) {
        this.ID = id;
    }

    public DateTime getDob() {
        return DOB;
    }

    public void setDob(DateTime dob) {
        this.DOB = dob;
    }

    public ArrayList<module> getModules() {
        return module;
    }

    public void setModules(ArrayList<module> modules) {
        this.module = modules;
    }

    public void addModule(module module) {
        this.module.add(0, module);
    }

    public course getCourse() {
        return collegecourse;
    }

    public void setCourse(course course) {
        this.collegecourse = course;
    }
}
