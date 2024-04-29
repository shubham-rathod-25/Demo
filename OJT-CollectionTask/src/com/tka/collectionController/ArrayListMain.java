package com.tka.collectionController;

import java.util.Scanner;

import com.tka.collectionServices.StudentArrayListService;
import com.tka.entity.Student;


public class ArrayListMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int choice=0,ch=0;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("************** Drop Down Menu Driven For ArrayList **************");
		 System.out.println("Choose One Option From Below Options......");
		 System.out.println("\n");
		do
		{
			System.out.println("1.Add Record In ArrayList");
			System.out.println("2.Display Records From ArrayList");
			System.out.println("3.Update Record From ArrayList");
			System.out.println("4.Delete Perticular Record From ArrayList");
			System.out.println("5.Search a Perticular Record From ArrayList");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
			{   System.out.println("Enter Roll_Number, Student_Name, Age and Total Fees Paid:");
				StudentArrayListService.addRecord(new Student(sc.nextInt(),sc.next(),sc.nextInt(),sc.nextDouble()));
				break;
			}
			case 2:
			{
				StudentArrayListService.displayRecord();
				break;
			}
			case 3:
			{
				System.out.println("Enter Roll_Number and Fees to be updated");
				StudentArrayListService.updateRecord(sc.nextInt(),sc.nextDouble());
			    break;
			}
			case 4:
			{
				System.out.println("Enter Roll_Number ");
				StudentArrayListService.deleteRecord(sc.nextInt());
			    break;
			}
			case 5:
			{
				System.out.println("Enter Roll_Number ");
				StudentArrayListService.searchRecord(sc.nextInt());
				break;
			}
			}
		System.out.println("Enter 1 to continue...");	
		choice=sc.nextInt();
		}while(choice==1);


	}

}
