import java.util.Scanner;
 
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to the Gym and Fitness Center!");
        while (true) {
            System.out.println("Would you like to get started? [Y/N]");
            String input = in.nextLine();
            if (input.equalsIgnoreCase("Y")) {
                System.out.println("Let's get you started!");
                // Code to start program
                chooseWorkoutProgram();
            } else if (input.equalsIgnoreCase("N")) {
                System.out.println("No problem. See you soon!");
                break;
            } else {
                System.out.println("Invalid input. Please try again.");
            }
        }
    }
 
    public static void chooseWorkoutProgram() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please choose one of the following workout programs:");
        System.out.println("1: Strength Training");
        System.out.println("2: Cardio");
        System.out.println("3: Circuit Training");
        System.out.println("4: HIIT");
        String program = in.nextLine();
        switch (program) {
            case "1": 
                // Code for Strength Training program
                strengthTrainingProgram();
                break;
            case "2":
                // Code for Cardio program
                cardioProgram();
                break;
            case "3":
                // Code for Circuit Training program
                circuitTrainingProgram();
                break;
            case "4":
                // Code for HIIT program
                hiitProgram();
                break;
            default:
                System.out.println("Invalid input. Please try again.");
                chooseWorkoutProgram();
                break;
        }
    }
 
    public static void strengthTrainingProgram() {
        System.out.println("You have chosen the Strength Training Program.");
        // Code for Strength Training program
    }
 
    public static void cardioProgram() {
        System.out.println("You have chosen the Cardio Program.");
        // Code for Cardio program
    }
 
    public static void circuitTrainingProgram() {
        System.out.println("You have chosen the Circuit Training Program.");
        // Code for Circuit Training program
    }
 
    public static void hiitProgram() {
        System.out.println("You have chosen the HIIT Program.");
        // Code for HIIT program
    }
 
    public static void endOfProgram() {
        Scanner in = new Scanner(System.in);
        System.out.println("Would you like to end the program? [Y/N]");
        String input = in.nextLine();
        if (input.equalsIgnoreCase("Y")) {
            System.out.println("Thank you for using the program. Have a great day!");
            // End program
        } else if (input.equalsIgnoreCase("N")) {
            System.out.println("No problem. Let's continue.");
            // Continue program
        } else {
            System.out.println("Invalid input. Please try again.");
            endOfProgram();
        }
    }
}