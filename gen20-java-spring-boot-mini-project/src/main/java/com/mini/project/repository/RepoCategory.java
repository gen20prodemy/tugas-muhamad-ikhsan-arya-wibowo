package com.mini.project.repository;

import com.mini.project.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoCategory extends JpaRepository<Category, Integer> {
}
