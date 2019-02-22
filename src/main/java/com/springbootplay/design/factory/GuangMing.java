package com.springbootplay.design.factory;

/**
 * @Auther: huangzuwang
 * @Date: 2019/2/15 15:14
 * @Description:
 */
public class GuangMing implements Milk, Cloneable{
    @Override
    public String getName() {
        return "GuangMing Milk";
    }
}
