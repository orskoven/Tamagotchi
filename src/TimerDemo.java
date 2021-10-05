import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;


// Koden er fra https://stackoverflow.com/questions/5710911/i-want-to-implement-a-timer-for-a-game-java
public class TimerDemo {
    Toolkit toolkit;

    Timer timer;

    public TimerDemo(int seconds) {
        toolkit = Toolkit.getDefaultToolkit();
        timer = new Timer();
        timer.schedule(new RemindTask(), seconds * 1000);
    }

    class RemindTask extends TimerTask {
        public void run() {
            System.out.println("Your Pet is dead");
            toolkit.beep();
            System.exit(0);
        }
    }

    public static void main(String args[]) {
        System.out.println("About to schedule task.");
        new TimerDemo(30);
        System.out.println("Task scheduled.");
    }

    @Override
    public String toString() {
        return "TimerDemo{" +
                "toolkit=" + toolkit +
                ", timer=" + timer +
                '}';
    }
}