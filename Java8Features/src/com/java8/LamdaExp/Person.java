package com.java8.LamdaExp;

public class Person implements Comparable<Person> {
	
	private String fName;
	private String lName;
	private int age;
	
	public Person(String fName, String lName, int age) {
		this.fName = fName;
		this.lName = lName;
		this.age = age;
	}
		
	@Override
	public String toString() {
		return "Person [fName=" + fName + ", lName=" + lName + ", age=" + age + "]";
	}

	@Override
	public boolean equals(Object obj) {
	    if(obj instanceof Person)
	    {
	        Person temp = (Person) obj;
	        if(this.getfName() == temp.getfName() && this.getlName()== temp.getlName() && this.getAge() == temp.getAge())
	            return true;
	    }
	    return false;

	}
	@Override
	public int hashCode() {
	    return (this.getfName().hashCode() + this.getlName().hashCode());        
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(Person arg0) {
		return this.fName.compareTo(arg0.fName);
	}
	

}
