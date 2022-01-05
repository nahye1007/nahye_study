public class HumanAge{

    public Integer age; //변수 = 상태값, String 타입을 가진 name이라는 이름의 변수
    //변수의 선언, 아직 초기화 안됨
    //클래스 변수, 인스턴스 변수, 멤버변수

    //함수
    public void run(){

    }

    //함수 문법
    //제한자 / 리턴타입 / 함수명(파람1, 파람2 ,......){
    //
    public Integer age(){
        return this.age;
    }

    //리턴타입은 String, 함수명은 name2
    public Integer age2(){
        Integer age2 = 22; //변수는 코드블록 안에서만 사용, 지역변수
        return age2;
    }

    //25
    public Integer age3(){
        Integer age = 23;
        return this.age;
    }

    //24
    public Integer age4(){
        age = 24;
        return age;
    }

    //생성자
    public HumanAge(){
    }

    //생성자 오버로딩
    public HumanAge(Integer age2){
        this.age = age2;//initializing
    }
}