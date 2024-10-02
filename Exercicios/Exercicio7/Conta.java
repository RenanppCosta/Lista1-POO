package Exercicios.Exercicio7;

public class Conta {
    private double saldo;

    public Conta(double saldoInicial){
        this.saldo = saldoInicial;
    }

    public double depositar(double deposito){
        return saldo += deposito;
    }

    public void sacar(double saque){
        if(saque > saldo){
            System.out.println("Não é possível realizar saque.");
        }else{
            saldo -= saque;
        }
    }
    
    public double verificarSaldo(){
        return saldo;
    }
}
