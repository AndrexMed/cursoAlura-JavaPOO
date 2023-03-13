/**
 *
 * @author giova
 */
public class PruebaAcceso {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta();
        //Estas lineas no compilan ya que saldo ahora es "private"
        cuenta.saldo=200;
        cuenta.retirar(300);
        cuenta.saldo = cuenta.saldo-300;
        System.out.println(cuenta.saldo);
        
    }
}
