package com.tka.entity;

public class Student implements Comparable<Student>
{
	private int rollnum;
	private String name;
	private int age;
	private double fees;
	
	public Student() 
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int rollnum, String name, int age, double fees) 
	{
		super();
		this.rollnum = rollnum;
		this.name = name;
		this.age = age;
		this.fees = fees;
	}

	public int getRollnum() {
		return rollnum;
	}

	public void setRollnum(int rollnum) {
		this.rollnum = rollnum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	@Override
	public String toString() {
		return "Student [rollnum=" + rollnum + ", name=" + name + ", age=" + age + ", fees=" + fees + "]";
	}

	@Override
	public int compareTo(Student o) 
	{
		// TODO Auto-generated method stub
		if(this.getFees()<o.getFees())
			return 1;
		else
			return -1;
	}
	
	
}
