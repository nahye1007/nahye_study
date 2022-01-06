package inheritance;

public class Dog extends Animal{

    //함수, 메쏘드
    @Override
    public String bark(){
        String voice = "왈왈";//지역변수
        return voice;

    }

    @Override
    public void setAge(int age) {

    }

}
