package com.lti.edao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.lti.entity.Customer;
import com.lti.entity.Employee;

public class EmployeeDao {

	public void add(Employee e){
		//we will take help of ORM (hibernate) to inset data into db
		//Step 1:Create /Load EntityManagerFactory object
		//During this  step, META-INF/persistece.xml file will be read
		//Please check the <persistence-unit  name="?" > and mention the same below
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("hibernate-dem");
		
		//Step 2:Create / Load Entity Manager Object
		EntityManager em=emf.createEntityManager();
		
		//step 3: Begin and participate in transaction
		EntityTransaction tx=em.getTransaction();
		tx.begin();
		
		//Now we can perform any sql operation(Insert/update /delete/ select)
		em.persist(e); //persist method generate insert query

		tx.commit();
		//should be in finally block
		
		em.close();
		emf.close();
	}
	public Employee fetch(int psno){
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("hibernate-dem");
		EntityManager em=emf.createEntityManager();
		
		//find method is commonly used to fetch data from based on priomary key
		//find method will generate select * from TBL_EMP where pk_col=?
		Employee emp=em.find(Employee.class, psno);
		System.out.println(emp.getName());
		System.out.println(emp.getDateOfJoining());
		System.out.println(emp.getSalary());
		return emp;
	}
	public void add(Customer c){
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("hibernate-dem");
		EntityManager em=emf.createEntityManager();
		EntityTransaction tx=em.getTransaction();
		tx.begin();
		em.persist(c);
		tx.commit();
		em.close();
		emf.close();
		
	}
	public List<Employee> fetchByyear(int y){
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("hibernate-dem");
		EntityManager em=emf.createEntityManager();
		String ql="select e from Employee e where extract (year from e.dateOfJoining) = :month";
		Query q=em.createQuery(ql);
		q.setParameter("month",y);
		List <Employee> lst=q.getResultList();
		return lst;
		
		
	
	}
	public List<Employee> fetchBymonth(int mon){
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("hibernate-dem");
		EntityManager em=emf.createEntityManager();
		String ql="select e from Employee e where extract (month from e.dateOfJoining) = :month";
		Query q=em.createQuery(ql);
		q.setParameter("month",mon);
		List <Employee> lst=q.getResultList();
		return lst;
		
		
	
	}
	
	public List<Employee> fetchBySalary(double salary){
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("hibernate-dem");
		EntityManager em=emf.createEntityManager();
		
		String ql="select e from Employee e where e.salary >= :sal";
		Query q=em.createQuery(ql);
		q.setParameter("sal",salary);
		
		List <Employee> lst=q.getResultList();
		
		em.close();
		emf.close();
		
		
		return lst;
		
	}
}


