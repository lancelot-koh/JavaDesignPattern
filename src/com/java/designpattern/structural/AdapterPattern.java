package com.java.designpattern.structural;

/**
 * Created by i077407 on 8/5/17.
 */
public class AdapterPattern {
}

// Object Adapter
abstract class Target {
    public abstract void request();
}

abstract class Adaptee {
    public abstract void specificRequest();
}


class Adapter extends Target {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    public void request(){
        this.adaptee.specificRequest();
    }

}

// class adapter
interface Target2 {
    public void request();
}

abstract class Adaptee2 {
    public abstract void specificRequest();
}

class Adapter2 extends Adaptee2 implements Target2 {

    public void request() {
        specificRequest();
    }

    public void specificRequest() {
        System.out.println("special request");
    }

}

//double  adapter
interface Target3{
    public void request();
}

interface Adaptee3 {
    public void specificRequest();
}


class Adapter3 implements Target3, Adaptee3 {

    private Target3 target3;
    private Adaptee3 adaptee3;

    public Adapter3(Target3 target3){
        this.target3 = target3;
    }


    public Adapter3(Adaptee3 adaptee3){
        this.adaptee3 = adaptee3;
    }

    public void request(){
        this.adaptee3.specificRequest();
    }

    public void specificRequest(){
        this.target3.request();
    }

}