/*
  메인함수 만들고
  Human 객체 생성
  
  
  */


public class HumanManager{
  //메인함수
  public static void main(String[] args){
   
    /*
      붕어빵과 붕어빵틀의 관계
      class 붕어빵틀
      object 붕어빵, 여러개를 찍을 수 있음
    */
    //객체 생성 문법 : 타입 변수명 = new 생성자
    Human h = new Human();//붕어빵 한개를 만들었어
    h.run();
    String hName = h.name; 
    System.out.println(hName);//자바 내장 함수, 콘솔에 텍스트를 찍는다
    h.name = "김나혜";
    String hName2 = h.name;
    System.out.println(hName2);//김나혜
    String hName3 = h.name();
    System.out.println(hName3);//김나혜
    
    h = new Human();
    String hName4 = h.name;
    //System.out.println("hName4");
    System.out.println(hName4);// ""
    
    h = new Human("김나혜2");//함수, 생성자, 자동으로 파라미터타입과 갯수가 동일한 걸 찾아가서 실행시킴, "김나혜" => String 
    System.out.println(h.name);//김나혜
    System.out.println(h.name());//김나혜
    System.out.println(h.name2());//김나혜2
    System.out.println(h.name3());//김나혜
    
    //과제2
    //human int 타입 age변수 생성
    //생성자 만들기(int age)
    //객체 생성해서 Sysout()h.age, 
    
    
    
  }
  
  
  
  
}
