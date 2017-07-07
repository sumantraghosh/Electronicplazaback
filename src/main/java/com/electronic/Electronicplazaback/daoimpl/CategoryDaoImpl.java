package com.electronic.Electronicplazaback.daoimpl;

import java.util.List;





import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.electronic.Electronicplazaback.dao.CategoryDAO;
import com.electronic.Electronicplazaback.model.Category;

@Repository("categoryDAO")
@Transactional
public class CategoryDaoImpl implements CategoryDAO {
	@Autowired
	public SessionFactory sessionFactory;

	public boolean insert(Category cat) {
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(cat);
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}

	}

	public Category getById(int id) {
		return (Category) sessionFactory.getCurrentSession().get(Category.class, id);
	}

	public boolean update(Category cat) {
		try {
			sessionFactory.getCurrentSession().update(cat);
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}
	public boolean delete(Category cat) {
		try {
			sessionFactory.getCurrentSession().delete(cat);
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}
	public List<Category> getAll() {
		return sessionFactory.getCurrentSession().createQuery("from Category").list();
	}

}
