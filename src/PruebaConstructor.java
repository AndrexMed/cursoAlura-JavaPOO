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
        Cuenta cuenta = new Cuenta();
        cuenta.depositar(500);
        System.out.println(cuenta.getSaldo());
        cuenta.setAgencia(-5);
        System.out.println(cuenta.getAgencia());
    }
}
