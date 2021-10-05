import java.util.Scanner;

public class Dog extends Tamagotchi {
    private String name;

    public Dog(String name, int energy,int mood) {
        super(name, mood, energy);
    }


    @Override
    public String getMoveResponse(String name, int petAction) {
        return (petAction == 1) ? name + " is running after a ball and " + name + " lost 6 in energy"
                : (petAction == 2) ? name + " was hungry, and " + name + " got 2 in energy"
                : name + " lost a lot of energy and wants to sleep and will get 6 in energy";

    }

}
