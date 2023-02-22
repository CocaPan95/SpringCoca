package com.mallportal.service;

import com.mallportal.domain.CartPromotionItem;
import com.mallportal.domain.SmsCouponHistoryDetail;

import java.util.List;

public interface UmsMemberCouponService {
    /**
     * 根据购物车信息获取可用优惠券
     */
    List<SmsCouponHistoryDetail> listCart(List<CartPromotionItem> cartItemList, Integer type);
}
