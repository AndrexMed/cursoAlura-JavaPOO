/**
 *
 * @author giova
 */
public class TestReferencia3 {
    public static void main(String[] args) {
        Cuenta cuentaJulieta = new Cuenta();
        Cliente cliente = new Cliente();
        cuentaJulieta.titular = cliente;
        // cuentaJulieta.titular.nombre = "Julieta"; //Esta linea generaria un Exception... Ya que no habia instanciado con cliente...
        
        System.out.println(cuentaJulieta.titular.nombre); //Su valor por defecto seria null
    }
}
