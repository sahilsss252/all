package practice3;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class AdminDao {

	public List<Admin> check(String user,String pass){
		EntityManagerFactory emf=null;
		EntityManager em=null;
		try{
			emf=Persistence.createEntityManagerFactory("practice3");
			em=emf.createEntityManager();
			String q1="select a from Admin a where a.username = :username and a.password = :pass ";
			Query q=em.createQuery(q1);
			q.setParameter("username",user);
			q.setParameter("pass", pass);
			List<Admin> lst= q.getResultList();
			return lst;
		}
		finally{
			emf.close();
			em.close();
		}
	}
}
