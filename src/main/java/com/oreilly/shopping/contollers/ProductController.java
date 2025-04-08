package com.oreilly.shopping.contollers;

import com.oreilly.shopping.entities.Product;
import com.oreilly.shopping.services.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ProductController {

    private final ProductService svc;

    public ProductController(ProductService svc) {
        this.svc = svc;
    }

    @GetMapping(path = "/live")
    public String ok(){
        return "ok";
    }
    @GetMapping(path = "/products")
    public List<Product> findAll(){
        return svc.findAll();
    }
    @GetMapping(path = "api/products/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id){
        return ResponseEntity.of(svc.findById(id));
    }

}
