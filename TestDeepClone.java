package com.prowings.basics.deepcloning;

public class TestDeepClone {

	
	public static void main(String[] args)throws CloneNotSupportedException {
		
		Address add= new Address("PUNE","IND",123);
		
		Student s1=new Student(10,"RAM",add);
		System.out.println("Original(S1) = "+s1);
		
		Student s2=(Student)s1.clone();
		System.out.println("Cloned(S2) = "+s2);
		
		s1.add.city ="MUMBAI";
				
		System.out.println("Original(S1) after change= "+s1);
		System.out.println("Original(S2) after change= "+s2);
	
		System.out.println("S1 hashcode= "+s1.hashCode()+     "s1-address hashcode="+s1.add.hashCode());
		System.out.println("S2 hashcode= "+s2.hashCode()+     "s2-address hashcode="+s2.add.hashCode());
		
	}
}