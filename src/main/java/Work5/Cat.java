package Work5;

public class Cat {
    private String name;    //найденая ошибка
    private int age;        //найденная ошибка
    private int weight;     //найденная ошибка

    public Cat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
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

    public int getWeight() {    //найденная ошибка

        return weight;
    }

    public void setWeight(int weight) { //найденная ошибка

        this.weight = weight;
    }
}