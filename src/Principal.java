import java.util.Scanner;
/**
 * 
 * 
 * @author Emilio de Oliveira
 *
 */

public class Principal {
	public Rover rover = new Rover();

	public static void main(String[] args) {
		int op = 0;
		int posInicialX = readInteger("Digite a posição inicial de X: ");
		int posInicialY = readInteger("Digite a posição inicial de Y: ");
		String apontamentoInicial = readString("Digite o apontamento inicial: ");
		Rover rover = new Rover(posInicialX, posInicialY, apontamentoInicial);
		System.out.println(rover);
		
		// Continua efetuando a leitura enquanto a entrada for diferente de F.
		do {			
			String com = readString("Digite os comandos: ");
			rover.processaComandos(com);
			System.out.println(rover);
			op = readInteger("Deseja efetuar outro comando? [1 - SIM / 2 - NÃO");
		} while (op != 2);
	}

	public static String readString(String msg) {
		Scanner input = new Scanner(System.in);
		System.out.print(msg);
		return input.nextLine();
	}

	public static int readInteger(String msg) {
		Scanner input = new Scanner(System.in);
		System.out.print(msg);
		return input.nextInt();
	}
}
