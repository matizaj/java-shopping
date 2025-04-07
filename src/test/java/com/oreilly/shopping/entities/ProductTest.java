package com.oreilly.shopping.entities;

import jakarta.validation.Validator;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProductTest {

    @Autowired
    private Validator validator;

    @Test
    void validProduct() {
        Product product = new Product("TV tray", BigDecimal.valueOf(4.95));
        var validations = validator.validate(product);
        assertTrue(validations.isEmpty());
    }
    @Test
    void invalidProduct() {
        Product product = new Product(" ", BigDecimal.valueOf(4.95));
        var validations = validator.validate(product);
        assertFalse(validations.isEmpty());
    }

}