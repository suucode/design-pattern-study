package strategy;

//ocp, dip를 지킬 수 있다, 부모타입으로 묶어서 실행시킴
public class App {
	public static void main(String[] args) {
		CoffeeMachine m = new CoffeeMachine();
		m.brew(new Americano());
		m.brew(new CafeLatte());
		m.brew(new Espresso());
	}
}
