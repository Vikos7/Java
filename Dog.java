package lesson6;

public class Dog extends Animal{
    public Dog(String name,String breed, String color) {
        super(name,breed,color);
        this.animal = "Собака";
        this.limitRun = 500;
        this.limitSwim = 10;
    }

    @Override
    public  void swim(int distance) {
        if (this.limitSwim >= distance) {
            System.out.println(animal + " " + name + " проплывает: " + distance + " м.");
        } else {
            System.out.println(animal + " " + name + " не может плавать так далеко");
    }
        }

}
