package com.springboot.pos.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.springboot.pos.model.CityDTO;
import com.springboot.pos.model.CostQueryDTO;
import com.springboot.pos.model.CostResponseResults;
import com.springboot.pos.model.ProvinceDTO;
import com.springboot.pos.service.RajaOngkirService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ongkir")
public class RajaOngkirController {

    @Autowired
    RajaOngkirService rajaOngkirService;

    @GetMapping("province")
//    @Scheduled(cron = "*/10 * * * * *")
    public List<ProvinceDTO> getProvince(){
        return rajaOngkirService.getProvince();
    }

    @GetMapping("city")
    public List<CityDTO> getCity(){
        return rajaOngkirService.getCity();
    }

    @PostMapping
    public List<CostResponseResults> getOngkir(@RequestBody CostQueryDTO query) throws JsonProcessingException {
        return rajaOngkirService.getOngkir(query);
    }

}
