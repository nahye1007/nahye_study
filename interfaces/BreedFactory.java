package interfaces;

public class BreedFactory {

    public Breed getBreed(Animal animal){

        if(animal instanceof Cat){
            return new TenBreedImpl();
        }
        return new BreedImpl();

    }

}
