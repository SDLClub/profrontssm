package com.ykx.service.impl;

import com.ykx.dao.ext.ProductExtMapper;
import com.ykx.entity.Product;
import com.ykx.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    private ProductExtMapper productExtMapper;

    @Override
    public List<Product> queryProductById() {

        return productExtMapper.qryProductsById();
    }

    @Override
    public Product queryDetail(Integer productId) {
        return  productExtMapper.qryDetail(productId);
    }

    @Override
    public List<Product> queryProductByCategoryId(Integer categoryId) {
        List<Product> products = productExtMapper.qryProductByCategoryId(categoryId);
        return products;
    }
}
