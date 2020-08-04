package com.demo.frankxu.designPatterns.factoryMethod;

public class FactoryJianpan extends Shebei implements FactoryShebei {


    @Override
    public Shebei product() {
        Shebei shebei = new Shebei();
        shebei.setName("七彩虹键盘GTX");
        explan();
        return shebei;
    }

    private static void explan(){
        System.out.println("七彩虹生产专属键盘");
    }
}
