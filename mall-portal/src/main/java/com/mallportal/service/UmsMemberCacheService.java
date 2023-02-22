package com.mallportal.service;

import com.mallmbg.model.UmsMember;

public interface UmsMemberCacheService {
    /**
     * 获取会员用户缓存
     */
    UmsMember getMember(String username);

    /**
     * 设置会员用户缓存
     */
    void setMember(UmsMember member);
    /**
     * 获取验证码
     */
    String getAuthCode(String telephone);
    /**
     * 删除会员用户缓存
     */
    void delMember(Long memberId);
}
