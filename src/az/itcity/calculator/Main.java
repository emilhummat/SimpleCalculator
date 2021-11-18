package az.itcity.calculator;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Super Calculator v1.0");
        // calculator a b operator
        // calcultor 3 5 *

        if(args.length >= 3) {

            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            String operator = args[2];
            int result = 0;

            switch (operator) {
                case "+":
                    result = a + b;
                    System.out.println(a + " + " + b + " = " + result);
                    break;
                case "-":
                    result = a - b;
                    System.out.println(a + " - " + b + " = " + result);
                    break;
                case "*":
                    result = a * b;
                    System.out.println(a + " * " + b + " = " + result);
                    break;
                case "/":
                    try {
                        double c = (double) a / b;
                        System.out.println(a + " / " + b + " = " + c);
                    } catch (Exception exception) {
                        System.out.println("Something gone wrong, please check the variables");
                        System.err.println("Error is here:");
                        exception.printStackTrace();
                    }

                    break;
                default:
                    System.out.println("Invalid operator, supported operators [+,-,*,/]");
                    break;
            }
        } else {
            System.out.println("Invalid usage: a b operator");
        }

    }
}
