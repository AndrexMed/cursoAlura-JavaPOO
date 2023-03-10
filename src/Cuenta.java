/**
 *
 * @author giova
 */
public class Cuenta {
    double saldo;
    int agencia;
    int numero;
    String titutal;
    
    //Metodo que no retorna "void"
    public void depositar(double valor){ //"saldo", is parameter
        this.saldo = this.saldo + valor;
    }
    
    //Metodo que retorna "return"
    public boolean retirar(double valor){
        if (this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            return true;
        }else{
        return false;
        }
    }
}
