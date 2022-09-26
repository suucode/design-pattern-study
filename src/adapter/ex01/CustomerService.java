package adapter.ex01;

//고객의 클레임이 들어오면 사과메일 보내기, 사과메일에 대한 답장을 DB에 저장하기
public class CustomerService {
	
	private EmailSend email; //EmailAdapter의 부모가 EmailSend이기때문에 부모를 건다
	
	
	
	public CustomerService(EmailSend email) {
		this.email = email;
	}

	public void acceptClaim(String msg) {
		//1. 클레임 받기
		String acceptMsg = msg;
		System.out.println("클레임내용:"+ acceptMsg);
		//2. 이메일 보내기
		sendEmail();
	}
	
	public void sendEmail() {
		String result = email.send();
		insertResultEmail(result);
	}
	
	public void insertResultEmail(String result) {
		System.out.println("답장을 DB에 저장했습니다.:"+result);		
	}
}
