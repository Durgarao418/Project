package com.example.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project.model.Categories;

public interface CategoryRepository extends JpaRepository<Categories, Long>{

}
