package com.java.designpattern.creation;

import java.io.ByteArrayInputStream;

/**
 * Created by i077407 on 8/5/17.
 */
public class BuilderPattern {

}

class Product2{
    public String getPart1() {
        return part1;
    }

    public void setPart1(String part1) {
        this.part1 = part1;
    }

    public String getPart2() {
        return part2;
    }

    public void setPart2(String part2) {
        this.part2 = part2;
    }

    public String getPart3() {
        return part3;
    }

    public void setPart3(String part3) {
        this.part3 = part3;
    }

    private String part1;
    private String part2;
    private String part3;

}

abstract class Builder{
    protected Product2 product2;


    public abstract void buildPart1();
    public abstract void buildPart2();
    public abstract void buildPart3();
    public Product2 getProduct() {
        return  product2;
    };
}

class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Product2 build(){
        this.builder.buildPart1();
        this.builder.buildPart2();
        this.builder.buildPart3();

        return  this.builder.getProduct();
    }
}

class ConcreteBuilder extends Builder{

    public void buildPart1() {
        System.out.println("1");
    }

    public void buildPart2() {
        System.out.println("2");
    }

    public void buildPart3() {
        System.out.println("3");
    }

}