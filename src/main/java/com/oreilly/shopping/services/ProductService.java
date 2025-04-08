package com.oreilly.shopping.services;

import com.oreilly.shopping.dao.ProductRepository;
import com.oreilly.shopping.entities.Product;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ProductService {

    private final ProductRepository repo;


    public ProductService(ProductRepository repo) {
        this.repo = repo;
    }

    public void initializeDatabase() {
        if(repo.count()==0){
            repo.saveAll(List.of(
                    new Product("TV tray", BigDecimal.valueOf(4.95)),
                    new Product("Shoes", BigDecimal.valueOf(11.55)),
                    new Product("Book", BigDecimal.valueOf(7)),
                    new Product("Sofa", BigDecimal.valueOf(279))
            )).forEach(System.out::println);
        }
    }

    public List<Product> findAll() {
        return repo.findAll();
    }
    public Optional<Product> findById(Long id) {
        return repo.findById(id);
    }
}
