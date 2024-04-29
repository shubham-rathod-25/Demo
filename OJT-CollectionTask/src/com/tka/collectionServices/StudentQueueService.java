package com.tka.collectionServices;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Scanner;

import com.tka.entity.Student;

public class StudentQueueService 
{
	static ArrayDeque<Student> dqueue = new ArrayDeque();
	static Scanner sc = new Scanner(System.in);
	
	public static void addRecord(Student s)
	{
		dqueue.add(s);
	}
	
	public static void displayRecord()
	{
		Iterator itr = dqueue.iterator();
        while(itr.hasNext())
        {
       	 System.out.println(itr.next());
        }
	}
	
	public static void updateRecord(int rollno,double fee)
	{
		for(Student s : dqueue)
			if(s.getRollnum()==rollno)
			{
				s.setFees(fee);
				break;
			}
	}
	
	public static void deleteRecord(int rollno) 
	{
	    Iterator<Student> iterator = dqueue.iterator();
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
		for(Student s:dqueue)
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
