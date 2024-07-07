package desafio_dio_banco;

public class Main {

	public static void main(String[] args) {
		Conta conta_corrente = new ContaCorrente();
		Conta conta_poupanca = new ContaPoupanca();
		
		conta_corrente.depositar(100);
		conta_corrente.transferir(100, conta_poupanca);
		
		conta_corrente.imprimirExtrato();
		conta_poupanca.imprimirExtrato();
	}
}
