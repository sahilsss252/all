package com.lti.edao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.lti.entity.Customer;

public class GenericDao {

	public void save(Object obj){
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
			em.merge(obj); //persist method generate insert query and merge method used for insert and update
	
			tx.commit();
			//should be in finally block
		}
		finally{
			em.close();
			emf.close();
		}
	}
	
	
	//public <E> E fetchByPK(Class<E> clazz,Object pk)// this is same as below method but it returns object of perticular table 
	//public Object fetchByPk(Class clazz,Object pk)
	
	public <E> E fetchByPK(Class<E> clazz,Object pk){
		EntityManagerFactory emf=null;
		EntityManager em=null;
		try{
		emf=Persistence.createEntityManagerFactory("hibernate-dem");
		em=emf.createEntityManager();
		
		//find method is commonly used to fetch data from based on priomary key
		//find method will generate select * from TBL_EMP where pk_col=?
	   
		//Object obj= em.find(clazz, pk);
		//For above line we can write 
		E e=em.find(clazz,pk);
		return e;
		//return obj;
	}
		finally{
			}
		}

}
