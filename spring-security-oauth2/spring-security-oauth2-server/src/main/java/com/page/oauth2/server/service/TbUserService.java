package com.page.oauth2.server.service;

import com.page.oauth2.server.domain.TbUser;

/**
 * 用户业务逻辑层
 * <p>Title: TbUserService</p>
 * 
 * @author penghe.yu
 * @date 2019-07-05 14:23
 * @package com.page.oauth2.server.service
 */
public interface TbUserService{
    /**
     * 根据用户名获取用户信息
     * @param username
     * @return
     */
    TbUser getByUsername(String username);

}
