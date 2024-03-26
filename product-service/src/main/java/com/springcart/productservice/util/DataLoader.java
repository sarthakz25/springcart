//package com.springcart.productservice.util;
//
//import com.springcart.productservice.model.Product;
//import com.springcart.productservice.repository.ProductRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import java.math.BigDecimal;
//
//@Component
//@RequiredArgsConstructor
//public class DataLoader implements CommandLineRunner {
//
//    private final ProductRepository productRepository;
//
//    @Override
//    public void run(String... args) throws Exception {
//        if (productRepository.count() < 1) {
//            Product product = new Product();
//            product.setName("Samsung Galaxy S24");
//            product.setDescription("A flagship smartphone featuring cutting-edge technology, powerful performance, and an advanced camera system.");
//            product.setPrice(BigDecimal.valueOf(1000));
//            productRepository.save(product);
//        }
//    }
//}
