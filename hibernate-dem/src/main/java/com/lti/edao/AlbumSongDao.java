package com.lti.edao;

import java.util.List;

import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.lti.entity.Album;
import com.lti.entity.Employee;
import com.lti.entity.Song;

public class AlbumSongDao extends GenericDao {
	
	public List<Album> fetchAlbumRealsedIn(int year){
		EntityManagerFactory emf=null;
		EntityManager em=null;
		
		try{
			emf=Persistence.createEntityManagerFactory("hibernate-dem");
			em=emf.createEntityManager();
			String q1="select a from Album a where extract (year from a.releaseDate)=:y";
			javax.persistence.Query q=em.createQuery(q1);
			q.setParameter("y",year);
			List <Album> lst=q.getResultList();
			return lst;
			
		}
		finally{
			emf.close();
			em.close();
		}
	}

	public List<Song> fetchbySinger(String string) {
		EntityManagerFactory emf=null;
		EntityManager em=null;
		
		try{
			emf=Persistence.createEntityManagerFactory("hibernate-dem");
			em=emf.createEntityManager();
			String q1="select a from Song a where a.artist=:nm ";
			javax.persistence.Query q=em.createQuery(q1);
			q.setParameter("nm",string);
			List <Song> lst=q.getResultList();
			return lst;
			
		}
		finally{
			emf.close();
			em.close();
		}
	}

	public List<Album> fetchAlbumbySinger(String string) {
		EntityManagerFactory emf=null;
		EntityManager em=null;
		
		try{
			emf=Persistence.createEntityManagerFactory("hibernate-dem");
			em=emf.createEntityManager();
			String q1="select a from Album a join a.song s where s.artist=:nm";
			javax.persistence.Query q=em.createQuery(q1);
			q.setParameter("nm",string);
			List <Album> lst=q.getResultList();
			return lst;
			
		}
		finally{
			emf.close();
			em.close();
		}
	}

	

}
