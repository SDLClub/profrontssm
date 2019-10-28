package com.ykx.service;

import com.ykx.entity.Prorder;

public interface IProrderService {

    int insertOrderOne(Prorder order);
    Prorder selectOrder(String orderCode);

}
