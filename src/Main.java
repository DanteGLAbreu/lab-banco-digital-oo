
public class Main {

	public static void main(String[] args) {
		Cliente customer = new Cliente();
		customer.setNome("Cliente");
		
		RootAccount cc = new ContaCorrente(customer);
		RootAccount poupanca = new ContaPoupanca(customer);
		RootAccount investimento = new ContaInvestimento(customer);

		cc.depositar(100);
		cc.sacar(50);
		poupanca.depositar(100);
		poupanca.transferir(30, cc);
		investimento.depositar(1000);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		investimento.imprimirExtrato();
	}

}
