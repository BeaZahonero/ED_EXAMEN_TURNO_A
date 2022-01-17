
/**
 * Descripción: EJERCICIO PRÁCTICO EXAMEN EVAL 1 ED
 *
 * @author Bea Zahonero DNI 29182741L
 * @author <a href="mailto:beazaho@hotmail.com">beazaho@hotmail.com</a>
 * @version 1.0
 * @see https://github.com/BeaZahonero/ED_EXAMEN_TURNO_A_JAVADOC.git 17 ene 2022
 * 15:47:50
 */
public class EmpleadoED_29182741L {

   static final double FACTOR_HORA_EXTRA = 1.2;
   private String nombreCompleto, dni;
   private double salarioBasePorHora = 10.56;

   /**
    * Constructor con DOS parámetros
    *
    * @param nombreCompleto nombreCompleto nombre completo en mayúsculas
    * @param dni dni documento nacional de identidad con letra y sin espacios
    */
   public EmpleadoED_29182741L(String nombreCompleto, String dni) {
      this.nombreCompleto = nombreCompleto;
      this.dni = dni;
   }

   /**
    * Calcula el salario bruto mensual en función del salario base por hora y
    * las horas extras. El precio por hora de la hora extra se determina con la
    * constante FACTOR_HORA_EXTRA
    *
    * @param horasExtra horasExtra número de horas extra dedicadas redondeado a
    * la baja (entero)
    * @return devuelve el salario bruto mensual en euros con dos decimales
    */
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
      EmpleadoED_29182741L emp = new EmpleadoED_29182741L("RAUL PALAO",
         "44654545X");
      int horasExtra = 2;
      System.out.println("El salario de " + emp.nombreCompleto + " este messerá "
         + "de " + emp.getSalarioEsteMes(horasExtra) + " euros, al hacer "
         + horasExtra + " horas extra.");
   }

}
