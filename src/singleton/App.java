package singleton;
//객체를 하나만 유지하는 기법
public class App {
	
	public static void main(String[] args) {
		President p1 = President.getInstance();
		System.out.println();
	}
}
