package ru.mirea.jprw1.ex1;

public class TestDog {
    public static void main(String[] args) {
        Dog d1 = new Dog("Alaya", 4);
        Dog d2 = new Dog("Lexa", 8);
        Dog d3 = new Dog("Alex");
        d3.setAge(2);
        d3.intoHumanAge();
        d2.intoHumanAge();
        d1.intoHumanAge();
    }
}
