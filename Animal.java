class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

class Fox extends Animal {
    void sound() {
        System.out.println("Fox sounds");
    }
}

class Rabbit extends Animal {
    void sound() {
        System.out.println("Rabbit sounds");
    }
}

class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        Fox f = new Fox();
        Rabbit r = new Rabbit();

        d.sound();
        f.sound();
        r.sound();
    }
}
