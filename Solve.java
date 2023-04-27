
class Animal {
    public void MakeSound() {
        System.out.println("Iam an Animal And this is my sound");
    }
}

class Dog extends Animal {
    @Override
    public void MakeSound() {
        System.out.println("Haw Haw");
    }
}

class Cat extends Animal {
    @Override
    public void MakeSound() {
        System.out.println("Meow Meow");
    }
}

class Bird extends Animal {
    @Override
    public void MakeSound() {
        System.out.println("Sew Sew");
    }
}


public class Solve {
//    public static void FunForDog(Dog dog)
//    {
//        dog.MakeSound();
//    }
//    public static void FunForCat(Cat cat)
//    {
//        cat.MakeSound();
//    }
//    public static void FunForBird(Bird bird)
//    {
//        bird.MakeSound();
//    }

    // Good Practicing To Follow To Achieve Clean Code
    public static void Generic(Animal animal) {
        animal.MakeSound();
    }

    public static void main(String[] args) {
        Generic(new Bird()); // Anonymous Object
        Generic(new Cat()); // Anonymous Object
        Generic(new Bird()); // Anonymous Object
        Generic(new Animal()); // Anonymous Object
    }
}
