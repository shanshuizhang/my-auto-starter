package com.zss.service.spring.boot.starter;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author fuguozhang
 * @email fuguozhang@jyblife.com
 * @date 2019/11/25 17:31
 */
@Data
@ConfigurationProperties(prefix = "com.zss.service")
public class UserPorperties {

    private String username;

    private String password;

}
