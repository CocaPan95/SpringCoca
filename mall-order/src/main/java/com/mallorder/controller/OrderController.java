package com.mallorder.controller;

import com.mallorder.Service.OrderService;
import com.mallcommon.domain.Orderss;
import com.mallcommon.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("Order")
public class OrderController {
    @Autowired
    private OrderService orderService;


    @GetMapping("GetOrderAll")
    public List<Orderss> GetOrderCount(){
        return orderService.GetOrderAll();
    }
    @GetMapping("GetOrder/{OrderId}")
    public Orderss GetOrder(@PathVariable Long OrderId){
        return orderService.GetOrder(OrderId);
    }
    @GetMapping("GetOrderByNo/{OrderNo}")
    public Orderss GetOrderByNo(@PathVariable String OrderNo) {
        return orderService.GetOrderByNo(OrderNo);
    }

    @PostMapping("OrderQuery")
    public List<Orderss> OrderQuery(UserDto userDto) {
        return orderService.OrderQuery(userDto);
    }
    @PostMapping("InsertOrder")
    public int InsertOrder(Orderss order) {
        return orderService.InsertOrder(order);
    }

    @PostMapping("UpdateOrder")
    public int UpdateOrder(Orderss order) {
        return orderService.UpdateOrder(order);
    }
    @RequestMapping("DeleteOrder")
    public int DeleteOrder(Integer OrderId) {
        return orderService.DeleteOrder(OrderId);
    }
}
