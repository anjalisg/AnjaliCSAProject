//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Class
{
	private String name;
	private Student[] studentList;
	
	public Class()
	{
		name="";
		studentList=new Student[0];
	}
	
	public Class(String name, int stuCount)
	{
		this.name =name;
		studentList = new Student[stuCount];
	
	}
	
	public void addStudent(int stuNum, Student s)
	{
		studentList[stuNum] = s;

	}
	
	public String getClassName()
	{
	   return name;	
	}
	
	public double getClassAverage()
	{
		//Student stud = new Student();
		double classAverage=0.0;
		for(int i=0; i<studentList.length; i++){
			classAverage+= studentList[i].getAverage();
		}
		classAverage/= studentList.length;

		return classAverage;
	}
	
	public double getStudentAverage(int stuNum)
	{
		return studentList[stuNum].getAverage();
	}

	public double getStudentAverage(String stuName)
	{
		int index=0;
		for(int i=0; i<studentList.length; i++){
			if(studentList[i].getName().equals(stuName)){
				index=i;
			}
		}
		return getStudentAverage(index);
	}
	
	public String getStudentName(int stuNum)
	{
		String out ="";
		for(int i=0; i<studentList.length; i++){
			if(i == stuNum){
				out= studentList[i].getName();
			}
		}
		return out;
	}

	public String getStudentWithHighestAverage()
	{
		double high = Double.MIN_VALUE;
		String hName ="";
		for(int i=0; i<studentList.length; i++){
			if(studentList[i].getAverage() > high){
				high = studentList[i].getAverage();
				hName = studentList[i].getName();
			}
		}
		return hName;
	}

	public String getStudentWithLowestAverage()
	{
		double low = Double.MAX_VALUE;
		String lName ="";		
		for(int i=0; i<studentList.length; i++){
			if(studentList[i].getAverage() < low){
				low = studentList[i].getAverage();
				lName = studentList[i].getName();
			}
		}
		return lName;
	}
	
	public String getFailureList(double failingGrade)			
	{
		String output="";

		for(int i=0; i<studentList.length; i++) {
			if(studentList[i].getAverage()<=failingGrade) {	//F
				output+= studentList[i].getName();
			}
		}
		
		return output;
	}
	
	public String toString()
	{
		String output=""+getClassName()+"\n";
		for(int i=0; i<studentList.length; i++) {
			output+=studentList[i].getName()+" = ";
			output+=Arrays.toString(studentList[i].getGrades()) +"\t\t\t" +studentList[i].getAverage()+"\n";
		}



		return output;
	}

	public void sort() {
		// bubblesort
		for(int i=0; i<studentList.length-1; i++) {
			for(int j=0; j<studentList.length-i-1; j++) {
				if(studentList[j].compareTo(studentList[j+1])==1) {
					//swap
					Student temp = studentList[j];
					studentList[j] = studentList[j+1];
					studentList[j+1]=temp;
				}
			}
		}
		
	}  	
}