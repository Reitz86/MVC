package Observer;

public class ObserverTest {

	public static void main(String[] args) {
		Radio r1 = new Radio("Radio FFH");
		Radio r2 = new Radio("Radio BOB");
		
		Listener l1 = new Listener("Andreas", r1);
		Listener l2 = new Listener("Peter", r1);

		
		r1.setStation("Klassik Radio");
		
		
		
	}
	
}
