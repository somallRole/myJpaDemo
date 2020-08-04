package com.demo.frankxu.designPatterns.factoryMethod;

public class UsbImpl implements UsbInterface {
    @Override
    public Shebei use() {
        FactoryShebei factoryShebei = new FactoryShubiao();

        return factoryShebei.product();
    }
}
