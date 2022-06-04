package proxecto.proxectobanco;

/**
 *
 * @author Alberto Piñeiro
 * @version Exercicio de repaso 
 */
public class Conta {

    /**
     *
     */
    protected Persoa titular;

    /**
     *
     */
    protected String numero;
    private float saldo;

    /**
     *
     */
    public Conta() {
        titular=null;
        numero=null;
        saldo=1000;
    }

    /**
     *
     * @param valor
     * @return
     */
    public boolean retirar(float valor){
        if (getSaldo()-valor<0)
            return false;
        setSaldo(getSaldo() - valor);
        return true;
    }

    /**
     *
     * @param valor
     */
    public void ingresar(float valor){
        setSaldo(getSaldo() + valor);
    }

    /**
     *
     * @return
     */
    public float getSaldo() {
        return saldo;
    }

    /**
     *
     * @param saldo
     */
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    /**
     *
     * @param saldo
     */
    public void inicializarSaldo(float saldo){
this.saldo=0.00f;   
 }
    
 
}
