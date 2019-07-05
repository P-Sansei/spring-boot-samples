package com.page.oauth2;

import com.page.oauth2.server.service.TbPermissionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 权限查询测试
 * <p>Title: TbPermissionServiceTests</p>
 * 
 * @author penghe.yu
 * @date 2019-07-05 14:42
 * @package com.page.oauth2
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = OAuth2ServerApplication.class)
public class TbPermissionServiceTests {
    @Autowired
    private TbPermissionService tbPermissionService;

    @Test
    public void testSelectByUserId() {
        tbPermissionService.selectByUserId(37L).forEach(tbPermission -> System.out.println(tbPermission));
    }
}
