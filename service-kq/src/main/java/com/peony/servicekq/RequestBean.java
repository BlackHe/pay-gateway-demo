package com.peony.servicekq;


public class RequestBean {

    private String name;
    private String age;
    private String idCard;

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "RequestBean{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", idCard='" + idCard + '\'' +
                '}';
    }
}
