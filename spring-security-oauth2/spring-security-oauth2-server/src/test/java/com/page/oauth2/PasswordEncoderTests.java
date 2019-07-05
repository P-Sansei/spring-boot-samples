package com.page.oauth2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;
/**
 * 密码加密测试
 * <p>Title: PasswordEncoderTests</p>
 *
 * @author penghe.yu
 * @date 2019-07-05 14:49
 * @package com.page.oauth2
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = OAuth2ServerApplication.class)
public class PasswordEncoderTests {

    @Test
    public void testBCryptPasswordEncoder() {
        System.out.println(new BCryptPasswordEncoder().encode("secret"));
        System.out.println(new BCryptPasswordEncoder().encode("123456"));
    }
}