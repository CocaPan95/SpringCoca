package com.mallorder.controller;

import com.mallcommon.api.CommonResult;
import com.mallorder.Service.OrderService;
import com.mallcommon.domain.Orderss;
import com.mallcommon.dto.UserDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
//import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@Api(tags = "OrderController", description = "商品品牌管理")
//@Tag(name = "OrderController", description = "订单管理")
@RequestMapping("Order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @ApiOperation("获取所有收货地址")
    @GetMapping("GetOrderAll")
    public CommonResult<List<Orderss>> GetOrderAll() {
        List<Orderss> result = orderService.GetOrderAll();
        return CommonResult.success(result);
    }

    @ApiOperation("获取所有收货地址")
    @GetMapping("GetOrder/{OrderId}")
    public CommonResult<Orderss> GetOrder(@PathVariable Long OrderId) {
        Orderss result = orderService.GetOrder(OrderId);
        return CommonResult.success(result);
    }

    @ApiOperation("获取所有收货地址")
    @GetMapping("GetOrderByNo/{OrderNo}")
    public CommonResult<Orderss> GetOrderByNo(@PathVariable String OrderNo) {
        Orderss result = orderService.GetOrderByNo(OrderNo);
        return CommonResult.success(result);
    }

    @ApiOperation("获取所有收货地址")
    @PostMapping("OrderQuery")
    public CommonResult<List<Orderss>> OrderQuery(UserDto userDto) {
        List<Orderss> result=orderService.OrderQuery(userDto);
        return CommonResult.success(result);
    }

    @ApiOperation("获取所有收货地址")
    @PostMapping("InsertOrder")
    public CommonResult<Integer> InsertOrder(Orderss order) {
        int result=orderService.InsertOrder(order);
        return CommonResult.success(result);
    }

    @ApiOperation("获取所有收货地址")
    @PostMapping("UpdateOrder")
    public CommonResult<Integer> UpdateOrder(Orderss order) {
        int result= orderService.UpdateOrder(order);
        return CommonResult.success(result);
    }

    @ApiOperation("获取所有收货地址")
    @DeleteMapping("DeleteOrder")
    public CommonResult<Integer> DeleteOrder(Integer OrderId) {
        int result= orderService.DeleteOrder(OrderId);
        return CommonResult.success(result);
    }
}
