package com.tka.collectionServices;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

import com.tka.entity.Student;

public class StudentTreeSetService 
{
    static TreeSet<Student> treeset = new TreeSet();
	static Scanner sc = new Scanner(System.in);
	
	public static void addRecord(Student s)
	{
		treeset.add(s);
	}
	
	public static void displayRecord()
	{
		Iterator itr = treeset.iterator();
        while(itr.hasNext())
        {
       	 System.out.println(itr.next());
        }
	}
	
	public static void updateRecord(int rollno,double fee)
	{
		for(Student s : treeset)
			if(s.getRollnum()==rollno)
			{
				s.setFees(fee);
				break;
			}
	}
	
	public static void deleteRecord(int rollno) 
	{
	    Iterator<Student> iterator = treeset.iterator();
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
		for(Student s:treeset)
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
