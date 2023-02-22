package com.mallportal.service;

import com.mallmbg.model.UmsMember;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.transaction.annotation.Transactional;

public interface UmsMemberService {
    /**
     * 获取当前登录会员
     */
    UmsMember getCurrentMember();

    /**
     * 获取用户信息
     */
    UserDetails loadUserByUsername(String username);

    UmsMember getByUsername(String username);
    /**
     * 用户注册
     */
    @Transactional
    void register(String username, String password, String telephone, String authCode);
    /**
     * 登录后获取token
     */
    String login(String username, String password);
    /**
     * 根据会员id修改会员积分
     */
    void updateIntegration(Long id,Integer integration);

    /**
     * 根据会员编号获取会员
     */
    UmsMember getById(Long id);

}
