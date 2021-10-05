import java.util.Random;
import java.util.Scanner;


public class Game {
    public static void main(String[] args) {
        gameModeForCatPlusDog();
    }
    public static int getRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }

    // Creates a new object for tamagotchi

    public static Tamagotchi petInitializer(String inputName, int petStartEnergy, boolean inputFromUser){
        return (inputFromUser)? new Dog(inputName,getRandomNumber(0,20),petStartEnergy):
                new Cat(inputName,getRandomNumber(0,20),petStartEnergy);
    }

    // This is the game for playing with the tamagotchi

    public static void gameModeForCatPlusDog() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, what would you like to play? Press 1 for dog and 2 for cat.");
        boolean inputChoiceFromUser = 1 == scanner.nextInt();
        System.out.println("Good choice, what's your pet's name?");
        System.out.println(scanner.nextLine());
        String inputPetName = scanner.nextLine();
        int petEnergy = getRandomNumber(8, 20);
        int timerCounter = 30;
        Tamagotchi pet = petInitializer(inputPetName, petEnergy, inputChoiceFromUser);
        System.out.println(inputPetName + " has " + petEnergy + " in energy!");

        // After pet-initializer the game is run through a do - while loop

        do {
            TimerDemo gameTimer = new TimerDemo(timerCounter);
            String petMood = pet.getMoodFromTamagotchi();
            System.out.println(petMood);
            System.out.println("What would you like to do?\n1 - play\n2 - feed\n3 - sleep");
            int petAction = scanner.nextInt();
            System.out.println(pet.getMoveResponse(pet.name, petAction));
            // This is the game mechanics that utilizes pet.energy and the timecounter
            if (petAction == 1) {
                pet.energy -= 6;
                timerCounter += 10;
            } else if (petAction == 2) {
                pet.energy += 2;
            } else {
                pet.energy += 4;
                timerCounter -= 10;
            }
            if (pet.energy == 5) {
                System.out.println("your pet needs some energy!");
            }
            System.out.println("Your score is: " + (timerCounter + pet.energy));

            // The game ends when the tamagotchi energy is zero or the timer is up

        } while (pet.energy > 0);
        }
    }




