package week5;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity   //this tag is used to identify the student class as an Entity in the database
@Table(name = "Department") //define the table we want to use

public class Department {
	
	@Id						//defining the ID tag for the columns
	@Column(name = "idDepartment")	 
	int idDepartment;					

	@Column(name="title")  //here we define each column that corresponds to the fields of table
	String title;	
	
	ArrayList<Student> students = new ArrayList<Student>();
	
	public Department() {
		
	}
	
	public Department(int idDepartment, String title) {
		this.idDepartment = idDepartment;
		this.title = title;
	}
	
	public void addStudent(Student student) {
		students.add(student);
	}
	
	
}
