package com.mallportal.service;

import com.mallmbg.model.OmsCartItem;
import com.mallportal.domain.CartPromotionItem;

import java.util.List;

public interface OmsCartItemService {
    /**
     * 获取包含促销活动信息的购物车列表
     */
    List<CartPromotionItem> listPromotion(Long memberId, List<Long> cartIds);

    /**
     * 根据会员编号获取购物车列表
     */
    List<OmsCartItem> list(Long memberId);
    /**
     * 批量删除购物车中的商品
     */
    int delete(Long memberId,List<Long> ids);
}
