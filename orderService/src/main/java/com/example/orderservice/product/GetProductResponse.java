package com.example.orderservice.product;

import org.springframework.util.Assert;

record GetProductResponse(
	long id,
	String name,
	int price,
	DiscountPolicy discountPolicy
) {
	GetProductResponse {
		Assert.notNull(id, "");
		Assert.notNull(name, "");
		Assert.notNull(discountPolicy, "");
	}
}
