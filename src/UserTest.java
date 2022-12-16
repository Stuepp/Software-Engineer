package src;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.jupiter.api.Test;

class UserTest {

	User user = new User("nome", "email", "password");
	ArrayList<Character> cha = new ArrayList<Character>(); 
	ArrayList<LuckyBox> lb = new ArrayList<LuckyBox>();
	ArrayList<Ticket> tt = new ArrayList<Ticket>();
	ArrayList<User> us = new ArrayList<User>();
	@Test
	void test() {
		// usuario ganhar personagem
		for(int i = 0; i < 10; i++) {
			cha.add(new Character("name"+i,"model"+i,"texture"+i,1.0f, 1.1f,100));
			user.addCharacter(cha.get(i));
			assertEquals(cha.get(i), user.getCharacter().get(i));
		}
		// usuario ganhar caixa
		for(int i = 0; i < 10; i++) {
			lb.add(new LuckyBox("name"+i, "category"+i, "model"+i, "texture"+i));
			user.addLuckyBox(lb.get(i));
			assertEquals(lb.get(i), user.getLuckyBoxes().get(i));
		}
		// usuario ganhar ticket
		for(int i = 0; i < 10; i++) {
			tt.add(new Ticket("name"+i,"category"+i, "model"+i,"texture"+i));
			user.addTicket(tt.get(i));
			assertEquals(tt.get(i), user.getTicket().get(i));
		}
		// usuario ganhar amigo
		for(int i = 0; i < 10; i++) {
			us.add(new User("nome"+i, "email"+i, "password"+i));
			user.addFriends(us.get(i));
			assertEquals(us.get(i), user.getFriends().get(i));
		}
		// editando personagem
		cha.get(3).setSpeed(2.2f);
		user.getCharacter().get(3).setSpeed(2.2f);
		assertEquals(cha.get(3), user.getCharacter().get(3));
		// remove personagem
		try {
			for(int i = 0; i < 3; i++) {
				user.getCharacter().remove(i);
				cha.remove(i);
				assertEquals(cha.get(i), user.getCharacter().get(i));
				fail("Falhou com sucesso");
			}
		}catch(Exception e) {
			assertNotNull(e);
		}

	}

}
