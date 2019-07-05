package com.page.oauth2.server.service.impl;

import com.page.oauth2.server.domain.TbPermission;
import com.page.oauth2.server.mapper.TbPermissionMapper;
import com.page.oauth2.server.service.TbPermissionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TbPermissionServiceImpl implements TbPermissionService{

    @Resource
    private TbPermissionMapper tbPermissionMapper;

    /**
     * 获取用户权限
     * @param userId
     * @return
     */
    @Override
    public List<TbPermission> selectByUserId(Long userId) {
        return tbPermissionMapper.selectByUserId(userId);
    }
}
