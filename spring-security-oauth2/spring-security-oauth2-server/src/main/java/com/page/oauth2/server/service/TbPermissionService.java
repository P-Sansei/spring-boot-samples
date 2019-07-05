package com.page.oauth2.server.service;

import com.page.oauth2.server.domain.TbPermission;

import java.util.List;

public interface TbPermissionService{

    List<TbPermission> selectByUserId(Long userId);
}
