package com.example.orderservice.product;

interface ProductPort {
    void save(final Product product);

	Product getProduct(Long productId);
}
