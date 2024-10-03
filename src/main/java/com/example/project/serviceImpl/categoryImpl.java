package com.example.project.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.Repository.CategoryRepository;
import com.example.project.model.Categories;
import com.example.project.service.Categorysrvc;

@Service
public class categoryImpl implements Categorysrvc{

	@Autowired
	private CategoryRepository categoryrepository;
	
	@Override
	public List<Categories> fetchallCategories() 
	{
		
		return categoryrepository.findAll();
	}


	@Override
	public String addCategory(Categories categories) 
	{
		categoryrepository.save(categories);
		return "Category Added Succesfully";
	}


	@Override
	public String deleteCategory(Long categoryId) 
	{
		
		categoryrepository.deleteById(categoryId);
		 return "Category Deleted: " + categoryId;
    }


	


	

}
