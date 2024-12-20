package com.samchang.springbootmall.service;

import com.samchang.springbootmall.dto.ProductRequest;
import com.samchang.springbootmall.model.Product;

public interface ProductService {
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);
}
