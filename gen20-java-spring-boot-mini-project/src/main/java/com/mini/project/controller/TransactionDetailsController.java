package com.mini.project.controller;

import com.mini.project.dto.DtoResponseTransactionDetails;
import com.mini.project.entity.Product;
import com.mini.project.entity.TransactionDetails;
import com.mini.project.service.ServiceTransactionDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("pos/api/transactiondetails")
public class TransactionDetailsController {
    private final ServiceTransactionDetails details;
    @Autowired
    public TransactionDetailsController(ServiceTransactionDetails details) {
        this.details = details;
    }

    @GetMapping
    public ResponseEntity<List<DtoResponseTransactionDetails>> getAllDetails(){
        return details.getAllDetails();
    }

    @GetMapping("{id}")
    public ResponseEntity getDetailsById(@PathVariable("id")String id){
        return details.getDetailsById(id);
    }
}
