package com.springboot.pos.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.springboot.pos.model.CityDTO;
import com.springboot.pos.model.CostQueryDTO;
import com.springboot.pos.model.CostResponseResults;
import com.springboot.pos.model.ProvinceDTO;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Service
public class RajaOngkirService {

    @Autowired
    RestTemplate restTemplate;


    public HttpHeaders getHttpHeaders(){
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("key", "4551593df42456ecb1dc9d4794f46b79");
        return headers;
    }

    @Async
    public List<ProvinceDTO> getProvince() {


        HttpEntity<String> http = new HttpEntity<>(getHttpHeaders());

        val response = restTemplate.exchange(
                "https://api.rajaongkir.com/starter/province",
                HttpMethod.GET,
                http,
                new ParameterizedTypeReference<Map<String, Object>>() {
                }
        ).getBody();
        Map<String, Object> mapper = (Map<String, Object>) response.get("rajaongkir");
        List<Map<String, String>> results = (List<Map<String, String>>) mapper.get("results");

        List<ProvinceDTO> provinceList = new ArrayList<>();
        for (Map<String,String> data : results){
            provinceList.add(new ProvinceDTO(data.get("province_id"), data.get("province")));
        }
        System.out.println(results);
        return provinceList;
    }

    public List<CityDTO> getCity() {
        HttpEntity<String> http = new HttpEntity<>(getHttpHeaders());

        val response = restTemplate.exchange(
                "https://api.rajaongkir.com/starter/city",
                HttpMethod.GET,
                http,
                new ParameterizedTypeReference<Map<String, Object>>() {
                }
        ).getBody();
        Map<String, Object> rajaongkir = (Map<String, Object>) response.get("rajaongkir");
        List<Map<String, String>> results = (List<Map<String, String>>) rajaongkir.get("results");

        List<CityDTO> cityList = new ArrayList<>();
        for (Map<String,String> data : results){
            cityList.add(new CityDTO(data.get("province_id"), data.get("city_id"), data.get("province"), data.get("type"), data.get("city_name"), data.get("postal_code")));
        }
        return cityList;
    }

    public List<CostResponseResults> getOngkir (CostQueryDTO query) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        String request = mapper.writeValueAsString(query);
        getHttpHeaders().setContentLength(request.length());

        HttpEntity<String> http = new HttpEntity<>(request, getHttpHeaders());

        val response = restTemplate.exchange(
                "https://api.rajaongkir.com/starter/cost",
                HttpMethod.POST,
                http,
                new ParameterizedTypeReference<Map<String, Object>>() {
                }
        ).getBody();

        Map<String, Object> rajaongkir = (Map<String, Object>) response.get("rajaongkir");
        List<CostResponseResults> results = (List<CostResponseResults>) rajaongkir.get("results");

        return results;
    }



}
