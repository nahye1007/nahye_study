
public class HumanManagerAge{
    public static void main(String[] args){
        HumanAge h = new HumanAge();//붕어빵 한개를 만들었어
        h.run();
        Integer hAge = h.age;
        System.out.println(hAge);//null
        h.age = 18;
        Integer hAge2 = h.age;
        System.out.println(hAge2);//18
        Integer hAge3 = h.age();
        System.out.println(hAge3);//18

        h = new HumanAge();
        Integer hAge4 = h.age;
        System.out.println(hAge4); // null
        h = new HumanAge(25);//함수, 생성자, 자동으로 파라미터타입과 갯수가 동일한 걸 찾아가서 실행시킴
        System.out.println(h.age);//25
        System.out.println(h.age());//25
        System.out.println(h.age2());//22
        System.out.println(h.age3());//25
        System.out.println(h.age4());//24
        //과제2
        //human int 타입 age변수 생성
        //생성자 만들기(int age)
        //객체 생성해서 Sysout()h.age,
    }
}