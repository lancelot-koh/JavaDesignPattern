package com.java.designpattern;

interface Product {
    void produce();
}

interface Factory {
    public Product create();
}

/**
 * Created by i077407 on 4/5/17.
 */
public class FactoryPattern {
    public static void main(String[] args) {

        Factory factory = new ProductAFactory();
        Product pa = factory.create();
        pa.produce();

        Factory factory2 = new ProductBFactory();
        Product pb = factory2.create();
        pb.produce();

        Factory factory3 = new ProductCFactory();
        Product pc = factory3.create();
        pc.produce();
    }

}

class ProductAFactory implements Factory {


    @Override
    public Product create() {
        return new ProductA();
    }
}

class ProductBFactory implements Factory {


    @Override
    public Product create() {
        return new ProductB();
    }
}

class ProductCFactory implements Factory {


    @Override
    public Product create() {
        return new ProductC();
    }
}

class ProductA implements Product {

    public void produce() {
        System.out.println("produce product a");
    }
}

class ProductB implements Product {

    public void produce() {
        System.out.println("produce product b");
    }
}

class ProductC implements Product {

    public void produce() {
        System.out.println("produce product c");
    }
}