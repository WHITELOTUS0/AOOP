public class Animal {
    public void eat(){
        System.out.println("Animal eats");
    }
}

class Cat extends Animal{ 

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();

    }
}
