package com.java.designpattern.creation;

interface AbstractFactory {
    public AbstractProductA createProductA();
    public AbstractProductB createProductB();
}

interface AbstractProductA {
    public void use();
}

interface AbstractProductB {
    public  void eat();
}

/**
 * Created by i077407 on 4/5/17.
 */
public class AbstractFactoryPattern {
    public static void main(String args[]) {

        AbstractFactory factory = new ConcreteFactoryA();
        AbstractProductA productA = factory.createProductA();
        AbstractProductB productB = factory.createProductB();
        productA.use();
        productB.eat();

        AbstractFactory factory2 = new ConcreteFactoryB();
        AbstractProductA product1 = factory2.createProductA();
        AbstractProductB product2 = factory2.createProductB();
        product1.use();
        product2.eat();

    }

}

class ConcreteFactoryA implements AbstractFactory {
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    public AbstractProductB createProductB() {
        return new ProductB1();
    }

}

class ConcreteFactoryB implements AbstractFactory {
    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    public AbstractProductB createProductB() {
        return new ProductB2();
    }

}

class ProductA1 implements AbstractProductA {
    public void use() {
        System.out.println("use A1");
    }
}

class ProductA2 implements AbstractProductA {
    public void use() {
        System.out.println("use A2");
    }
}

class ProductB1 implements AbstractProductB {
    public void eat() {
        System.out.println("eat B1");
    }
}

class ProductB2 implements AbstractProductB {
    public void eat() {
        System.out.println("eat B2");
    }
}