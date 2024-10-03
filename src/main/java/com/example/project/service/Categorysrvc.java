package com.example.project.service;

import java.util.List;

import com.example.project.model.Categories;

public interface Categorysrvc 
{
	public List<Categories> fetchallCategories();
	
	public String addCategory(Categories categories);
	
	public String deleteCategory(Long categoryId);

}
