package com.prowings.basics.deepcloning;

public class Student implements Cloneable{
	
	int roll;
	String name;
	Address add;
	
	public Student() {
		super();
	}

	public Student(int roll, String name, Address addr) {
		super();
		this.roll = roll;
		this.name = name;
		this.add = addr;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", addr=" + add + "]";
	}
	
	protected Object clone()throws CloneNotSupportedException{
		
		Student dummyStd= (Student)super.clone();   //create dummy copy of student using clone
		
		Address addr= (Address)add.clone();       //also create copy of object
		
		dummyStd.add = addr;      //assign address copy to dummy student object
		return dummyStd;      //return dummyStudent
		
	}
	
}
