 package com.electronic.Electronicplazaback.daoimpl;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.electronic.Electronicplazaback.dao.CartDAO;
import com.electronic.Electronicplazaback.model.Cart;

@Repository("cartDAO")
@Transactional
public class CartDaoImpl implements CartDAO {
	@Autowired
	public SessionFactory sessionFactory;

	public void addToCart(Cart cartitem) {
		
			sessionFactory.getCurrentSession().saveOrUpdate(cartitem);
			
	}

	public Cart getById(int id) {
		Session session=sessionFactory.openSession();
		Cart cart=(Cart)sessionFactory.getCurrentSession().get(Cart.class, id);
	    return cart;
	}

	public void update(Cart cart) {
		sessionFactory.getCurrentSession().update(cart);
	}
	public void delete(Cart cart) {
		sessionFactory.getCurrentSession().delete(cart);
		
	}
	public List<Cart> getAll(String username) {
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from Cart where username=:username");
		query.setParameter("username",username);
		//@SuppressWarnings("unchecked");
		List<Cart> list=query.list();
		return list;
	}

}