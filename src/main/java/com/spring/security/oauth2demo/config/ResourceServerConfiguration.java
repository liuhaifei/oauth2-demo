package com.spring.security.oauth2demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;

/**
 * @ClassName ResourceServerConfiguration
 * @Description  配置资源服务器
 * @Author 刘海飞
 * @Date 2019/1/25 10:04
 * @Version 1.0
 **/
@Configuration
@EnableResourceServer
public class ResourceServerConfiguration extends ResourceServerConfigurerAdapter{

    private static final String DEMO_SOURCE_ID="order";

    @Override
    public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
        resources.resourceId(DEMO_SOURCE_ID).stateless(true);
    }

    @Override
    public void configure(HttpSecurity http) throws Exception {
//        http
//                .sessionManagement()
//                .sessionCreationPolicy(SessionCreationPolicy.IF_REQUIRED)
//                .and()
//                .requestMatchers()
//                .anyRequest()
//                .and()
//                .authorizeRequests()
//                .antMatchers("/product/**")
//                .access("#oauth2.hasScope('select') and hasRole('ROLE_USER')")
//                .antMatchers("/order/**")
//                .authenticated();//配置order访问控制 ，必须配置权限之后才可访问
//
        http
                .authorizeRequests()
                .antMatchers("/order/**").authenticated();//配置order访问控制，必须认证过后才可以访问
    }


}
