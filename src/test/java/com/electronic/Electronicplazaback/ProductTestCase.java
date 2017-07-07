package com.electronic.Electronicplazaback;

import static org.junit.Assert.*;




import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.electronic.Electronicplazaback.dao.CategoryDAO;
import com.electronic.Electronicplazaback.dao.ProductDAO;
import com.electronic.Electronicplazaback.model.Product;
import com.electronic.Electronicplazaback.model.Category;
public class ProductTestCase {
	@Autowired
	static ProductDAO productDao;
	@Autowired
	static CategoryDAO categoryDao; 

	static AnnotationConfigApplicationContext context;

	@BeforeClass
	public static void init(){
	 context= new AnnotationConfigApplicationContext();
		context.scan("com.electronic.Electronicplazaback");
		context.refresh();
		productDao = (ProductDAO) context.getBean("productDAO");
		categoryDao=(CategoryDAO)context.getBean("categoryDAO");
	}
	
	@Test
	public void addProduct()
	{
		Product prd=new Product();
		prd.setProdname("p1");
		prd.setProddesc("d1");
		prd.setPrice(234);
		prd.setQuantity(20);
		
		prd.setCat(categoryDao.getById(1));
		
			
		
		boolean result=productDao.insert(prd);
		assertEquals("done",true,result);
	} 
	/*@Test
	public void deleteProduct()
	{
		Product prd=new Product();
		
		prd.setProdid(6);
		boolean result=productDao.delete(prd);
		assertEquals("done",true,result);
	}*/
	 
	/*@Test
	public void updateProduct()
	{
		Product prd=new Product();
		prd=productDao.getById(5);
		prd.setName("p6");
		boolean result=productDao.update(prd);
		assertEquals("done",true,result);
	} */

}
