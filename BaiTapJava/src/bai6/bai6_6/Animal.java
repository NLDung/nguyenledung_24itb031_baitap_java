package bai6.bai6_6;

public abstract class Animal {
    protected String name;
    public Animal(String name) {
        this.name = name;
    }
    public abstract void greets();
}