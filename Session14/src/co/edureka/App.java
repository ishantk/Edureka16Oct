package co.edureka;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		emp1.setEid(1);
		emp1.setName("John");
		emp1.setAge(30);
		emp1.setSalary(50000);
		emp1.setEmail("john@example.com");
		
		Employee emp2 = new Employee(2, "Fionna", "fionna@example.com", 29, 60000);
		
		System.out.println("emp1 is: "+emp1);
		System.out.println("emp2 is: "+emp2);
		
		// Data in Objects is temporary. We must persist it.
		// 1. JDBC Code - Its gonna take time !!
		// 2. Hibernate Code - Quick Set Up

		Configuration cfg = null;
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		
		try {
			
			cfg = new Configuration();
			cfg.configure(); // Parses the hibernate.cfg.xml file and constructs java objects
			
			factory = cfg.buildSessionFactory();
			
			session = factory.openSession(); // Constructing connection with DB
			
			transaction = session.beginTransaction(); // Let the DB operation happen as in a transaction
			
			// Insert Operation
			session.save(emp1);
			session.save(emp2);
			
			transaction.commit();
			System.out.println("Hibernate Operation Finished..");
		} catch (Exception e) {
			transaction.rollback();
			System.out.println("Some Exception: "+e);
			e.printStackTrace();
		}finally {
			session.close();
		}
		
	}

}
