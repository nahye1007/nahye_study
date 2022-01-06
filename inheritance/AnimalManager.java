package inheritance;

import java.lang.invoke.SwitchPoint;
import java.util.ArrayList;

public class AnimalManager {

    public static void main(String[] args){

        Animalbreeder animalbreeder = new Animalbreeder();

        Cat cat = new Cat();
        cat.name = "야옹이";

        String name = animalbreeder.getName(cat);
        System.out.println(name);//야옹이

        Dog dog = new Dog();
        dog.name = "멍멍이";
        String dogName = animalbreeder.getName(dog);
        System.out.println(dogName);//멍멍이

        System.out.println("----------------------------");

        String catName2 = animalbreeder.getName(cat);
        System.out.println(catName2);//야옹이
        animalbreeder.bark2(cat);//동물울음소리
        Animal agedCat = animalbreeder.setAge(cat, 3);
        System.out.println(agedCat.age);

        String dogName2 = animalbreeder.getName(dog);
        System.out.println(dogName2);//멍멍이
        animalbreeder.bark2(dog);//왈왈
        Animal agedDog = animalbreeder.setAge(dog, 6);
        System.out.println(agedDog.age);

        //OOP 객체기반 프로그래밍
        //재사용성이 높다는게 장점
        //상속은 왜 사용한다? 코드 재사용성과 간소화, 무의미한 반복을 줄일수가 있다.
        //상속 어떻게 한다?
        //public class 클래스명 extends 부모클래스명

//        Dog dog = new Dog();
//        dog.bark();
//
//        Cat cat = new Cat();
//        cat.bark();
//
//        Duck duck = new Duck();
//        duck.bark();
//        System.out.println("----------------------------");
//        //객체 생성할 때는
//        //클래스 변수명 = new 생성자; //오류가 안나
////
////
////        Animal cat2 = new Cat();
////        cat2.bark();
////
////        System.out.println(cat2.bark());
//
        Animal cat2 = new Cat();
        String catName = cat2.name;
        int catAge = cat2.age;
        cat2.bark();
        //cat2.grooming();
        //클래스는 붕어빵틀, 객체는 붕어빵
        //붕어빵틀로 슈, 팥
        //stack, heap

//
//        Cat cat3 = (Cat)cat2;
//        cat3.grooming();
//
//        ArrayList<Animal> arr = new ArrayList();
//
//        arr.add(dog);
//        arr.add(cat);
//        arr.add(duck);
//
//        System.out.println(arr);
//
//        for(Animal animal : arr){
//            System.out.println(animal.bark());
//        }

    }


}
