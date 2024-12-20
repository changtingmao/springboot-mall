package com.samchang.springbootmall.dao;

import com.samchang.springbootmall.dto.ProductRequest;
import com.samchang.springbootmall.model.Product;

public interface ProductDao {
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
