public class Main {
    public static void main(String[] args) {
        Animal dog = createObject("Dog");
        Animal cat = createObject("Cat");
        Animal cow = createObject("Cow");
        dog.print();
        cat.print();
        cow.print();

    }

    public static Animal createObject(String name){
        switch (name) {
            case "Dog":
                Dog dog = new Dog(10, "Дворняга");
                return dog;
            case "Cat":
                Cat cat = new Cat(7, true);
                return cat;
            case "Cow":
                Cow cow = new Cow(14,true);
                return cow;

        }
        return null;
    }
}