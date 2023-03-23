/**
 *
 * @author giova
 */
public class Cuenta {
    private double saldo; //Encapsulamiento
    private int agencia; //Encapsulando...
    private int numero;
    private Cliente titular = new Cliente(); // Para hacer referencia de un objeto Cliente con la Cuenta -- Referencia directa
    
    //Se ejecuta implicitamente -- Aqui personalizamos el constructor que viene por defecto...
    public Cuenta(int agencia){  // Aqui obligamos que al crear una instacia de cuenta, haya que asignarle un numero para la agencia por medio del constructor
        if (agencia <= 0) { 
            System.out.println("Error! No se permite valor menor que 0");
            this.agencia = 1; // El this hace refencia a la agencia que esta arriba
        }else{
            this.agencia = agencia; // El this hace refencia a la agencia que esta arriba
        }
        System.out.println("Aqui se crea una nueva cuenta");
    }
    
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
