package com.springbootplay.design.proxy;

/**
 * @Auther: huangzuwang
 * @Date: 2019/2/18 17:32
 * @Description:
 */
public class ZhangJie implements Singer{
    @Override
    public void sing(String name) {
        System.out.println("张杰: " + name);
    }
}
