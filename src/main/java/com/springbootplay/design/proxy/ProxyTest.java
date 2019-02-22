package com.springbootplay.design.proxy;

/**
 * @Auther: huangzuwang
 * @Date: 2019/2/18 17:40
 * @Description:
 */
public class ProxyTest {
    public static void main(String[] args) {
        Singer singer = new ZhangJie();
        ChargeProxy<Singer> proxy = new ChargeProxy<>(singer);
        Singer proxyInstance = proxy.getInstance();
        proxyInstance.sing("逆战");
    }
}
