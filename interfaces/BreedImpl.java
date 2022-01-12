package interfaces;

public class BreedImpl implements Breed{

    @Override
    public void setAge(Animal animal, int age) {
        animal.age = age;
    }

    @Override
    public int getAge(Animal animal) {
        return animal.age;
    }

    @Override
    public String getName(Animal animal) {
        return animal.name;
    }

    @Override
    public void setName(Animal animal, String name) {
        animal.name = name;
    }
}
