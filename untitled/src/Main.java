import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("Ingresar numero 1: ");
        num1 = scanner.nextInt();
        System.out.println("Ingresar numero 2: ");
        num2 = scanner.nextInt();
        if(num2 > num1) {
            System.out.println("El numero " + num2 + " es mayor que el numero " + num1);
        }
        else {
            if (num1 == num2) {
                System.out.println("Los numeros son iguales");
            }
            else {
                System.out.println("El numero " + num1 + " es mayor" );
            }
        }
    }
}