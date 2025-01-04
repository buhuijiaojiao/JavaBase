package reflectMethod;

import java.io.IOException;

public class Dog {
    private String name;
    private int age;
    private String color;

    public Dog() {
    }

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     *
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * 设置
     *
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "Dog{name = " + name + ", age = " + age + ", color = " + color + "}";
    }

    public void bark() {
        System.out.println("Dog bark");
    }

    protected void eat(String food) {
        System.out.println("Dog eat " + food);
    }

    private void sleep() throws InterruptedException, IOException {
        {
            System.out.println("Dog sleep");
        }
    }
}