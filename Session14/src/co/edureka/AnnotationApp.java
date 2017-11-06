package co.edureka;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class AnnotationApp {

	public static void main(String[] args) {
		
		Manager m1 = new Manager(0,"Bob","bob@example.com");
		Manager m2 = new Manager(0,"George","george@example.com");
		
		AnnotationConfiguration config = null;
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		
		try {
			
			config = new AnnotationConfiguration();
			config.configure(); // Parses the hibernate.cfg.xml file and constructs java objects
			
			factory = config.buildSessionFactory();
			
			session = factory.openSession(); // Constructing connection with DB
			
			transaction = session.beginTransaction(); // Let the DB operation happen as in a transaction
			
			
//			session.save(m1);
//			session.save(m2);
			
			for(int i=1;i<=100;i++){
				Manager m = new Manager(0,"Manager:"+i,"manager"+i+"@example.com");
				session.save(m);
			}
			

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
