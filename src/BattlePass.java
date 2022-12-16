package src;

import java.util.ArrayList;

public class BattlePass {
	// paramerts
	private boolean freemium;
	private ArrayList<Reward> reward = new ArrayList<Reward>();
	private User user;
	// Construtor
	public BattlePass(User user, boolean freemium) {
		this.user = user;
		this.freemium = freemium;
	}
	//get and setters
	public boolean isFreemium() {
		return freemium;
	}
	public void setFreemium(boolean freemium) {
		this.freemium = freemium;
	}
	public ArrayList<Reward> getReward() {
		return reward;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	// add
	public void addReward(Reward reward) {
		this.reward.add(reward);
	}
	// methods
	public Reward receiveReward() {
		int points = user.getBattlePassPoints();
		
		return null;
	}
	// toString
	public String toString() {
		StringBuffer sb = new StringBuffer();
		String t = null;
		if(freemium) {
			t = "PREMIUM";
		}else {
			t = "DEFAULT";
		}
		sb.append("Pacote: "+t+"\n");
		
		return sb.toString();
	}
}