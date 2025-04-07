//package com.oreilly.shopping.config;
//
//import com.oreilly.shopping.dao.ProductRepository;
//import com.oreilly.shopping.entities.Product;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import java.math.BigDecimal;
//import java.util.List;
//
//@Component
//public class AppInit implements CommandLineRunner {
//    private final ProductRepository repo;
//
//    public AppInit(ProductRepository repo) {
//        this.repo = repo;
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//        if(repo.count()==0){
//            repo.saveAll(List.of(
//                    new Product("TV tray", BigDecimal.valueOf(4.95)),
//                    new Product("Shoes", BigDecimal.valueOf(11.55)),
//                    new Product("Book", BigDecimal.valueOf(7)),
//                    new Product("Sofa", BigDecimal.valueOf(279))
//            )).forEach(System.out::println);
//        }
//    }
//}
