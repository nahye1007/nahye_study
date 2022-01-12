package interfaces;

//제한자, interface, 이름
//제한자, class, 이름
public interface Breed {

    //제한자 리턴타입 함수명(파라미터타입 파라미터이름); 코드블록 없음
    void setAge(Animal animal, int age);
    int getAge(Animal animal);

    String getName(Animal animal);
    void setName(Animal animal, String name);

}
