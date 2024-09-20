package com.cjc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<Student> l=new ArrayList<Student>();
		Student s=new Student();
		s.setRollno(1);
		s.setName("pqr");
		s.setMarks(65.55);
		
		Student s1=new Student();
		s1.setRollno(2);
		s1.setName("abc");
		s1.setMarks(75.55);
		
		
		
		l.add(s);
		l.add(s1);
		
	    Iterator<Student> itr=l.iterator();
	    while(itr.hasNext()) {
	    	Student stu=itr.next();
	    	
	    	System.out.println(stu.getMarks());
	    	System.out.println(stu.getName());
	    	System.out.println(stu.getRollno());
	    
	    }
	    		
	        
	    		
		
		
	}

}