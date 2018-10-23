package com.codebind;
import java.util.ArrayList;
import org.joda.time.DateTime;

public class course 
{
	
	private String courseName;
	private String courseStudent;
	DateTime startDate = new DateTime();
    DateTime endDate = new DateTime();
    private ArrayList<String> courseStudents;
	
	public course(String coursename, String coursestudent, DateTime startdate, DateTime enddate)
	{
		this.courseName = coursename;
		this.courseStudent = coursestudent;
		this.startDate = startdate;
		this.endDate = enddate;
		courseStudents = new ArrayList<String>();	
	}
	
	public String getCourseName()
	{
		return courseName;
	}
	
	public ArrayList<String> getCourseStudents()
	{
		return courseStudents;
	}
	
	public void addCourseStudent()
	{
		courseStudents.add(courseStudent);
	}
	
	public DateTime getStartDate()
	{
		return startDate;
	}
	
	public DateTime getEndDate()
	{
		return endDate;
	}	
	
	@Override
	public String toString()
	{
		return courseName;
	}

}
