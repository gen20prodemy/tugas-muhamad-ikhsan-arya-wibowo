package com.mini.project.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class DtoResponseTransactionDetails {
    private int transaction_id;
    private int product_id;
    private String product_name;
    private int quantity;
    private int sub_total;
}
