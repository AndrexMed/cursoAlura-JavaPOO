/**
 *
 * @author giova
 */
public class PruebaEncapsulamiento {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta();
        Cliente cliente = new Cliente();
        cliente.setNombre("Giovanni");
        cliente.setDocumento("ABCD");
        
        cuenta.setTitular(cliente);
        
        //System.out.println(cliente.getNombre());
        //System.out.println(cuenta.getTitular().getNombre());
        
        System.out.println(cliente);
        System.out.println(cuenta.getTitular());
        System.out.println(cliente);
    }
}
