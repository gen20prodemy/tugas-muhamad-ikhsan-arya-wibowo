package com.springboot.pos.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CostQueryDTO {
    private String origin;
    private String destination;
    private int weight;
    private String courier;
}
