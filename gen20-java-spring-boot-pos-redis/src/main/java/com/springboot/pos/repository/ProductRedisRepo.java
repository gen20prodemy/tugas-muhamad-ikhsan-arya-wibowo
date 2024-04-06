package com.springboot.pos.repository;

import com.springboot.pos.model.ProductRedisDTO;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductRedisRepo {
    public static final String HASH_KEY = "Product";

    private final RedisTemplate template;

    public ProductRedisRepo(RedisTemplate template) {
        this.template = template;
    }


    public ProductRedisDTO save(ProductRedisDTO product){
        template.opsForHash().put(HASH_KEY, product.getId(), product);
        return product;
    }

    public List<ProductRedisDTO> findAll(){
        return template.opsForHash().values(HASH_KEY);
    }

    public ProductRedisDTO findById(int id){
        return (ProductRedisDTO) template.opsForHash().get(HASH_KEY, id);
    }

    public String delete(int id){
        template.opsForHash().delete(HASH_KEY, id);
        return "product removed";
    }
}
