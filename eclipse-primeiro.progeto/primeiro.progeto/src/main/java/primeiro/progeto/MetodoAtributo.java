package primeiro.progeto;

public class MetodoAtributo {
	
	String nome;
	int idade;
	
	public String digiteUmNome (String nome) {
		
	System.out.println("O nome digitado � " + nome);
		
		return nome;
		
	}
	
	public void didgiteSuaIdade (int idade) {
		
		System.out.println("O nome digitado � " + idade);
		
	}
	
	public void informeDados(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
		System.out.println("O nome cadastrado � " + nome + " e a idade � " + idade + " anos.");
		
	}

	public void consultarDados () {
		
		System.out.println("O nome cadastrado � " + this.nome + " e a idade � " + this.idade + " anos.");
	}
}
