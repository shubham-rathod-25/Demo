package com.tka.collectionServices;

import java.util.LinkedList;
import java.util.Scanner;

import com.tka.entity.Student;

public class StudentLinkedListService 
{
	static LinkedList<Student> linkedlist = new LinkedList();
	static Scanner sc = new Scanner(System.in);
	
	public static void addRecord(Student s)
	{
		linkedlist.add(s);
	}
	
	public static void displayRecord()
	{
		System.out.println(linkedlist);
	}
	
	public static void updateRecord(int rollno,double fee)
	{
		for(Student s : linkedlist)
			if(s.getRollnum()==rollno)
			{
				s.setFees(fee);
				break;
			}
	}
	
	public static void deleteRecord(int rollno)
	{
		for(int i=0;i<linkedlist.size();i++)
		{
			if(linkedlist.get(i).getRollnum()==rollno)
			{
				linkedlist.remove(i);
				break;
			}
		}
	}
	
	public static void searchRecord(int rollno)
	{
		boolean found = false;
		for(Student s:linkedlist)
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
