package guru.qa;

import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        if (currentTime.isBefore(LocalTime.of(6, 0))) {
            System.out.println("Good night!");
        } else if (currentTime.isBefore(LocalTime.of(10, 0))) {
            System.out.println("Good morning!");
        } else if (currentTime.isBefore(LocalTime.of(18, 0))) {
            System.out.println("Good day!");
        } else {
            System.out.println("Good evening!");
        }
    }
}
