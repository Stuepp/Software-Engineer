package src;

public class Emote extends Reward {
	// Parametros
	private String animation;
	private Character character;
	// Construtor
	public Emote(String name, String category, String animation, Character character) {
		super(name, category);
		this.animation = animation;
		this.character = character;
	}
	// Gets and sets
	public String getAnimation() {
		return animation;
	}
	public void setAnimation(String animation) {
		this.animation = animation;
	}
	public Character getCharacter() {
		return character;
	}
	public void setCharacter(Character character) {
		this.character = character;
	}
	// methods
	public void useEmote() {

	}
	// to String
	public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("Animation: "+animation+"\n");
        return sb.toString();
	}
}
