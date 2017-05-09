package com.java.designpattern.creation;

/**
 * Created by i077407 on 8/5/17.
 */
public class Singleton {

    // recommend method 2

    // how to create multi instance

}


// double check singleton
class LazySingleton {

    private volatile static LazySingleton instance = null;
    private LazySingleton() {}

    public static LazySingleton getInstance(){
        if(instance ==null) {
            synchronized (LazySingleton.class) {
                if(instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return  instance;
    }

}


//utilize classloader first load inner class into jvm, lazy load method to create singleton instance
class InnerClassSingleton {

    private InnerClassSingleton(){}

    private static class InnerClass {
        private final static InnerClassSingleton instance = new InnerClassSingleton();
    }

    public static InnerClassSingleton getInstance() {
        return  InnerClass.instance;
    }

}