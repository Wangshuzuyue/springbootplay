package com.springbootplay.design.single;

/**
 * 内部类是延时加载的，也就是说只会在第一次使用时加载。不使用就不加载，所以可以很好的实现单例模式。
 */
public class OuterClass {
    static {
        System.out.println("OuterClass static load.");
    }

    public OuterClass() {
        System.out.println("flag");
    }

    public OuterClass(String flag) {
        System.out.println("flag:" + flag);
    }

    class InnerClass {
        //private static String te = "";
        /*static{
            System.out.println("InnerClass static load.");
        }*/
        private OuterClass out = new OuterClass("inner");
    }

    static class InnerStaticClass {
        private static OuterClass out = new OuterClass("innerStatic");

        static {
            System.out.println("InnerStaticClass static load.");
        }

        private static void load() {
            System.out.println("InnerStaticClass func load().");
        }
    }

    public static OuterClass getInstatnce() {
        return OuterClass.InnerStaticClass.out;
    }

    public static void main(String[] args) {
        OuterClass.InnerStaticClass.load();
        OuterClass out = OuterClass.InnerStaticClass.out;
        OuterClass.InnerClass innerClass = out.new InnerClass();
    }

}