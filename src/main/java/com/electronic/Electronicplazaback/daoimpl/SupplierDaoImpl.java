
package com.electronic.Electronicplazaback.daoimpl;

import java.util.List;



import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.electronic.Electronicplazaback.dao.SupplierDAO;
import com.electronic.Electronicplazaback.model.Supplier;

@Repository("supplierDAO")
@Transactional
public class SupplierDaoImpl implements SupplierDAO {
	@Autowired
	public SessionFactory sessionFactory;

	public boolean insert(Supplier supp) {
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(supp);
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}

	}

	public Supplier getById(int id) {
		return (Supplier) sessionFactory.getCurrentSession().get(Supplier.class, id);
	}

	public boolean update(Supplier supp) {
		try {
			sessionFactory.getCurrentSession().update(supp);
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}
	public boolean delete(Supplier supp) {
		try {
			sessionFactory.getCurrentSession().delete(supp);
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}
	public List<Supplier> getAll() {
		return sessionFactory.getCurrentSession().createQuery("from Supplier").list();
	}

}
