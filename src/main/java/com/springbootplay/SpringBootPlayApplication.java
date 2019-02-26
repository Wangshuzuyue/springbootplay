package com.springbootplay;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Auther: huangzuwang
 * @Date: 2018/10/18 14:48
 * @Description:
 */
@Controller
@SpringBootApplication
@Configuration
public class SpringBootPlayApplication extends SpringBootServletInitializer{

    @RequestMapping("hello")
    @ResponseBody
    public String hello(){
        return "hello world！!!";
    }

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(SpringBootPlayApplication.class);
//        application.setBannerMode(Banner.Mode.OFF);
        application.run(args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SpringBootPlayApplication.class);
    }
}
