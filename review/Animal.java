package review;

//상속? 왜쓴다? 코드를 간소화하고 재사용하기 위해서
//접근제한자, class 클래스명
public class Animal {

    //제한자(public, default, protected, private), 변수타입(클래스), 변수명
    private String name = null;//초기화(리셋 X)
    private int age = 0;

    //제한자, 리턴타입(class), 함수명(파라미터타입 파라미터이름){}
    public String getName(){//{}안에 있는 코드를 실행한다.
        return this.name;//결과값으로 반환
    }
    public void setName(String name){
        this.name = name;
    }
    //생성자
    public Animal(){

    }

    //생성자 오버로딩
    //new 로 객체를 생성하면서 변수를 한번에 초기화해주기 위함
    //Dog dog = new Dog();
    //dog.name = "왈왈";
    //Dog dog = new Dog("왈왈");
    public Animal(String name){
        this.name = name;
    }

    //생성자 오버로딩
    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

}
