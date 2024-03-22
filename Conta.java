
public class Conta {

    String titular;
    int id;
    double saldo;

    public Conta(String titular, int id, double saldo){
        this.titular = titular;
        this.id = id;
        this.saldo = saldo;
    }

    boolean Sacar(double valor){
        if(valor > this.saldo){
            return false;
        }else{
            try{
                this.saldo -= valor;
            }
            catch(Exception ex){
                return false;
            }
            return true;
        }
    
    }

    boolean Depositar(double valor){
        try{
            this.saldo += valor;
        }
        catch(Exception ex){
            return false;
        }
        return true;
    }
}
