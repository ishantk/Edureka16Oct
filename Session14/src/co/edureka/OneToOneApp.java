package co.edureka;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToOneApp {

	public static void main(String[] args) {
		
		Person pRef = new Person();
		pRef.setName("Harry");
		pRef.setEmail("harry@example.com");
		
		Address aRef = new Address();
		aRef.setAdrsLine("Country Homes");
		aRef.setCity("Bengaluru");
		aRef.setState("Karnataka");
		aRef.setZipCode(520001);
			
		pRef.setAddress(aRef);
		aRef.setPerson(pRef);
		
		Configuration config = null;
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		
		try {
			
			config = new Configuration();
			config.configure(); // Parses the hibernate.cfg.xml file and constructs java objects
			
			factory = config.buildSessionFactory();
			
			session = factory.openSession(); // Constructing connection with DB
			
			transaction = session.beginTransaction(); // Let the DB operation happen as in a transaction
			
			session.save(pRef);

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
