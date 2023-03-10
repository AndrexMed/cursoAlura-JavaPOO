
/**
 *
 * @author giova
 */
public class TestReferencia2 {

    public static void main(String[] args) {

        Cliente Aleja = new Cliente();
        Aleja.nombre = "Maria Alejandra";
        Aleja.documento = "123456789";
        Aleja.telefono = "0180001234";
        
        Cuenta cuentaAleja = new Cuenta ();
        cuentaAleja.agencia = 1;
        cuentaAleja.titular = Aleja;
        
        System.out.println(cuentaAleja.titular.documento);
        System.out.println(cuentaAleja.titular);
        System.out.println(Aleja);
    }
}
