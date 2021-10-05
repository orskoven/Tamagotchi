import java.util.Random;
import java.util.Scanner;
import java.util.Timer;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public abstract class Tamagotchi {
    public String name;
    public int energy;
    public int mood;

    public Tamagotchi(String name,int mood, int energy) {
        this.name = name;
        this.energy = energy;
        this.mood = mood;

    }

    public boolean isAsleep() {
        return mood + energy < 20;
    }

    public boolean isPlayful() {
        return mood + energy > 25;
    }

    public String getMoodFromTamagotchi() {
        return (this.isAsleep()) ? this.name + " wants to sleep"
                : (this.isPlayful()) ? this.name + " wants to play a game"
                : this.name + " is neither tired or playful";
    }


    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", mood=" + mood +
                ", energy=" + energy +
                '}';
    }


    public abstract String getMoveResponse(String name, int petAction);
}



