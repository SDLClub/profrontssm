package com.ykx.dao.ext;

import com.ykx.entity.Product;

import java.util.List;

public interface ProductExtMapper {

    List<Product> qryProductsById();

    Product qryDetail(Integer productId);

    List<Product> qryProductByCategoryId(Integer categoryId);
}
