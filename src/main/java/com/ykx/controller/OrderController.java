package com.ykx.controller;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ykx.entity.OrderItem;
import com.ykx.entity.Prorder;
import com.ykx.entity.R;
import com.ykx.entity.dto.OrderItemAndProductDto;
import com.ykx.entity.dto.OrderItemDto;
import com.ykx.entity.vo.ProductVo;
import com.ykx.entity.vo.ProrderVo;
import com.ykx.service.IOrderItemService;
import com.ykx.service.IProrderService;
import com.ykx.util.CodeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/order")
public class OrderController {

    @Autowired
    private IProrderService prorderService;
    @Autowired
    private IOrderItemService orderItemService;

    @RequestMapping("{orderCode}")
    public R orderItems(@PathVariable String orderCode){
        //从订单表中查  联系人   电话   地址
        System.out.println(orderCode);
        Prorder prorder = prorderService.selectOrder(orderCode);

        OrderItemDto orderItemDto = new OrderItemDto();
        orderItemDto.setRealName(prorder.getRealName());
        orderItemDto.setMobile(prorder.getMobile());
        orderItemDto.setAddress(prorder.getAddress());
        orderItemDto.setCreateDate(prorder.getCreatedate());

        List<OrderItemAndProductDto> orderItemAndProductDtoList = orderItemService.slOrder(orderCode);

        orderItemDto.setOrderDtos(orderItemAndProductDtoList);


        //订单详情
        return R.ok(orderItemDto);
    }

    @RequestMapping("/create")
    public R carterOreder(ProrderVo prorderVo) throws IOException {

        System.out.println(prorderVo);
        Prorder prorder = new Prorder();
        //生成订单编号
        String orderCode = "order" + CodeUtil.code();
        prorder.setOrdercode(orderCode);
        //手机号    地址
        prorder.setAddress(prorderVo.getAddress());
        prorder.setMobile(prorderVo.getMobile());
        //下单时间
        /*java.util.Date date=new java.util.Date();
        java.sql.Date data1=new java.sql.Date(date.getTime());*/
        Date date=new Date();
        Timestamp timeStamp = new Timestamp(date.getTime());
        prorder.setCreatedate(timeStamp);
        //订单状态
        prorder.setStatus("完成");
        //用户id
        prorder.setRealName(prorderVo.getRealName());
        prorder.setUserId(prorderVo.getUserId());

        System.out.println(prorder);
        prorderService.insertOrderOne(prorder);

        String productVos = prorderVo.getProductVos();
        System.out.println(productVos);

        //jackson的转换
        ObjectMapper objectMapper = new ObjectMapper();
        JavaType jt = objectMapper.getTypeFactory().constructParametricType(ArrayList.class, ProductVo.class);
        List<ProductVo> productVoArrayList = objectMapper.readValue(productVos,jt);
        for(ProductVo productVo : productVoArrayList){
            OrderItem orderItem = new OrderItem();
            System.out.println(orderItem);

            orderItem.setOrdercode(orderCode);
            orderItem.setProNumber(productVo.getProNumber());
            orderItem.setRealName(prorderVo.getRealName());
            orderItem.setProPrice(productVo.getProPrice());
            orderItem.setOrderNumber(productVo.getOrderNumber());
            orderItem.setOrderSum(productVo.getOrderSum());
            orderItem.setProductId(productVo.getProductId());
            orderItemService.insertOrderItem(orderItem);
        }
        return R.ok(orderCode);
    }
}
