package com.codebind;
import java.util.ArrayList;
import org.joda.time.DateTime;

public class course 
{
	
	private String courseName;
	private DateTime startDate;
    private DateTime endDate;
    private ArrayList<module> modules;
	
	public course(String coursename, DateTime startdate, DateTime enddate, ArrayList<module> modules)
	{
		this.courseName = coursename;
		this.startDate = startdate;
		this.endDate = enddate;
		this.modules = modules;	
	}
	
	public void addModule(module module1)
	{
		this.modules.add(0, module1);
		for(student student: module1.getStudents())
		{
			student.setCourse(this);
		}
	}
	
	public void removeModule(module module1)
	{
		int index = this.modules.indexOf(module1);
		this.modules.remove(index);
	}
	
	public String getName()
	{
		return courseName;
	}
	
	public void setName(String name)
	{
		this.courseName = name;
	}
	
	public DateTime getStartDate()
	{
		return startDate;
	}
	
	public void setStartDate(DateTime start) 
	{
		this.startDate = start;
	}
	
	public DateTime getEndDate()
	{
		return endDate;
	}
	
	public void setEndDate(DateTime end)
	{
		this.endDate = end;
	}
	
	public ArrayList<module> getModules()
	{
		return modules;
	}
	
	public void setModules(ArrayList<module> module1)
	{
		this.modules = module1;
	}
}
