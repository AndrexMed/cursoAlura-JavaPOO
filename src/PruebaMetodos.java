/**
 *
 * @author giova
 */
public class PruebaMetodos {
    public static void main(String[] args) {
        Cuenta miCuenta = new Cuenta();
        
        miCuenta.saldo = 300;
        miCuenta.depositar(200);
        
        System.out.println(miCuenta.saldo);
        
        miCuenta.retirar(100);
        System.out.println(miCuenta.saldo);
        
        Cuenta cuentaAndres = new Cuenta();
        cuentaAndres.depositar(1000);
        boolean puedeTransferir = cuentaAndres.transferir(400, miCuenta);
        
        if (puedeTransferir) {
            System.out.println("***** TRANSACCION EXITOSA *****");
        }
        else{
            System.out.println("***** NO FUE POSIBLE TRANSFERIR *****");
        }
        
               
        System.out.println(cuentaAndres.saldo);
        System.out.println(miCuenta.saldo);
    }
    
    
}
