package com.lti.edao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.lti.entity.Address;
import com.lti.entity.Customer;
import com.lti.entity.Employee;

public class CutomerAddressDao {

	public void add(Customer customer){
		//we will take help of ORM (hibernate) to inset data into db
		//Step 1:Create /Load EntityManagerFactory object
		//During this  step, META-INF/persistece.xml file will be read
		//Please check the <persistence-unit  name="?" > and mention the same below
		
		EntityManagerFactory emf=null;
		EntityManager em=null;
		
		//step 3: Begin and participate in transaction
		try{
			 emf=Persistence.createEntityManagerFactory("hibernate-dem");
			
			//Step 2:Create / Load Entity Manager Object
			 em=emf.createEntityManager();
			 EntityTransaction tx=em.getTransaction();
			 tx.begin();
			
			//Now we can perform any sql operation(Insert/update /delete/ select)
			em.persist(customer); //persist method generate insert query
	
			tx.commit();
			//should be in finally block
		}
		finally{
			em.close();
			emf.close();
		}
	}

	public void addAddr(Address address) {
		EntityManagerFactory emf=null;
		EntityManager em=null;
		
		//step 3: Begin and participate in transaction
		try{
			 emf=Persistence.createEntityManagerFactory("hibernate-dem");
			
			//Step 2:Create / Load Entity Manager Object
			 em=emf.createEntityManager();
			 EntityTransaction tx=em.getTransaction();
			 tx.begin();
			
			//Now we can perform any sql operation(Insert/update /delete/ select)
			em.persist(address); //persist method generate insert query
			
			tx.commit();
			//should be in finally block
		}
		finally{
			em.close();
			emf.close();
		}		
	}

	public Customer fetch(int i) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("hibernate-dem");
		EntityManager em=emf.createEntityManager();
		
		//find method is commonly used to fetch data from based on priomary key
		//find method will generate select * from TBL_EMP where pk_col=?
	   Customer emp=em.find(Customer.class, i);
		return emp;
	}

	public void updateCust(Customer c) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=null;
		EntityManager em=null;
		
		//step 3: Begin and participate in transaction
		try{
			 emf=Persistence.createEntityManagerFactory("hibernate-dem");
			
			//Step 2:Create / Load Entity Manager Object
			 em=emf.createEntityManager();
			 EntityTransaction tx=em.getTransaction();
			 tx.begin();
			
			//Now we can perform any sql operation(Insert/update /delete/ select)
			em.merge(c); //persist method generate insert query
			
			tx.commit();
			//should be in finally block
		}
		finally{
			em.close();
			emf.close();
		}	
	}
	public List<Customer> fetchbyEmail(String smail) {
		EntityManagerFactory emf=null;
		EntityManager em=null;
		try{
		emf=Persistence.createEntityManagerFactory("hibernate-dem");
		 em=emf.createEntityManager();
		
		//find method is commonly used to fetch data from based on priomary key
		//find method will generate select * from TBL_EMP where pk_col=?
		String ql="select e from Customer e where e.email like :mail";
		Query q=em.createQuery(ql);
		q.setParameter("mail","%@"+smail+"%");
		List <Customer> lst=q.getResultList();
		return lst;
		
		}
		finally{
			em.close();
			emf.close();
			
		}	
	}
	public List<Customer> fetchDataByCity(String scity) {
		EntityManagerFactory emf=null;
		EntityManager em=null;
		try{
		emf=Persistence.createEntityManagerFactory("hibernate-dem");
		 em=emf.createEntityManager();
		
		//find method is commonly used to fetch data from based on priomary key
		//find method will generate select * from TBL_EMP where pk_col=?
		String ql="select c from Customer c join c.address a where a.city=:city";
		Query q=em.createQuery(ql);
		q.setParameter("city",scity);
		List <Customer> lst=q.getResultList();
		return lst;
		
		}
		finally{
			em.close();
			emf.close();
			
		}	
	}

	
}
