package src;

import java.util.ArrayList;

public class User {
	//Parameters
	public String name;
	private String email;
	private String password;
	private int BattlePassPoints;
	private ArrayList<LuckyBox> LuckyBoxes = new ArrayList<LuckyBox>();
	private ArrayList<User> friends = new ArrayList<User>();
	private ArrayList<Ticket> tickets = new ArrayList<Ticket>();
	private ArrayList<Character> characters = new ArrayList<Character>();
	private ArrayList<User> party = new ArrayList<User>();
	private BattlePass battlePass;	
	// Construtor
	public User(String name, String email, String password) {
		this.name = name;
		this.email = email;
		this.password = password;
		this.BattlePassPoints = 0;
	}
	// gets and sets
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getBattlePassPoints() {
		return BattlePassPoints;
	}
	public void setBattlePassPoints(int battlePassPoints) {
		BattlePassPoints = battlePassPoints;
	}
	public ArrayList<LuckyBox> getLuckyBoxes() {
		return LuckyBoxes;
	}
	public ArrayList<User> getFriends() {
		return friends;
	}
	public ArrayList<Ticket> getTicket() {
		return tickets;
	}
	public BattlePass getBattePass() {
		return battlePass;
	}
	public void setBattePass(BattlePass battePass) {
		this.battlePass = battePass;
	}
	public ArrayList<Character> getCharacter() {
		return characters;
	}

	public ArrayList<User> getParty() {
		return party;
	}
	// add
	public void addCharacter(Character character) {
		this.characters.add(character);
	}
	public void addLuckyBox(LuckyBox luckyBox) {
		this.LuckyBoxes.add(luckyBox);
	}
	public void addFriends(User friends) {
		this.friends.add(friends);
	}
	public void addTicket(Ticket ticket) {
		this.tickets.add(ticket);
	}
	public void addParty(User user) {
		this.party.add(user);
	}
	// methods
	private void login() {

	}
	private void logout() {

	}
	public void leaveParty() {

	}
	public void inviteToParty() {

	}
	public void cancelInvite() {

	}
	public void searchMatch() {

	}
	public void sentFriendRequest() {
		
	}
	public void acceptFriendRequest(User user) {
		this.friends.add(user);
		return;
	}
	public void refuseFriendRequest() {

	}
	// to String
    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append("Name: "+name+" Email: "+email+" Password: "+password+" BattlePoints: "+BattlePassPoints+"\n");
        if(LuckyBoxes != null) {
        	// sb.append(LuckyBox.toString());
        }
        if(friends != null) {
        	// sb.append(friends.toString());
        }
        if(characters != null) {
        	// sb.append(characters.toString());
        }
        if(party != null) {
        	// sb.append(party.toString());
        }
        return sb.toString();
    }
}
