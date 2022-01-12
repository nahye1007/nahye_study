package homework;
import java.lang.invoke.SwitchPoint;
import java.util.ArrayList;

public class AnimalManager {

    public static void main(String[] args){

        Animalbreeder animalbreeder = new Animalbreeder();
        Cat cat = new Cat();
        cat.name = "야옹";

        String name = animalbreeder.getName(cat);
        System.out.println(name);

        Dog dog = new Dog();
        Duck duck = new Duck();
        dog.name = "멍멍";
        String dogName = animalbreeder.getName(dog);
        System.out.println(dogName);

        System.out.println("----------------------");

        String catName2 = animalbreeder.getName(cat);
        System.out.println(catName2);
        animalbreeder.bark2(cat);
        Animal agedCat = animalbreeder.setAge(cat, 3);
        System.out.println(agedCat.age);

        String dogName2 = animalbreeder.getName(dog);
        System.out.println(dogName2);
        animalbreeder.bark2(dog);
        
        Animal agedDog = animalbreeder.setAge(dog, 6);
        System.out.println(agedDog.age);
        
        Animal cat2 = new Cat();
        String catName = cat2.name;
        
        int catAge = cat2.age;
        cat2.bark();
        

        System.out.println("----------------------");
        
        
        Animal catEye = animalbreeder.setEye(cat, 6);
        Animal duckEye = animalbreeder.setEye(duck, 8);
//        System.out.println(catEye.eye);
//        System.out.println(duckEye.eye);
//        Animal cat3 = new Cat();
//        Animal catEye = animalbreeder.setEye(cat, 6);
        System.out.println("눈의 갯수는 " + cat.eye.count + "개 입니다.");
        System.out.println("눈의 갯수는 " + dog.eye.count + "개 입니다.");
        System.out.println("눈의 갯수는 " + duck.eye.count + "개 입니다.");
    }
}