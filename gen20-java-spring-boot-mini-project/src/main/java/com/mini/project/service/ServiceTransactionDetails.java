package com.mini.project.service;

import com.mini.project.dto.DtoResponseTransaction;
import com.mini.project.dto.DtoResponseTransactionDetails;
import com.mini.project.entity.Product;
import com.mini.project.entity.TransactionDetails;
import com.mini.project.entity.Transactions;
import com.mini.project.repository.RepoTransactionDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ServiceTransactionDetails {

    private final RepoTransactionDetails repoTransactionDetails;

    @Autowired
    public ServiceTransactionDetails(RepoTransactionDetails repoTransactionDetails) {
        this.repoTransactionDetails = repoTransactionDetails;
    }

    public ResponseEntity<List<DtoResponseTransactionDetails>> getAllDetails(){
        List<TransactionDetails> detailsList = repoTransactionDetails.findAll();
        return ResponseEntity.ok().body(detailsList.stream().map(this::convertToDto).toList());
    }

    public ResponseEntity getDetailsById(String id){
        Optional<TransactionDetails> detailsOptional = repoTransactionDetails.findById(Integer.valueOf(id));
        if (detailsOptional.isPresent()){
            return ResponseEntity.ok().body(detailsOptional.map(this::convertToDto));
        }
        return ResponseEntity.ofNullable("[]");
    }

    public DtoResponseTransactionDetails convertToDto(TransactionDetails details){
        return new DtoResponseTransactionDetails(details.getTransactions().getId(), details.getProduct().getId(),
                details.getProduct().getTitle(), details.getQuantity(), details.getSubtotal());
    }

    private int transaction_id;
    private int product_id;
    private String product_name;
    private int quantity;
    private int sub_total;
}
