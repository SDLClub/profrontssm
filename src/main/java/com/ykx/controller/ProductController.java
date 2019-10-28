package com.ykx.controller;


import com.ykx.entity.Product;
import com.ykx.entity.R;
import com.ykx.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    private IProductService productService;

    @RequestMapping("{productId}")
    public R queryProductDetail(@PathVariable  Integer productId){
        System.out.println("sdfwewf"+productId);
        Product product = productService.queryDetail(productId);
        return  R.ok(product);
    }

}
