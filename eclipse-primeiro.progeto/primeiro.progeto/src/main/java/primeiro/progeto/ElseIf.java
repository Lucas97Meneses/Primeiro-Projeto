package primeiro.progeto;

public class ElseIf {

	public static void main(String[] args) {

		boolean dinheiro = false;
		boolean credito = false;
		boolean boleto = true;
		int preco = 10000;

		if (dinheiro) {

			int desconto = 600;
			preco -= desconto;

			System.out.println("Parabens pela compra do carro no valorr de R$ " + preco);

		} else if (credito) {

			int juros = 1500;
			preco += juros;

			System.out.println("Parabens pela compra do carro no valorr de R$ " + preco);

		} else if (boleto) {
			
			int juros = 3000;
			preco += juros;
			
			System.out.println("Parabens pela compra do carro no valorr de R$ " + preco);
			
		}
	}

}
