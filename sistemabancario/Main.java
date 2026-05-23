package sistemabancario;

public class Main {

	public static void main(String[] args) {
		ContaBancaria minhaConta = new ContaBancaria("Breno");
		
		System.out.println("Bem-vindo ao sistema, " + minhaConta.getTitular() + "!");
		
		minhaConta.depositar(100.0);
		System.out.println("Saldo oficial verificado: R$ " + minhaConta.getSaldo());
	}

}
