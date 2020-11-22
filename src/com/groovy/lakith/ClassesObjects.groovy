package com.groovy.lakith

class Patient {
	def firstName, Lastname, age
	static hospitalCode = 'Best Hospital'
	
	void setFirstName(firstName) {
		if(firstName == null) {
			throw new IllegalArgumentException("Last name cannot be null")
		}
		this.firstName = firstName;
	}
	
	static void display() {
		println hospitalCode
	}
}

patient = new Patient(firstName: 'lakith', lastname:'muthugala', age: 25)

println 'First Name - ' + patient.firstName + '\nLast Name - ' + patient.lastname + '\nAge - ' + patient.age;

Patient.display()
