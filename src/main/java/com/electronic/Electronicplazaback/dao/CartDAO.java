package com.electronic.Electronicplazaback.dao;

import java.util.List;

import com.electronic.Electronicplazaback.model.Cart;


public interface CartDAO {
	public void addToCart(Cart cartitem);

	public Cart getById(int id);

	public void update(Cart cart);
	public void delete(Cart cart);
	public List<Cart> getAll(String username);
	
	
}
