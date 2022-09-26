package adapter;

public class Americano implements Coffee {
	private final String NAME = "아메리카노";
	
	public String make() {
//		System.out.println("시럽추가"); ocp위배
		return NAME;
	}
}
