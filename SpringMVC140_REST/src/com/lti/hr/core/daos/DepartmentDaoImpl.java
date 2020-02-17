package com.lti.hr.core.daos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.hr.core.entities.Department;
import com.lti.hr.core.exception.HrException;


@Repository
public class DepartmentDaoImpl implements DepartmentDao {
	
	@PersistenceContext
	private EntityManager manager;
	
	@Override
	public ArrayList<Department> getDeptList() throws  HrException{
		// TODO Auto-generated method stub
		String strQry = "from Department";
		Query q = manager.createQuery(strQry);
		List<Department> list = q.getResultList();
		return (ArrayList<Department>) list;
	}

	@Transactional(propagation = Propagation.REQUIRED)//REQUIRED ==> it is used to carry out the same transaction started in the service layer
	@Override
	public boolean insertDept(Department d) throws HrException {
		// TODO Auto-generated method stub
	    manager.persist(d);
		return true;
	}

	@Override
	public Department fetchDeptList(int d) throws HrException {
		// TODO Auto-generated method stub
		
	Department d2=	manager.find(Department.class, d);
		return d2  ;
	}

}
