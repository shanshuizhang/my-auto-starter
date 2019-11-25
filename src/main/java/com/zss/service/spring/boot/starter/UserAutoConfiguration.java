package com.zss.service.spring.boot.starter;

import com.zss.service.UserService;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author fuguozhang
 * @email fuguozhang@jyblife.com
 * @date 2019/11/25 17:35
 */
@Configuration
@EnableConfigurationProperties(UserPorperties.class)
public class UserAutoConfiguration {

    @Bean
    public UserService getBean(UserPorperties userPorperties){
        UserService userService = new UserService();
        userService.setUsername(userPorperties.getUsername());
        userService.setPassword(userPorperties.getPassword());
        return userService;
    }
}
