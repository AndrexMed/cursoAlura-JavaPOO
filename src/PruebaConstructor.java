/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author giova
 */
public class PruebaConstructor {

    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta(6); //
        Cliente cliente1 = new Cliente(); //Instanciamos un objeto Cliente
        cliente1.setNombre("Andres");  //Le asignamos un nombre al cliente
       cuenta1.setTitular(cliente1);  //A la instancia de cuenta1, le asiganmos como titular al objeto cliente1.
        System.out.println(cuenta1.getTitular().getNombre()); // Imprimimos los datos del cliente1, por medio la de cuenta al tenerlos unidos....
        Cuenta cuenta2 = new Cuenta(5); // Al personalizar el constructor "por defecto", obligamos al user a ingresarle un numero de agencia mayor que cero
        Cuenta cuenta3 = new Cuenta(22); //Esta cuenta se crea para probar el contador de cuentas (variable estatica)
        System.out.println("Numero de cuentas creadas: "+Cuenta.getcountCuentas()); // Puede ser accedida ya que la variable es estatica
        // System.out.println(Cuenta.numero); //Numero vive unicamente dentro de una instancia, no puede ser accedida. asi la ponga publica

    }
}
