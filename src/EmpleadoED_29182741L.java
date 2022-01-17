
/**
 * Descripción de la clase Empleado:
 *
 * @version 1.0
 * @author Bea Zahonero
 * @author <a href="mailto:beazaho@hotmail.com">beazaho@hotmail.com</a>
 * 17 ene 2022 15:47:50
 */
// !!!! MODIFICA TU NOMBRE Y TU DNI DONDE TOQUE
public class EmpleadoED_29182741L {

   static final double FACTOR_HORA_EXTRA = 1.2;
   private String nombreCompleto, dni;
   private double salarioBasePorHora = 10.56;

   public EmpleadoED_29182741L(String nombreCompleto, String dni) {
      this.nombreCompleto = nombreCompleto;
      this.dni = dni;
   }

   public double getSalarioEsteMes(int horasExtra) {
      double cantidadExtra, salarioFinal;
      cantidadExtra = horasExtra * this.salarioBasePorHora
         * FACTOR_HORA_EXTRA;
      salarioFinal = this.salarioBasePorHora * 40 * 4 + cantidadExtra;
      salarioFinal = (double) Math.round(salarioFinal * 100d) / 100d;
      return salarioFinal;
   }

   // Este método no lo comentaremos con JavaDoc
   public static void main(String[] args) {
      EmpleadoED_29182741L emp = new EmpleadoED_29182741L("RAUL PALAO", "44654545X");
      int horasExtra = 2;
      System.out.println("El salario de " + emp.nombreCompleto + " este messerá de " + emp.getSalarioEsteMes(horasExtra) + " euros, al hacer " + horasExtra + " horas extra.");
   }

}
