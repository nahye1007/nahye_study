package interfaces;

public class BreedManager {

    public static void main(String[] args){

        //클래스와는 다르게 생성을 해야함
        //인터페이스는 객체를 만들 수가 없어.
        Breed breed = new BreedImpl();
        Dog dog = new Dog();
        breed.setName(dog, "멍멍이");
        breed.setAge(dog, 1);

        System.out.println(dog.name);
        System.out.println(dog.age);

        Cat cat = new Cat();
        breed.setName(cat, "야옹이");
        breed.setAge(cat, 1);

        //이게 고양인지
        //개인지
//        if(cat instanceof Cat) {
//            //고양이
//            //{}
//            TenBreedImpl tenBreedImple = new TenBreedImpl();
//            tenBreedImple.setAge(cat, 1);
//            System.out.println(cat.age);
//        }

        BreedFactory factory = new BreedFactory();
        Breed breed1 = factory.getBreed(cat);
        breed1.setAge(cat, 2);
        System.out.println(cat.age);


        //BreedImpl
        //TenBreedImpl





    }

}
