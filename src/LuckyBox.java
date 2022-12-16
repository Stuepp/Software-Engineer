package src;

import java.util.Collection;

public class LuckyBox extends Reward {
	// Parametros
	private String model;
	private String texture;
	// Construtor
	public LuckyBox(String name, String category, String model, String texture) {
		super(name, category);
		this.model = model;
		this.texture = texture;
	}
	// gets and setters
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getTexture() {
		return texture;
	}

	public void setTexture(String texture) {
		this.texture = texture;
	}
	// methods
	public Reward openBox() {
		return null;
	}
	// toString
	@Override
	public String toString() {
		return "LuckyBox [model=" + model + ", texture=" + texture + "]\n";
	}
}
