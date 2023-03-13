/**
 *
 * @author giova
 */
public class CrearCuenta {
    public static void main(String[] args) {
        Cuenta primeraCuenta = new Cuenta();
        primeraCuenta.depositar(400);
        
        System.out.println(primeraCuenta.getSaldo());
        
         Cuenta segundaCuenta = new Cuenta();
         segundaCuenta.depositar(400);
         
         System.out.println(segundaCuenta.getSaldo());
         System.out.println(primeraCuenta.getSaldo());
         
         if (primeraCuenta == segundaCuenta) {
            System.out.println("Son el mismo objeto");
        }else{
            System.out.println("Son diferentes");
        }
         
    }
}
