package com.mini.project.repository;

import com.mini.project.entity.TransactionDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoTransactionDetails extends JpaRepository<TransactionDetails, Integer> {

}
