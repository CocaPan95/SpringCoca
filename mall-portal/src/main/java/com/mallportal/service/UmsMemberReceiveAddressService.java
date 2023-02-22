package com.mallportal.service;

import com.mallmbg.model.UmsMemberReceiveAddress;

import java.util.List;

public interface UmsMemberReceiveAddressService {

    /**
     * 返回当前用户的收货地址
     */
    List<UmsMemberReceiveAddress> list();


    /**
     * 获取地址详情
     * @param id 地址id
     */
    UmsMemberReceiveAddress getItem(Long id);
}
