/**
 *
 * @author giova
 */
public class Cuenta {
    private double saldo; //Encapsulamiento
    int agencia;
    int numero;
    Cliente titular = new Cliente(); // Para hacer referencia de un objeto Cliente con la Cuenta -- Referencia directa
    
    //Metodo que no retorna, "void"
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
    
    public boolean transferir(double valor,Cuenta cuenta){
        if (this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            cuenta.depositar(valor);
            return true;
        }
        return false;
    }
    
    public double ObtenerSaldo(){ //Getter
        return this.saldo;
    }
}
