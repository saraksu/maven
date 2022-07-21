package week5;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class Main {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.addAnnotatedClass(Account.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		
		try {
		Account acc1 = new Account(1, "acc1");
		Student stud1 = new Student(1, "jack", "marston");
		stud1.setAccount(acc1);
		
		session.beginTransaction();
		session.saveOrUpdate(stud1);
		session.save(acc1);
		
		session.getTransaction().commit();
		
		}finally {
			factory.close();
		}
	}
	
	
}
