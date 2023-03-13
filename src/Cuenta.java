/**
 *
 * @author giova
 */
public class Cuenta {
    private double saldo; //Encapsulamiento
    private int agencia; //Encapsulando...
    private int numero;
    private Cliente titular = new Cliente(); // Para hacer referencia de un objeto Cliente con la Cuenta -- Referencia directa
    
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
    
    public double getSaldo(){ //Getter - por convencion se usa la palabra "get"
        return this.saldo;
    }
    
    public void setAgencia(int agencia){ //"this.agencia", hace refencia ala que esta afuera, mientras que la otra "agencia" hace referencia al argumento que recibe...
        if (agencia > 0) {
            this.agencia = agencia;
        }else{
            System.out.println("No esta permitido valores negativos");
        }
    }

    public int getAgencia() {
        return agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }
    
    
    
}
