/**
 *
 * @author giova
 */
public class TestReferencia {
    public static void main(String[] args) {
        Cuenta primeraCuenta = new Cuenta();
        primeraCuenta.saldo = 100;
        System.out.println(primeraCuenta.saldo);
        
        Cuenta segundaCuenta = primeraCuenta;
        segundaCuenta.saldo = 100;
        
        System.out.println("Saldo primer cuenta: $" +primeraCuenta.saldo);
        
        System.out.println("Saldo segunda cuenta: $" +segundaCuenta.saldo);
        
        segundaCuenta.saldo += 400;
        System.out.println("Saldo primera cuenta: $" +primeraCuenta.saldo);
    } 
}
