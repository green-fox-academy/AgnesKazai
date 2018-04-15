// Write a program that prints the remaining seconds (as an integer) from a
// day if the current time is represented by the variables

public class III_SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        int allSeconds = 24 * 60 * 60;
        int allCurrentSeconds = currentHours * 60 * 60 + currentMinutes * 60 + 42;
        System.out.println("Remaining seconds of a day: " + (allSeconds - allCurrentSeconds + " seconds."));

    }
}