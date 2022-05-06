package lesson6;

public abstract class Animal {
    protected String name;
    protected String breed;
    protected String color;
    protected int limitRun;
    protected int limitSwim;
    protected String animal;


    public  Animal(String name,String breed,String color) {
        this.name = name;
        this.breed = breed;
        this.color = color;

    }

    public void animalInfo(){
        System.out.println(animal+ " " + name + " порода " + breed + " цвет " + color+ " может пробежать: " + limitRun + " м. и может проплыть: "
                + limitSwim + "м.");
    }

    public void run(int distance) {
        if (this.limitRun >= distance) {
            System.out.println(animal + " " + name + " пробегает: " + distance + " м.");
        } else {
            System.out.println(animal + " " + name + " не может бегать так далеко");
        }
    }

    public abstract void swim(int distance) ;

}
