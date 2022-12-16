package src;

import java.util.ArrayList;

public class Character {
	// paramters
	public String name;
	private String model;
	private String texture;
	public float speed;
	public float jumpHeight;
	public int life;
	private User user;
	private ArrayList<Skin> skins = new ArrayList<Skin>();
	private ArrayList<Emote> emotes = new ArrayList<Emote>();
	private ArrayList<Spray> sprays = new ArrayList<Spray>();
	// Construtor
	public Character(String name, String model, String texture, float speed, float jumpHeight, int life) {
		this.name = name;
		this.model = model;
		this.texture = texture;
		this.speed = speed;
		this.jumpHeight = jumpHeight;
		this.life = life;
	}
	// get and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
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
	public float getSpeed() {
		return speed;
	}
	public void setSpeed(float speed) {
		this.speed = speed;
	}
	public float getJumpHeight() {
		return jumpHeight;
	}
	public void setJumpHeight(float jumpHeight) {
		this.jumpHeight = jumpHeight;
	}
	public int getLife() {
		return life;
	}
	public void setLife(int life) {
		this.life = life;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public ArrayList<Skin> getSkin() {
		return skins;
	}
	public ArrayList<Emote> getEmote() {
		return emotes;
	}
	public ArrayList<Spray> getSpray() {
		return sprays;
	}
	// adds
	public void addSkin(Skin skin) {
		this.skins.add(skin);
	}
	public void addEmote(Emote emote) {
		this.emotes.add(emote);
	}
	public void addSpray(Spray spray) {
		this.sprays.add(spray);
	}
	// methods
	public void movement() {

	}
	public void basicAttack() {

	}
	public void secondaryAttack() {

	}
	public void mainSkill() {

	}
	public void secondarySkill() {

	}
	public void ultimate() {

	}
	public void melee() {

	}
	// to String
    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append("Name: "+name+" Model: "+model+" Texture: "+texture+"\n"
        		+ "Speed: "+speed+" Jump height: "+jumpHeight+" Life: "+life+"\n");
        if(skins != null) {
        	// sb.append(LuckyBox.toString());
        }
        if(emotes != null) {
        	// sb.append(friends.toString());
        }
        if(sprays != null) {
        	// sb.append(characters.toString());
        }
        return sb.toString();
    }
}
