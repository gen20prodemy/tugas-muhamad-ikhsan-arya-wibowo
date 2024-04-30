package com.mini.project.service;

import com.mini.project.dto.DtoCategory;
import com.mini.project.entity.Category;
import com.mini.project.repository.RepoCategory;
import com.mini.project.response.GlobalResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceCategory {
    private final RepoCategory repoCategory;

    @Autowired
    public ServiceCategory(RepoCategory repoCategory){
        this.repoCategory = repoCategory;
    }

    public List<Category> getAll(){
        return repoCategory.findAll();
    }

    public GlobalResponse addNewCategory(DtoCategory category){
        repoCategory.save(category.dtoToEntity());
        return new GlobalResponse("ok", "success");

    }
}
