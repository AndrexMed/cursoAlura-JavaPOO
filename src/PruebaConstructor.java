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
        Cuenta cuentados = new Cuenta(6); //Esta cuenta se crea para probar el contador de cuentas (variable estatica)
        Cuenta cuenta = new Cuenta(5); // Al personalizar el constructor "por defecto", obligamos al user a ingresarle un numero de agencia mayor que cero
        //cuenta.depositar(500);
        //System.out.println(cuenta.getSaldo());
        //cuenta.setAgencia(-5);
        System.out.println(cuenta.getAgencia());
    }
}
