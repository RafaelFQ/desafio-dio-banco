package desafio_dio_banco;

public class ContaCorrente extends Conta{
	
	@Override
	public void imprimirExtrato() {
		System.out.println("==== Extrato da Conta Corrente ====");
		super.imprimirInfosComuns();
	}	
}
