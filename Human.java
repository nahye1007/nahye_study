/*
   name 문자열 변수
   run 함수
   Human 클래스 생성
*/

public class Human{

   //변수의 선언, 아직 초기화 안됨
   //클래스 변수, 인스턴스 변수, 멤버변수
    public String name;
    
    //함수
    public void run(){
    
    }
    
   //함수 문법
   //제한자 / 리턴타입 / 함수명(파람1, 파람2 ,......){
   //}
   public String name(){
      return this.name;
      
   }
   
   //리턴타입은 String, 함수명은 name2
   public String name2(){
      String name2 = "김나혜2";//변수는 코드블록 안에서만 사용, 지역변수
      return name2;
            
   }
   
   //김나혜
   public String name3(){
      //name2 = "김나혜2.5";//undefined 변수 ~~~~
      String name = "김나혜3";
      return this.name;
   }
   
   //김나혜4
   public String name4(){
      name = "김나혜4";
      return name;
   }
     
   
   
    //생성자
    public Human(){
    
    }
   
   //생성자 오버로딩
    public Human(String name2){
      this.name = name2;//initializing
    }
   
   

}
