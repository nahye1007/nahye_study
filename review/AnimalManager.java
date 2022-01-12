package review;

public class AnimalManager {

    public static void main(String[] args){

//        Animal dog = new Dog();
//        Animal cat = new Cat();
//        Animal Duck = new Duck();

        Dog dog = new Dog("왈왈");
        //생성자 초기화 해주거나
        //dog, animal 함수를 만들어서 가져오기
        //dog.name = "왈왈";
        //System.out.println(dog.name);
        System.out.println(dog.getName());
        dog.setName("멍멍이");




    }

}
