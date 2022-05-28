
public interface FaceAccount {
	
	void sacar(double valor);
	
	void depositar(double valor);
	
	void transferir(double valor, FaceAccount contaDestino);
	
	void imprimirExtrato();
}
