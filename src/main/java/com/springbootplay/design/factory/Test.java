package com.springbootplay.design.factory;

import com.springbootplay.design.factory.single.SimpleFactory;

/**
 * @Auther: huangzuwang
 * @Date: 2019/2/15 14:55
 * @Description:
 */
public class Test {

    public static void main(String[] args) {

        //简单工厂模式
        Milk telunsu = SimpleFactory.get("telunsu");
        Milk guangMing = SimpleFactory.get("GuangMing");
        System.out.println(telunsu.getName());
        System.out.println(guangMing.getName());

        //工厂方法模式

    }
}
