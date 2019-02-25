package com.springbootplay.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;
import org.apache.shiro.mgt.SecurityManager;

import java.util.HashSet;
import java.util.Set;

/**
 * @Auther: huangzuwang
 * @Date: 2018/12/20 14:33
 * @Description:
 */
public class ShiroTest {
    public static void main(String[] args) {
        Factory<SecurityManager> factory = new IniSecurityManagerFactory("classpath:shiro.ini");
        SecurityManager securityManager = factory.getInstance();
        SecurityUtils.setSecurityManager(securityManager);
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken("lisi", "111");
        System.out.println("认证前12321aaaa wwww 1111:" + subject.isAuthenticated());
        try {
            subject.login(token);
            subject.isPermitted();
        }catch (AuthenticationException e){
            System.out.println("认证失败");
        }
        if (subject.isAuthenticated()){
            System.out.println("认证成功");
        }
    }
}
