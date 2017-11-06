package co.edureka;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class App {

	public static void main(String[] args) {
		
		/*Employee emp1 = new Employee();
		emp1.setEid(0);
		emp1.setName("Jack");
		emp1.setAge(30);
		emp1.setSalary(45000);
		emp1.setEmail("jack@example.com");
		
		Employee emp2 = new Employee(0, "Jim", "jim@example.com", 29, 67000);
		
		System.out.println("emp1 is: "+emp1);
		System.out.println("emp2 is: "+emp2);*/
		
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
			//session.save(emp1);
			//session.save(emp2);
			
			// Retrieve Selected (Retrieve one record)
			Employee eRef1 = (Employee)session.get(Employee.class, 3);
			System.out.println(eRef1);
			
			Employee eRef2 = (Employee)session.get(Employee.class, 3);
			System.out.println(eRef2);
			
			// Update
			//eRef.setName("Jack JJ");
			//eRef.setAge(45);
			
			//session.update(eRef);
			
			// Delete
			//Employee e = new Employee();
			//e.eid = 1;
			
			//session.delete(e);
			
			
			// Retrieve All
			//1. HQL | Hibernate Query Language
			/*String hql = "From Employee"; // eqv to select * from Employee
			//String hql = "From Employee where eid > 2";
			
			List<Employee> empList =  session.createQuery(hql).list();
			for(Employee e : empList){
				System.out.println(e);
			}
			
			//session.createSQLQuery(sql) | SQL Commands can also be entertained
			*/
			
			//2. Criteria -> API based retrieval
			/*Criteria criteria = session.createCriteria(Employee.class);
			criteria.add(Restrictions.gt("eid", 2));
			
			List<Employee> empList =  criteria.list();
			for(Employee e : empList){
				System.out.println(e);
			}*/
			
			
			transaction.commit();
			System.out.println("Hibernate Operation Finished..");
		} catch (Exception e) {
			transaction.rollback();
			System.out.println("Some Exception: "+e);
			e.printStackTrace();
		}finally {
			session.close();
			factory.close();
		}
		
	}

}
