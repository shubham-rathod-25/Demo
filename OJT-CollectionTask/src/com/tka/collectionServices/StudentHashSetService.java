package com.tka.collectionServices;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

import com.tka.entity.Student;

public class StudentHashSetService 
{
	static HashSet<Student> hashset = new HashSet();
	static Scanner sc = new Scanner(System.in);
	
	public static void addRecord(Student s)
	{
		hashset.add(s);
	}
	
	public static void displayRecord()
	{
		Iterator itr = hashset.iterator();
        while(itr.hasNext())
        {
       	 System.out.println(itr.next());
        }
	}
	
	public static void updateRecord(int rollno,double fee)
	{
		for(Student s : hashset)
			if(s.getRollnum()==rollno)
			{
				s.setFees(fee);
				break;
			}
	}
	
//	public static void deleteRecord(int rollno)
//	{
//		for (Student s : hashset) 
//		{
//			if(s.getRollnum()==rollno) 
//			{
//				hashset.remove(s);
//			}
//		}
//		
//	}
	
	public static void deleteRecord(int rollno) 
	{
	    Iterator<Student> iterator = hashset.iterator();
	    while (iterator.hasNext()) 
	    {
	        Student s = iterator.next();
	        if (s.getRollnum() == rollno) 
	        {
	            iterator.remove();
	        }
	    }
	}

	public static void searchRecord(int rollno)
	{
		boolean found = false;
		for(Student s:hashset)
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
