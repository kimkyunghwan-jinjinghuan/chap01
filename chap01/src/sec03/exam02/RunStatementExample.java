package sec03.exam02;

public class RunStatementExample {
	public static void main(String[] args) {
		int x = 1;						//변수 x를 선언하고 1을 저장
		int y = 2;						//변수 y를 선언하고 2를 저장
		int result = x + y;				//변수 result를 선언하고 x와 y를 더한 값을 저장
		System.out.println(result);		//모니터에 출력하는 메소드 호출
		System.out.println("결과는" + result);		//모니터에 출력하는 메소드 호출
		System.out.printf("결과는 %s", result);		//모니터에 출력하는 메소드 호출
		// %s placeholder 틀을 만들어 놓고 대체해나갈 수 있는 방법!
		// 대체할수있는 변투틀을 ""스트링에 넣어두고, 실제 데이터변수는 뒤에 추가적으로 서술
	}
}