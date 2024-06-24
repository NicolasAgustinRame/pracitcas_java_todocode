import java.util.Scanner;

public class CalcularSueldo {
   Empleado empleado = new Empleado();
   public void Calculo(){
       Scanner s = new Scanner(System.in);
       System.out.println("Ingresar puesto del Empleado: ");
       empleado.puesto = s.next();

       if (empleado.puesto.equals("Repositores")) {
           empleado.sueldo = 15890;
           double bono = CaluclarBono(empleado.sueldo);
           System.out.println("El sueldo que cobraran los Repositores sera de: $" + empleado.sueldo);
           System.out.println("El bono es de: $" + bono);
       } else {
          if(empleado.puesto.equals("Cajeros")) {
              empleado.sueldo = 25630.89;
              double bono = CaluclarBono(empleado.sueldo);
              System.out.println("El sueldo que cobraran los Cajeros sera de: $" + empleado.sueldo);
          } else if (empleado.puesto.equals("Supervisores")) {
              empleado.sueldo = 35560.20;
              double descuento = CalcularJubilacion(empleado.sueldo);
              System.out.println("El sueldo que cobraran los Suepervisores sera de: $" + descuento);
          } else {
              System.out.println("Ingresar una categoria valida");
          }
       }
   }
   public double CaluclarBono(double sueldo) {
        double bono = sueldo * 0.10;
        return bono;
   }
   public double CalcularJubilacion(double sueldo) {
       double descuento = sueldo - (sueldo * 0.11) ;
       return descuento;
   }

}
