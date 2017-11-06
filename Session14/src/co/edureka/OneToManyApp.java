package co.edureka;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToManyApp {

	public static void main(String[] args) {
		
		Certificate c1 = new Certificate();
		c1.setName("AWS");
		
		Certificate c2 = new Certificate();
		c2.setName("CCNA");
		
		Certificate c3 = new Certificate();
		c3.setName("OCJP");
		
		Certificate c4 = new Certificate();
		c4.setName("OCWD");
		
		Certificate c5 = new Certificate();
		c5.setName("CCNP");
		
		List<Certificate> cList1 = new ArrayList<>();
		List<Certificate> cList2 = new ArrayList<>();
		
		cList1.add(c1); //0
		cList1.add(c2); //1
		cList1.add(c3); //2
		
		cList2.add(c4); //0
		cList2.add(c5); //1

		Teacher t1 = new Teacher();
		Teacher t2 = new Teacher();
		
		t1.setName("John");
		t1.setCertiList(cList1);

		t2.setName("Jennie");
		t2.setCertiList(cList2);
		
		
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
			
			session.save(t1);
			session.save(t2);
			
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
