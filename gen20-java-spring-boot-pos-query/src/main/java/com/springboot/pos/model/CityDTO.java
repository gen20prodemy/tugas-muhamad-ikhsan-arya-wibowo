package com.springboot.pos.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CityDTO {
    private String provinceId;
    private String cityId;
    private String province;
    private String type;
    private String cityName;
    private String postalCode;
}
