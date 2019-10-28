package com.ykx.controller;

import com.ykx.entity.Product;
import com.ykx.entity.R;
import com.ykx.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class IndexController {

    @Autowired
    private IProductService productService;

    @RequestMapping("/reid")
    public R getProductById(){
         List<Product> products = productService.queryProductById();
        System.out.println(products);
        return R.ok(products);
    }
    @RequestMapping("/categoryById/{categoryId}")
    public R getProductByCategoryId(@PathVariable Integer categoryId){
        List<Product> products = productService.queryProductByCategoryId(categoryId);
        System.out.println(products);
        return R.ok(products);
    }

}
