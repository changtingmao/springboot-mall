package com.samchang.springbootmall.service;

import com.samchang.springbootmall.model.Product;

public interface ProductService {
    Product getProductById(Integer productId);
}
