package Task2;

import java.io.Serializable;

public class Animal implements Serializable {
    public String name = "Woolf";
    int age = 5;
    private double veight = 3.4;

    public Animal() {
    }

    public Animal(String name, int age, double veight) {
        this.name = name;
        this.age = age;
        this.veight = veight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getVeight() {
        return veight;
    }

    public void setVeight(double veight) {
        this.veight = veight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", veight=" + veight +
                '}';
    }
}
