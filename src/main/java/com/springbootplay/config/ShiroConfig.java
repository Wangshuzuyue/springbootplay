package com.springbootplay.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: huangzuwang
 * @Date: 2018/11/20 11:20
 * @Description:
 */
@Configuration
public class ShiroConfig {

    @Value("${spring.datasource.url}")
    private String url;

    @Value("${spring.datasource.username}")
    private String username;

    @Value("${spring.datasource.password}")
    private String password;

    @Value("${spring.datasource.driver-class-name}")
    private String driverClassName;


    /**
     * 容器里没有这个bean才创建
     * @return
     */
    @Bean
    @ConditionalOnMissingBean
    public SqlSessionFactoryBean sqlSessionFactoryBean(){
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();

//        DataSource dataSource = new DataSource() {
//        }
//        sqlSessionFactoryBean.setDataSource();
        return sqlSessionFactoryBean;
    }
}
