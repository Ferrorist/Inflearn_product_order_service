package com.example.orderservice.product;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProductTest {

	@Test
	void update() {
		final Product product = new Product("상품명", 1000, DiscountPolicy.NONE);

		product.update("상품 수령", 2000, DiscountPolicy.NONE);

		assertEquals("상품 수령", product.getName());
		assertEquals(2000, product.getPrice());
	}
}
