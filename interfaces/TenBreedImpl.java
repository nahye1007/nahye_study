package interfaces;

public class TenBreedImpl implements Breed{
    @Override
    public void setAge(Animal animal, int age) {
        animal.age = age * 10;
    }

    @Override
    public int getAge(Animal animal) {
        return 0;
    }

    @Override
    public String getName(Animal animal) {
        return null;
    }

    @Override
    public void setName(Animal animal, String name) {

    }
}
