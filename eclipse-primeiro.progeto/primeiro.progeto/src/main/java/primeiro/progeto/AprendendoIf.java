package primeiro.progeto;

public class AprendendoIf {

	public static void main(String[] args) {

		int idadePermitida = 18;
		int minhaIdade = 24;

		if (minhaIdade >= idadePermitida) {
			System.out.println("Voce pode tirar habilitacao, porque voce tem " + minhaIdade + " anos.");
		} else {
			System.out.println("Voce n?o pode tirar habilitac?o, porque voce n?o tem mais de " + idadePermitida + " anos.");
		}
	}
}
