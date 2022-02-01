package B;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal() {
            @Override
            public void voice() {
                System.out.println("voice");
            }
        };

        Animal animal1 = new Dog();
        animal1.voice();

        Batman b = new Batman();
        Hero h = b;
        CanFight c = b;

        CustomeDog customeDog = new CustomeDog();
        customeDog.sum(1,2);

       CanFly canFly = ()->{
           System.out.println("canfly");
       };

    }
}
