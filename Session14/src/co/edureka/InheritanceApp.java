package co.edureka;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InheritanceApp {

	public static void main(String[] args) {
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
			
			
			CA ca = new CA();
			ca.setA(10);

			CB cb = new CB();
			cb.setA(100);
			cb.setB(200);
			
			CC cc = new CC();
			cc.setA(1000);
			cc.setB(2000);
			cc.setC(3000);
			
			session.save(ca);
			session.save(cb);
			session.save(cc);
			
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
