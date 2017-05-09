package com.java.designpattern.creation;



import java.io.*;

/**
 * Created by i077407 on 8/5/17.
 */
public class Prototype {
}


class WeekLog_S implements Cloneable {
    private String name;
    private String date;
    private String content;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public WeekLog_S clone() {
        java.lang.Object obj = null;

        try {
            obj = super.clone();
            return (WeekLog_S)obj;

        } catch (CloneNotSupportedException e) {
            System.out.println("not support clone");
            return null;
        }

    }

}

class WeekLog_D implements Serializable {
    private String name;
    private String date;
    private String content;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public WeekLog_D deep_clone() throws IOException, ClassNotFoundException {

        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bao);
        oos.writeObject(this);


        ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);

        return (WeekLog_D)ois.readObject();


    }

}