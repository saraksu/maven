package week5;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity   //this tag is used to identify the student class as an Entity in the database
@Table(name = "students") //define the table we want to use
public class Student {

@Id						//defining the ID tag for the columns
@Column(name = "idStudent")	 
int idStudent;					

@Column(name="name")  //here we define each column that corresponds to the fields of table
String name;		   //in the database

@Column(name="surname")
String surname;

@OneToOne
@JoinColumn(name="idAccount")
Account account;



public Student() {
	
}

public Student(int idStudent, String name, String surname) {
super();
this.idStudent = idStudent;
this.name = name;
this.surname = surname;
}  //creating student entity or object


public int getId() {
	return idStudent;
}


public void setId(int idStudent) {
	this.idStudent = idStudent;
}


public String getFirstName() {
	return name;
}


public void setFirstName(String name) {
	this.name = name;
}


public String getLastName() {
	return surname;
}


public void setLastName(String surname) {
	this.surname = surname;
}

public void setAccount(Account account) {
	this.account = account;
}

public Account getAccount(String surname) {
 return account;	
}


}
