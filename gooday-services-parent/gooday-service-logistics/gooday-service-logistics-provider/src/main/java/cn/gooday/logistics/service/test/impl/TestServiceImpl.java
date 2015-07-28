package cn.gooday.logistics.service.test.impl;

import org.springframework.stereotype.Service;

import cn.gooday.logistics.api.service.TestService;

/**
 * //声明式事务
 */
@Service
public class TestServiceImpl implements TestService {

    @Override
    public String getMessage(String param) {
       
        return "OK-"+param;
    }
}
