package com.example.orderservice.product;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

@ExtendWith(MockitoExtension.class)
public class ProductServiceTest {

	private ProductService productService;

	private ProductPort productPort;


	@BeforeEach
	void setUp() {
		productPort = Mockito.mock(ProductPort.class);
		productService = new ProductService(productPort);
	}

	@Test
	void 상품수정() {
		final Long productId = 1L;
		final UpdateProductRequest request = new UpdateProductRequest("상품 수령", 2000, DiscountPolicy.NONE);
		final Product product = new Product("상품평", 1000, DiscountPolicy.NONE);
		Mockito.when(productPort.getProduct(productId)).thenReturn(product);

		productService.updateProduct(productId, request);

		Assertions.assertEquals("상품 수령", product.getName());
		Assertions.assertEquals(2000, product.getPrice());
	}

	// private static class StubProductPort implements ProductPort {
	// 	public Product getProduct_will_return;
	//
	// 	@Override
	// 	public void save(Product product) {
	//
	// 	}
	//
	// 	@Override
	// 	public Product getProduct(Long productId) {
	// 		return getProduct_will_return;
	// 	}
	// }
}
