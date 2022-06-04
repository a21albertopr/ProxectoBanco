package proxecto.proxectobanco;

/**
 *
 * @author profesor
 */
public class Conta {
    protected Persoa titular;
    protected String numero;
    private float saldo;

    public Conta() {
        titular=null;
        numero=null;
        saldo=1000;
    }
    public boolean retirar(float valor){
        if (getSaldo()-valor<0)
            return false;
        setSaldo(getSaldo() - valor);
        return true;
    }
    public void ingresar(float valor){
        setSaldo(getSaldo() + valor);
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
 public void inicializarSaldo(float saldo){
this.saldo=0.00f;   
 }
    
 
}
