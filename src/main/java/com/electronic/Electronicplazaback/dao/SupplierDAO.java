package com.electronic.Electronicplazaback.dao;

import java.util.List;

import com.electronic.Electronicplazaback.model.Supplier;

public interface SupplierDAO {
	public boolean insert(Supplier supp);

	public Supplier getById(int id);

	public boolean update(Supplier supp);
	public boolean delete(Supplier supp);
	public List<Supplier> getAll();
}
