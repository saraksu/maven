package week5;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity   //this tag is used to identify the student class as an Entity in the database
@Table(name = "Account")
public class Account {

	@Id						//defining the ID tag for the columns
	@Column(name = "idAccount")	 
	int idAccount;					

	@Column(name="account_title")  //here we define each column that corresponds to the fields of table
	String account_title;
	
	@OneToOne(mappedBy = "account")
	Student student;
	
	public Account() {
		
	}
	
	public Account(int idAccount, String account_title) {
		super();
		this.idAccount = idAccount;
		this.account_title = account_title;

		}  //creating student entity or object


	public int getIdAccount() {
		return idAccount;
	}


	public void setIdAccount(int idAccount) {
		this.idAccount = idAccount;
	}


	public String getAccount_title() {
		return account_title;
	}


	public void setAccount_title(String account_title) {
		this.account_title = account_title;
	}
	
	public Student getStudent() {
		return student;
	}


	public void setStudent(Student student) {
		this.student = student;
	}
	
	
	
	
}
