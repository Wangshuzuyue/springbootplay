package com.springbootplay.design.factory.single;

import com.springbootplay.design.factory.GuangMing;
import com.springbootplay.design.factory.Milk;
import com.springbootplay.design.factory.Telunsu;

/**
 * @Auther: huangzuwang
 * @Date: 2019/2/15 15:15
 * @Description:
 */
public class SimpleFactory {

    public static Milk get(String name){
        if ("telunsu".equals(name)){
            return new Telunsu();
        }if ("GuangMing".equals(name)){
            return new GuangMing();
        }
        return null;

    }
}
