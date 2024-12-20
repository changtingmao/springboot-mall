package com.samchang.springbootmall.service.impl;

import com.samchang.springbootmall.dao.ProductDao;
import com.samchang.springbootmall.model.Product;
import com.samchang.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }
}