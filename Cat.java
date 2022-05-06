package lesson6;

public class Cat extends Animal {
    public Cat(String name, String breed, String color) {
        super(name, breed, color);
        this.animal = "Кот";
        this.limitRun = 200;

    }

    @Override
     public void swim(int distance) {
        System.out.println("Коты не любят плавать");
    }
}