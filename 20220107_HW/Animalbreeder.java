package homework;

public class Animalbreeder {

  public String getName(Animal animal){
      return animal.name;
  }

  public void bark2(Animal animal){
      System.out.println(animal.bark());
  }

  public Animal setAge(Animal animal, int i) {
      animal.age = i;
      return animal;
  }

  public Animal setEye(Animal animal, int z) {

      animal.eye.count = z;
      return animal;
  }
  
  public int getEye(Animal animal){
      return animal.eye.count;
  }
}