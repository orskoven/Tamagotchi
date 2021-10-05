public class Cat extends Tamagotchi{
    public String name;
    public Cat(String name,int mood, int energy) {
        super(name, mood, energy);
    }

    @Override
    public String moveResponse(String name,  int petAction) {
        return (petAction == 1) ? name + " is running after a mouse and " + name + " lost 6 in energy"
                : (petAction == 2) ? name + " was hungry, and " + name + " got 2 in energy"
                : name + " lost a lot of energy and wants to sleep and will get 6 in energy";

    }
    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", name='" + name + '\'' +
                ", mood=" + mood +
                ", energy=" + energy +
                '}';
    }
}
