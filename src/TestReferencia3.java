/**
 *
 * @author giova
 */
public class TestReferencia3 {
    public static void main(String[] args) {
        
        Cuenta cuentaJulieta = new Cuenta(); // Al instanciar una cuenta tambien referencia al objeto cliente
        
       // Cliente cliente = new Cliente(); //Forma de referenciar manualmente
       // cuentaJulieta.titular = cliente;  //Forma de referenciar manualmente
       
       // cuentaJulieta.titular = new Cliente(); // Forma de referenciar mas directamente
      //  cuentaJulieta.titular.nombre = "julieta"; //En esta si imprimiria el objeto...
        
        System.out.println(cuentaJulieta.titular.nombre); //Su valor por defecto seria null
    }
}
