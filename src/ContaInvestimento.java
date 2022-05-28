
public class ContaInvestimento extends RootAccount{
	
	public ContaInvestimento(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Investimento ===");
		super.imprimirInfosComuns();
	}

}
