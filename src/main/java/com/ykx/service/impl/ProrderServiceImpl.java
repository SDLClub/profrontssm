package com.ykx.service.impl;

import com.ykx.dao.ProrderMapper;
import com.ykx.entity.Prorder;
import com.ykx.entity.ProrderExample;
import com.ykx.service.IProrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProrderServiceImpl implements IProrderService {
    @Autowired
    private ProrderMapper prorderMapper;

    @Override
    public int insertOrderOne(Prorder prorder) {
        return prorderMapper.insertSelective(prorder);
    }

    @Override
    public Prorder selectOrder(String orderCode) {
        ProrderExample prorderExample = new ProrderExample();
        prorderExample.createCriteria().andOrdercodeEqualTo(orderCode);
        List<Prorder> prorders = prorderMapper.selectByExample(prorderExample);
        if(prorders != null && prorders.size() == 1){
            return prorders.get(0);
        }
        return null;
    }
}
