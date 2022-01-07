package inheritance;

//추상클래스 VS 인터페이스
public abstract class Animal {

    public String name = "동물";
    public int age = 1;
    public Eye eye = null;

    public String bark(){
        return "동물울음소리";
        //System.out.println("동물울음소리");
    }

    //제한자 리턴타입 함수명(파라미터타입 파라미터명){}
    public abstract void setAge(int age);

}
