package src;

public class Spray extends Reward {
	// Parametros
	private char texture;
	//Construtor
	public Spray(String name, String category, char texture) {
		super(name, category);
		this.texture = texture;
	}
	// Gets and Setters
	public char getTexture() {
		return texture;
	}
	public void setTexture(char texture) {
		this.texture = texture;
	}
	// methods
	public void sprayAction() {

	}
	// toString
	@Override
	public String toString() {
		return "Spray [texture=" + texture + "]\n";
	}
}