package com.samchang.springbootmall.dao;

import com.samchang.springbootmall.model.Product;

public interface ProductDao {
    Product getProductById(Integer productId);
}
