
package com.electronic.Electronicplazaback;
/*package com.Arnab.Backend;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Arnab.Backend.Dao.CategoryDAO;
import com.Arnab.Backend.model.Category;

public class CategoryTestCase 
{
	public static void main(String arg[])
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		
		context.scan("com.Arnab.Backend");
		
		context.refresh();
		
		// Inserting a Category Object.
		CategoryDAO categoryDAO=(CategoryDAO)c ontext.getBean("CategoryDAO");
		
		//Insertion TestCase
		
		Category category=new Category();
		
		category.setCatname("WIFIMobile");
		category.setCatdesc("This Mobile is WIFI Enabled. You can Enjoy Internet");

		categoryDAO.insertUpdateCategory(category);		
		System.out.println("Category Inserted"); 
		
		//Retrieval TestCase
		
		Category category=categoryDAO.getCategory(1);
		System.out.println("Category Name:"+category.getCatname());
		System.out.println("Category Description:"+category.getCatdesc());
		
		//Deletion TestCase
		Category category=categoryDAO.getCategory(1);
		categoryDAO.deleteCategory(category);
		System.out.println("The Category Deleted");
		
		//Retrieving the Data
		
		List<Category> list=categoryDAO.getCategoryDetails();
		
		for(Category category:list)
		{
			System.out.println(category.getCatid()+":"+category.getCatname()+":"+category.getCatdesc());
		}
		
		//Update the Category
		Category category=categoryDAO.getCategory(3);
		category.setCatname("WifiEnMobile");
		categoryDAO.insertUpdateCategory(category);
		System.out.println("The Category Updated");
		
	}
}
*/