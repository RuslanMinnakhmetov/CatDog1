public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.sayHello());

        Dog dog = new Dog();
        System.out.println(dog.catchCat());
        System.out.println(dog.sayHello());
    }
}
