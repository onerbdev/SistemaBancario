package sistemabancario;

public class Main {

	public static void main(String[] args) {
		
		//1. Criamos a conta do Breno usando o Construtor
		ContaBancaria minhaConta = new ContaBancaria("Breno");
		
		//2. Usamos o método oficial para colocar dinheiro
		minhaConta.depositar(100.0);
		System.out.println("Saldo após depósito: R$ " + minhaConta.saldo);
		
		System.out.println("\n--- A INVASÃO ---");
		
		//3. Como o atributo é 'public', qualquer um pode burlar as regras
		minhaConta.saldo = 10000000.0; //Injeção direta de dinheiro sem depósito
		
		System.out.println("Novo saldo (BURLADO): R$ " + minhaConta.saldo);
	}

}
