package primeiro.progeto;

public class RevisandoIf {

	public static void main(String[] args) {

		int mediaPassar = 9;
		int nota1 = 7;
		int nota2 = 10;
		int nota3 = 10;
		int media = (nota1 + nota2 + nota3) / 3;

		if (media >= mediaPassar) {

			System.out.println("Parabens voce passou de ano porque sua media foi " + media + ".");

		} else {
			System.out.println("Infelizmente voce reprovou de ano, porque sua media foi " + media + ".");
		}

	}

}
