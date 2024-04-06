package com.springboot.pos.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CostResponseResults {
    private String code;
    private String name;
    private CostResponseCosts[] costs;
}
