package com.tka.collectionController;

import java.util.Scanner;

import com.tka.collectionServices.StudentTreeSetService;
import com.tka.entity.Student;

public class TreeSetMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int choice=0,ch=0;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("************** Drop Down Menu Driven For TreeSet **************");
		 System.out.println("Choose One Option From Below Options......");
		 System.out.println("\n");
		do
		{
			System.out.println("1.Add Record In TreeSet");
			System.out.println("2.Display Records From TreeSet");
			System.out.println("3.Update Record From TreeSet");
			System.out.println("4.Delete Perticular Record From TreeSet");
			System.out.println("5.Search a Perticular Record From TreeSet");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
			{   System.out.println("Enter Roll_Number, Student_Name, Age and Total Fees Paid:");
				StudentTreeSetService.addRecord(new Student(sc.nextInt(),sc.next(),sc.nextInt(),sc.nextDouble()));
				break;
			}
			case 2:
			{
				StudentTreeSetService.displayRecord();
				break;
			}
			case 3:
			{
				System.out.println("Enter Roll_Number and Fees to be updated");
				StudentTreeSetService.updateRecord(sc.nextInt(),sc.nextDouble());
			    break;
			}
			case 4:
			{
				System.out.println("Enter Roll_Number ");
				StudentTreeSetService.deleteRecord(sc.nextInt());
			    break;
			}
			case 5:
			{
				System.out.println("Enter Roll_Number ");
				StudentTreeSetService.searchRecord(sc.nextInt());
				break;
			}
			}
		System.out.println("Enter 1 to continue...");	
		choice=sc.nextInt();
		}while(choice==1);

	}

}
