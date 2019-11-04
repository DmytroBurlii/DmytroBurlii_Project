import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float num_1, num_2;
        char sym, ask;
        boolean bool = true;

        while (bool==true){
            System.out.print("Введите первое число: ");
            num_1 = scanner.nextFloat();
            System.out.print("Введите второе число: ");
            num_2 = scanner.nextFloat();
            System.out.print("Какое действие выполнить [+,-,*,/,%]: ");
            sym = scanner.next().charAt(0);
            switch (sym){
                case '+':
                    System.out.println(num_1 + " + " + num_2 + " = " + (num_1+num_2));
                    break;
                case '-':
                    System.out.println(num_1 + " - " + num_2 + " = " + (num_1-num_2));
                    break;
                case '*':
                    System.out.println(num_1 + " * " + num_2 + " = " + (num_1*num_2));
                    break;
                case '/':
                    System.out.println(num_1 + " / " + num_2 + " = " + (num_1*num_2));
                    break;
                case '%':
                    System.out.println(num_1 + "(mod" + num_2 + ") = " + (num_1%num_2));
                    break;
            }
            System.out.print("Хотите опробовать еще раз? [y/n]: ");
            ask = scanner.next().charAt(0);
            if (ask=='n'){
                bool = false;
            }
        }

    }
}
