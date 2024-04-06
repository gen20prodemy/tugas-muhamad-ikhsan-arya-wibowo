package com.springboot.pos.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CostResponseCost {
    private int value;
    private String etd;
    private String note;
}
