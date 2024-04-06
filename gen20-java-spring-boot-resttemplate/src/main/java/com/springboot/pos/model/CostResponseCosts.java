package com.springboot.pos.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CostResponseCosts {
    private String service;
    private String desc;
    private CostResponseCost[] cost;

}
