//package com.springcart.inventoryservice.util;
//
//import com.springcart.inventoryservice.model.Inventory;
//import com.springcart.inventoryservice.repository.InventoryRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//@Component
//@RequiredArgsConstructor
//public class DataLoader implements CommandLineRunner {
//
//    private final InventoryRepository inventoryRepository;
//
//    @Override
//    public void run(String... args) throws Exception {
//        Inventory inventory = new Inventory();
//        inventory.setSkuCode("samsung_s24");
//        inventory.setQuantity(100);
//
//        Inventory inventory1 = new Inventory();
//        inventory1.setSkuCode("samsung_s24_fe");
//        inventory1.setQuantity(0);
//
//        inventoryRepository.save(inventory);
//        inventoryRepository.save(inventory1);
//    }
//}
