package adapter;

//기존 클래스를 수정하지않고 원하는것을 추가하기 + 기존의 코드 재사용
public class AmericanoAdapter implements Coffee {
	
	private Americano americano;
	
	

	public AmericanoAdapter(Americano americano) {
		this.americano = americano;
	}



	@Override
	public String make() {
		System.out.println("시럽추가");
		return americano.make();
	}

}
