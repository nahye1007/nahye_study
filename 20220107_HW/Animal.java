package homework;

public abstract class Animal{
    public String name = "동물";
    public int age = 1;
    public Eye eye = new Eye();

    public String bark(){
        return "동물울음소리";
    }


    public abstract void setAge(int age);

    public void setEye(int eye_count){
        eye.count = eye_count;

    }

}
