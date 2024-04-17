package com.jungmin;

public class MenuItem {
    private String name;
    private int price;
    private int id;

    public MenuItem(String name, int price, int id) {
        this.name = name;
        this.price = price;
        this.id = id;
    }

    public MenuItem() {

    }


    public String getName() {
        return name;
    }
    public  void setName(String name){
        this.name = name;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public int getId(int i) {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
