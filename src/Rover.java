
public class Rover {
	public int x = 0; int y = 0;
	public String positionFacing = "N";

	public Rover(int posX, int posY, String face) {
		this.x = posX;
		this.y = posY;
		this.positionFacing = face;
	}

	public Rover() {

	}
	// Inicializa as variáveis conforme as entradas informadas pelo usuário.
	public void setPosicao(int posX, int posY, String face) {
		this.x = posX;
		this.y = posY;
		this.positionFacing = face;
	}

	public void processaComandos(String com) {
		char command;
		for (int ind = 0; ind < com.length(); ind++) {
			command = com.charAt(ind);
			processa(command);
		}
	}
	
	// Recebe o valor do método processa e move o rover conforme sua orientação.
	private void move(Character command) {		
		switch (positionFacing) {
		case "N":
			x++;
			y++;
			break;
		case "W":
			x++;
			y--;
			break;
		case "S":
			x--;
			y--;
			break;
		case "E":
			x--;
			y++;
			break;
		}
	}

	// Efetua o teste e redefine a posição do rover.
	public void processa(Character command) {
		if(command=='L') {
			switch (positionFacing) {
			case "N":
				positionFacing = "W";
				break;
			case "W":
				positionFacing = "S";
				break;
			case "S":
				positionFacing = "E";
				break;
			case "E":
				positionFacing = "N";
				break;
			}
		} else if(command=='R'){
			switch (positionFacing) {
			case "N":
				positionFacing = "E";
				break;
			case "W":
				positionFacing = "N";
				break;
			case "S":
				positionFacing = "W";
				break;
			case "E":
				positionFacing = "S";
				break;
			}
		}

		else if(command=='M') {
			move(command);
		}
	}

	@Override
	public String toString() {
		return "Rover [X: " + x + ", Y: " + y + ", Position: " + positionFacing + "]";
	}
}
