package src;

public class Skin extends Reward {
	// Parametros
	private String texture;
	private String model;
	// Construtor
	public Skin(String name, String category, String texture, String model) {
		super(name, category);
		this.texture = texture;
		this.model = model;
	}
	// Gets and Setters
	public String getTexture() {
		return texture;
	}
	public void setTexture(String texture) {
		this.texture = texture;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	// toString
	@Override
	public String toString() {
		return "Skin [texture=" + texture + ", model=" + model + "]";
	}
}
