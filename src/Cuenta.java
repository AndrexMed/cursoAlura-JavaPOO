/**
 *
 * @author giova
 */
public class Cuenta {
    double saldo;
    int agencia;
    int numero;
    String titutal;
    
    void depositar(double valor){
        saldo = saldo + valor;
    }
}
