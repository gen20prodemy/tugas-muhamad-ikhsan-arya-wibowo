package com.springboot.pos.service;

import com.springboot.pos.entity.Product;
import com.springboot.pos.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;

@Service
public class AsyncService {

    private final ProductRepository productRepository;

    public AsyncService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Async
    public void asyncTriggered1() throws InterruptedException {
        Thread.sleep(1000L);
        System.out.println("Asynchronus -1- Start!" );
        Thread.sleep(5000L);
        System.out.println("Asynchronus -1- Active!" );
    }
    @Async
    public void asyncTriggered2() throws InterruptedException {
        Thread.sleep(1100L);
        System.out.println("Asynchronus -2- Start!" );
        Thread.sleep(4000L);
        System.out.println("Asynchronus -2- Active!" );
    }
    @Async
    public void asyncTriggered3() throws InterruptedException {
        Thread.sleep(1200L);
        System.out.println("Asynchronus -3- Start!" );
        Thread.sleep(3000L);
        System.out.println("Asynchronus -3- Active!" );
    }
    @Async
    public void asyncTriggered4() throws InterruptedException {
        Thread.sleep(1300L);
        System.out.println("Asynchronus -4- Start!" );
        Thread.sleep(2000L);
        System.out.println("Asynchronus -4- Active!" );
    }
    @Async
    public void asyncTriggered5() throws InterruptedException {
        Thread.sleep(1400L);
        System.out.println("Asynchronus -5- Start!" );
        Thread.sleep(1000L);
        System.out.println("Asynchronus -5- Active!" );
    }
}
