package primeiro.progeto;

public class SwitchCaseComIf {

	public static void main(String[] args) {
		int opcao1 = 4;
		boolean credito = true;
		int valorDopriduto = 5000;
		int saldoDoCliente = 1000;

		switch (opcao1) {
		case 1:
			System.out.println("Voce escolher a op??o a vista ");
			if (valorDopriduto >= saldoDoCliente) {
				System.out.println("Compra realizada com sucesso.");

			}
			break;

		}
		switch (opcao1) {
		case 2:
			System.out.println("Voce escolher a op??o de credito");

			if (saldoDoCliente >= valorDopriduto) {
				int taxa = 100;
				valorDopriduto += taxa;
				System.out.println("Compra realizada com sucesso no valor de R$ " + valorDopriduto);
				saldoDoCliente -= valorDopriduto;
				System.out.println("Saldo ataual ? de: R$ " + saldoDoCliente);

			} else {
				System.out.println("Compra negada");

			}
			break;

		}
		switch (opcao1) {
		case 3:
			System.out.println("Voce escolher a op??o de boleto ");

			if (saldoDoCliente >= valorDopriduto) {
				int taxa = 250;
				valorDopriduto += taxa;
				System.out.println("Compra realizada com sucesso no valor de R$ " + valorDopriduto);
				saldoDoCliente -= valorDopriduto;
				System.out.println("Saldo ataual ? de: R$ " + saldoDoCliente);

			} else {
				System.out.println("Compra negada");

			}
			break;

		default:
			System.out.println("Op??o n?o encontrada.");
			
		}
	}

}
