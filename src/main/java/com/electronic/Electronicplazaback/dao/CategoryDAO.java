
package com.electronic.Electronicplazaback.dao;

import java.util.List;

import com.electronic.Electronicplazaback.model.Category;

public interface CategoryDAO {
	public boolean insert(Category cat);

	public Category getById(int id);

	public boolean update(Category cat);
	public boolean delete(Category cat);
	public List<Category> getAll();
}