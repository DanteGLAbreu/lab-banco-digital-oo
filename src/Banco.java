import java.util.List;

public class Banco {

	private String nome;
	private List<RootAccount> contas;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<RootAccount> getContas() {
		return contas;
	}

	public void setContas(List<RootAccount> contas) {
		this.contas = contas;
	}

}
