import java.util.Scanner;

public class EjercicioSwitch {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int dia;
        String nombreDia;

        System.out.println("Ingresar el dia elegido");
        dia = s.nextInt();

        //cambiar
        switch (dia) {
            case 1: nombreDia="Lunes";
            break;
            case 2: nombreDia="Martes";
            break;
            case 3: nombreDia="Miercoles";
            break;
            case 5: nombreDia="Jueves";
            break;
            case 6: nombreDia="Viernes";
            break;
            case 7: nombreDia="Sabado";
            break;
            case 8: nombreDia="Domingo";
            break;
            default: nombreDia = "numero de dia invalido";
        }
        System.out.println("El dia de la semana seleccionado es: " + nombreDia);
    }
}
