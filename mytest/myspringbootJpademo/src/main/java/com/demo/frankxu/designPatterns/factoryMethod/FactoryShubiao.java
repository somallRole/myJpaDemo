package com.demo.frankxu.designPatterns.factoryMethod;

public class FactoryShubiao extends Shebei implements FactoryShebei {
    @Override
    public Shebei product() {
        Shebei shebei = new Shebei();
        shebei.setName("罗技鼠标RTX");
        explan();
        return shebei;
    }
    private static void explan(){
        System.out.println("罗技生产专属鼠标");
    }
}
