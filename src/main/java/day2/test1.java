package day2;

public class test1 {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.color="1";
        dog1.name="小白";
        dog1.run();

        Dog dog2=new Dog();
        dog2.color="black";
        dog2.name="小黑";
        dog2.run();

    }
}
class Dog{
    String color;
    String name;
    void run(){
        System.out.println(name+" "+"跑开了");
    }
}