package com.ykx.service;

import com.ykx.entity.Product;

import java.util.List;

public interface IProductService {

    List<Product> queryProductById();
    Product queryDetail(Integer productId);

    List<Product> queryProductByCategoryId(Integer categoryId);

}
