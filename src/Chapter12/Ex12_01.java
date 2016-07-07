package Chapter12;

/**
 (NumberFormatException) Listing 7.9, Calculator.java, is a simple command- line calculator. Note that the program terminates
 if any operand is nonnumeric. Write a program with an exception handler that deals with nonnumeric operands; then write
 another program without using an exception handler to achieve the same objective. Your program should display a message that
 informs the user of the wrong operand type before exiting (see Figure 12.12).
 */

public class Ex12_01 {
    public static void main(String[] args) throws IllegalArgumentException {

        if (args.length != 3) {
            System.out.println("Usage: java Calculator operand1 operator operand2");
            System.exit(0);
        }

        int result = 0;

        try {
            switch (args[1].charAt(0)) {
                case '+':
                    result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
                    break;
                case '-':
                    result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
                    break;
                case '*':
                    result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
                    break;
                case '/':
                    result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
                    break;
            }
            System.out.println(args[0] + " " + args[1].charAt(0) + " " + args[2] + " = " + result);
        } catch (IllegalArgumentException ex) {
            if (!args[0].matches("\\d+")) {
                System.out.print("Wrong input: ");
                System.out.println(args[0]);
            }
            if (!args[2].matches("\\d+")) {
                System.out.print("Wrong input: ");
                System.out.println(args[2]);
            }
        }
    }
}
