package com.mallorder.dao;

import com.mallcommon.domain.Orderss;
import com.mallcommon.dto.UserDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderDao {
    List<Orderss> GetOrderAll();

    int GetOrderCount();

    Orderss GetOrder(Long OrderId);

    List<Orderss> GetOrderByNo(String OrderNo);

    List<Orderss> OrderQuery(UserDto userDto);

    int InsertOrder(Orderss order);

    int UpdateOrder(Orderss order);

    int DeleteOrder(Integer OrderId);
}
