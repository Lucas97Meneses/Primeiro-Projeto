package primeiro.progeto;

public class Habilitacao {

	public static void main(String[] args) {

		String nome = "Lucas";
		int idade = 24;
		int idadePermitida = 18;
		Boolean emancipado = true;

		if (idade >= idadePermitida || emancipado) {
			System.out.println("Voce pode tirar habilita??o " + nome);
			
		} else {
			System.out.println("Voce n?o pode tirra habilita??o " + nome);
			
		}

	}

}
