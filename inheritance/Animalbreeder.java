package inheritance;

public class Animalbreeder {

//    public String getName(Cat cat){
//        String name = null;
//        name = cat.name;
//        return name;
//    }
//    public String getName(Dog dog){
//        String name = null;
//        name = dog.name;
//        return name;
//    }
    public String getName(Animal animal){
        return animal.name;
    }

    public void bark2(Animal animal){
        System.out.println(animal.bark());
    }

//    public Cat setAge(Cat cat, int i) {
//        cat.age = i;
//        return cat;
//    }
//
//    public Dog setAge(Dog dog, int i) {
//        dog.age = i;
//        return dog;
//    }

    public Animal setAge(Animal animal, int i) {
        animal.age = i;
        return animal;
    }

}
