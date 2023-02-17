package com.mallorder.controller;

import com.mallcommon.api.CommonResult;
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
    public CommonResult<List<Orderss>> GetOrderAll() {
        List<Orderss> result = orderService.GetOrderAll();
        return CommonResult.success(result);
    }

    @GetMapping("GetOrder/{OrderId}")
    public CommonResult<Orderss> GetOrder(@PathVariable Long OrderId) {
        Orderss result = orderService.GetOrder(OrderId);
        return CommonResult.success(result);
    }

    @GetMapping("GetOrderByNo/{OrderNo}")
    public CommonResult<Orderss> GetOrderByNo(@PathVariable String OrderNo) {
        Orderss result = orderService.GetOrderByNo(OrderNo);
        return CommonResult.success(result);
    }

    @PostMapping("OrderQuery")
    public CommonResult<List<Orderss>> OrderQuery(UserDto userDto) {
        List<Orderss> result=orderService.OrderQuery(userDto);
        return CommonResult.success(result);
    }

    @PostMapping("InsertOrder")
    public CommonResult<Integer> InsertOrder(Orderss order) {
        int result=orderService.InsertOrder(order);
        return CommonResult.success(result);
    }

    @PostMapping("UpdateOrder")
    public CommonResult<Integer> UpdateOrder(Orderss order) {
        int result= orderService.UpdateOrder(order);
        return CommonResult.success(result);
    }

    @RequestMapping("DeleteOrder")
    public CommonResult<Integer> DeleteOrder(Integer OrderId) {
        int result= orderService.DeleteOrder(OrderId);
        return CommonResult.success(result);
    }
}
