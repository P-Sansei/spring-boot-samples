package com.page.oauth2.server.service.impl;

import com.page.oauth2.server.domain.TbUser;
import com.page.oauth2.server.mapper.TbUserMapper;
import com.page.oauth2.server.service.TbUserService;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
/**
 * 用户业务实现层
 * <p>Title: TbUserServiceImpl</p>
 * 
 * @author penghe.yu
 * @date 2019-07-05 14:24
 * @package com.page.oauth2.server.service.impl
 */

@Service
public class TbUserServiceImpl implements TbUserService{

    @Resource
    private TbUserMapper tbUserMapper;

    @Override
    public TbUser getByUsername(String username) {
        // 参数构造
        Example example = new Example(TbUser.class);
        example.createCriteria().andEqualTo("username", username);
        // 查询用户信息
        return tbUserMapper.selectOneByExample(example);
    }
}
