package Service.impl;

import Service.OrderService;
import dao.OrderDao;
import domain.Orderss;
import dto.UserDto;
import mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderImpl implements OrderService {
    @Autowired
    private OrderDao orderMapper;


    public List<Orderss> GetOrderAll() {
        return orderMapper.GetOrderAll();
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
