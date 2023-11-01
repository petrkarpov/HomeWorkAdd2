package Work5;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("vasiliy", 8, 15);
        System.out.println("вес: " + cat.getWeight());
        System.out.println("возраст: " + cat.getAge());
        System.out.println("имя: " + cat.getName());
    }
}