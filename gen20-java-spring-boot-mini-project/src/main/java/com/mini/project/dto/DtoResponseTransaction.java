package com.mini.project.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.sql.Timestamp;
import java.time.ZonedDateTime;

@Data
@AllArgsConstructor
public class DtoResponseTransaction {
    private int total_pay;
    private int total_amount;
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd/MM/yyyy HH:mm:ss" )
    private ZonedDateTime transaction_date;


}
