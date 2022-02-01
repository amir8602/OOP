package B;
@FunctionalInterface
public interface IAnimal {

    void move();


    default int sum(int i , int j){
        return i+j;
    }



}
