package com.oreilly.shopping;

import com.oreilly.shopping.dao.ProductRepository;
import com.oreilly.shopping.entities.Product;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.util.List;

@SpringBootApplication
public class ShoppingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingApplication.class, args);
	}

	@Bean
	public CommandLineRunner initializeDatabase(ProductRepository repo) {
		return args -> {
			if(repo.count()==0){
				repo.saveAll(List.of(
						new Product("TV tray", BigDecimal.valueOf(4.95)),
						new Product("Shoes", BigDecimal.valueOf(11.55)),
						new Product("Book", BigDecimal.valueOf(7)),
						new Product("Sofa", BigDecimal.valueOf(279))
				)).forEach(System.out::println);
			}
		};
	}
}


