package com.lujunxiong.config;

import com.lujunxiong.filter.XssFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @className: com.lujunxiong.config-> AntiSamyConfiguration
 * @author: junxiong.lu
 * @createDate: 2021-10-06 11:55
 * @description:
 */
@Configuration
public class AntiSamyConfiguration {
    /**
     * 配置跨站攻击过滤器
     */
    @Bean
    public FilterRegistrationBean filterRegistrationBean() {
        FilterRegistrationBean filterRegistration =
                new FilterRegistrationBean(new XssFilter());
        filterRegistration.addUrlPatterns("/*");
        filterRegistration.setOrder(1);
        return filterRegistration;
    }
}
