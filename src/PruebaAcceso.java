/**
 *
 * @author giova
 */
public class PruebaAcceso {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta();
        
        cuenta.depositar(500);
        cuenta.retirar(300);
        
        System.out.println(cuenta.ObtenerSaldo());
        
    }
}
