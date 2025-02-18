
public abstract class RootAccount implements FaceAccount {
	
	private static final int agenciaPadrao = 0001;
	private static int sequencial = 00001;

	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;

	public RootAccount(Cliente cliente) {
		this.agencia = RootAccount.agenciaPadrao;
		this.numero = sequencial++;
		this.cliente = cliente;
	}

	@Override
	public void sacar(double valor) {
		saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public void transferir(double valor, FaceAccount contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
 
	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
}
