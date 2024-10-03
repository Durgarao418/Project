package com.example.project.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.model.Categories;
import com.example.project.service.Categorysrvc;
import com.example.project.serviceImpl.categoryImpl;

@RestController
public class fetchallcategories 
{
	@Autowired
	private Categorysrvc categories;
	
	
	@GetMapping("/fetchallcategories")
	public List<Categories> fetchallcategories()
	{
		return categories.fetchallCategories();
	}
	
	@PostMapping("/addcategory")
	public String addcategory(@RequestBody Categories category)
	{
		return categories.addCategory(category);
		
	}
	
	@DeleteMapping("admin/deleteCategory/{categoryId}")
	public String deleteCategories(@PathVariable Long categoryId)
	{
		return categories.deleteCategory(categoryId);
	}

}
