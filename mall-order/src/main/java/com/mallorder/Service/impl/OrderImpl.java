package com.mallorder.Service.impl;


import com.mallcommon.service.RedisService;
import com.mallorder.Service.OrderService;
import com.mallorder.dao.OrderDao;
import com.mallcommon.domain.Orderss;
import com.mallcommon.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderImpl implements OrderService {
    @Value("${redis.database}")
    private String REDIS_DATABASE;

    @Value("${redis.key.resourceList}")
    private String REDIS_KEY_RESOURCE_LIST;

    @Autowired
    private OrderDao orderMapper;
    @Autowired
    private RedisService redisService;

    public List<Orderss> GetOrderAll() {
        String keys=REDIS_DATABASE+":"+REDIS_KEY_RESOURCE_LIST+"GetOrderAll";
        List<Orderss> result=(List<Orderss>)redisService.get(keys);
        if (result==null){
            result=orderMapper.GetOrderAll();
            if(result.stream().count()>0){
                redisService.set(keys,result,100000);
            }
        }
        return result;
    }

    public int GetOrderCount() {
        return orderMapper.GetOrderCount();
    }

    public Orderss GetOrder(Long OrderId) {
        return orderMapper.GetOrder(OrderId);
    }

    public Orderss GetOrderByNo(String OrderNo) {
        return orderMapper.GetOrderByNo(OrderNo).stream().findFirst().get();
    }

    public List<Orderss> OrderQuery(UserDto userDto) {
        return orderMapper.OrderQuery(userDto);
    }

    public int InsertOrder(Orderss order) {
        return orderMapper.InsertOrder(order);
    }

    public int UpdateOrder(Orderss order) {
        return orderMapper.UpdateOrder(order);
    }

    public int DeleteOrder(Integer OrderId) {
        return orderMapper.DeleteOrder(OrderId);
    }
}
