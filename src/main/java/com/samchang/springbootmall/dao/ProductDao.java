package com.samchang.springbootmall.dao;

import com.samchang.springbootmall.constant.ProductCategory;
import com.samchang.springbootmall.dto.ProductQueryParams;
import com.samchang.springbootmall.dto.ProductRequest;
import com.samchang.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {
    Integer countProduct(ProductQueryParams productQueryParams);

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
