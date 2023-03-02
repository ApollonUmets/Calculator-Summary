import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scaneer = new Scanner(System.in);
        System.out.println("Введите первый аргумен >");
        int argument1 = scaneer.nextInt();
        int result = argument1;
        char sign;
        do {
            do{

            System.out.println("Введите знак операции >");
            sign = scaneer.next().charAt(0);
        } while (sign != '+' && sign != '-' && sign != '=');

            if (sign != '=') {

                int argument2 = 0;
                boolean isArgumentDigit = true;
                do {

                System.out.println("Введите очередной аргумент >");
                    String arg = scaneer.next();
                    try {
                        argument2 = Integer.parseInt(arg);
                        isArgumentDigit = true;
                } catch (NumberFormatException e) {
                    isArgumentDigit = false;
                }

            } while (!isArgumentDigit);

                switch (sign) {
                    case '+':
                        result = result + argument2;
                        break;
                    case '-':
                        result = result - argument2;
                        break;

                }

            }
        } while (sign != '=') ;
            System.out.println("Результат = " + result);


        }
    }




