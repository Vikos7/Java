package lesson5;

public class Worker {

    String name;
    String position;
    String email;
    String phone;
    int salary;
    int age;

    public Worker(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;

    }

     public void printInfo(){
        System.out.println("name: " + name + "| position: " + position +"| email: " + email + "| phone: " + phone + "| salary = " + salary);
    }

        public static void getInformation() {
        Worker[] persArray = new Worker[5];
        persArray[0] = new Worker("Олег", "Рукодитель отдела доставки", "chief@tkmers.com", "+79998884444", 120000, 38);
        persArray[1] = new Worker("Вячеслав", "Механик", "mechanic@tkmers.com", "+79997773333", 90000, 45);
        persArray[2] = new Worker("Мария", "Диспетчер", "dispatcher@tkmers.com", "+79996662222", 35000, 33);
        persArray[3] = new Worker("Ольга", "Логист", "logist@tkmers.com", "+79992221111", 45000, 25);
        persArray[4] = new Worker("Алексей", "Водитель", "driver@tkmers.com", "+79995558888", 80000, 52);

        for (int i = 0; i < persArray.length; i++)
            if (persArray[i].age > 40) persArray[i].printInfo();
    }

    public static void main(String[] args)  {
        System.out.println("Сотрудник: ");
        Worker worker2 = new Worker("Олег", "Рукодитель отдела доставки", "chief@tkmers.com", "+79998884444", 120000, 38);
        System.out.println("\n name: " + worker2.name + "\n position: " + worker2.position +"\n email: " + worker2.email + "\n phone: " + worker2.phone + "\n salary = " + worker2.salary);
        System.out.println("Информация о сотрудниках старше 40 лет:");
        getInformation();

    }

}

