package com.electronic.Electronicplazaback.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.electronic.Electronicplazaback.dao.ProductDAO;
import com.electronic.Electronicplazaback.model.Product;

@Repository("productDAO")
@Transactional
public class ProductDaoImpl implements ProductDAO {
	@Autowired
	public SessionFactory sessionFactory;

	public boolean insert(Product product) {
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(product);
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}

	}

	public Product getById(int id) {
		return (Product) sessionFactory.getCurrentSession().get(Product.class, id);
	}

	public boolean update(Product product) {
		try {
			sessionFactory.getCurrentSession().update(product);
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}
	public boolean delete(Product product) {
		try {
			sessionFactory.getCurrentSession().delete(product);
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}
	public List<Product> getAll() {
		return sessionFactory.getCurrentSession().createQuery("from Product").list();
	}

}
