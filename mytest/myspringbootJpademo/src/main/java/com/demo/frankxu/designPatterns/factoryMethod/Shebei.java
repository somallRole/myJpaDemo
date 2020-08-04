package com.demo.frankxu.designPatterns.factoryMethod;

/**
 * 设备类
 */
public class Shebei {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    private void searchInfo(){
        System.out.println(this.name);
    }
}
