package edu.monmouth.person;
/**
   A person is represented by the name and a birth year.
   You must enter the class name, instance variable(s), and constructor below
*/
class Person1 {
	public String name;
	public double birthYear;
	
	public Person1(String name, double birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}


/**
      Returns the string representation of the object.
      @return a string representation of the object
*/
   public String toString()
   {
      return "Person[name=" + name + ",birthYear=" + birthYear + "]";
   }
}