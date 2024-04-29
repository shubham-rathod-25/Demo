package com.tka.collectionServices;

import java.util.ArrayList;
import java.util.Scanner;

import com.tka.entity.Student;

public class StudentArrayListService
{
	static ArrayList<Student> arraylist = new ArrayList();
	static Scanner sc = new Scanner(System.in);
	
	public static void addRecord(Student s)
	{
		arraylist.add(s);
	}
	
	public static void displayRecord()
	{
		System.out.println(arraylist);
	}
	
	public static void updateRecord(int rollno,double fee)
	{
		for(Student s : arraylist)
			if(s.getRollnum()==rollno)
			{
				s.setFees(fee);
				break;
			}
	}
	
	public static void deleteRecord(int rollno)
	{
		for(int i=0;i<arraylist.size();i++)
		{
			if(arraylist.get(i).getRollnum()==rollno)
			{
				arraylist.remove(i);
				break;
			}
		}
	}
	
	public static void searchRecord(int rollno)
	{
		boolean found = false;
		for(Student s:arraylist)
		{
			if(s.getRollnum()==rollno)
			{
				System.out.println(s);
				found=true;
				break;
			}
		}
		if(found==false)
			System.out.println("Student Details Not Found...");
	}

}
