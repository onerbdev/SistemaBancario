package sistemabancario;

public class ContaBancaria {
	
	//Atributos: As informações que a conta guarda.
	//Usamos 'public' para indicar que qualquer um pode mexer.
	
	private String titular;
	private double saldo;
	
	//Construtor: O método que cria a conta na memória.
	//Toda vez que damos um 'new ContaBancaria', o código abaixo roda.
	
	public ContaBancaria(String nomeDoTitular) {
		this.titular = nomeDoTitular;
		this.saldo = 0.0;
	}
	
	//Método de Depósito: Regra simples para colocar dinheiro.
	
	public void depositar(double valor) {
		if (valor > 0) {
			this.saldo += valor;
			System.out.println("Depósito de R$ " + valor + " realizado.");
		}
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	// Método Get para o titular: permite que a Main saiba quem é o dono da conta
    public String getTitular() {
        return this.titular;
    }
}
