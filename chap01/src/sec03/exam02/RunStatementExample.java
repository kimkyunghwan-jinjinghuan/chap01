package sec03.exam02;

public class RunStatementExample {
	public static void main(String[] args) {
		int x = 1;						//���� x�� �����ϰ� 1�� ����
		int y = 2;						//���� y�� �����ϰ� 2�� ����
		int result = x + y;				//���� result�� �����ϰ� x�� y�� ���� ���� ����
		System.out.println(result);		//����Ϳ� ����ϴ� �޼ҵ� ȣ��
		System.out.println("�����" + result);		//����Ϳ� ����ϴ� �޼ҵ� ȣ��
		System.out.printf("����� %s", result);		//����Ϳ� ����ϴ� �޼ҵ� ȣ��
		// %s placeholder Ʋ�� ����� ���� ��ü�س��� �� �ִ� ���!
		// ��ü�Ҽ��ִ� ����Ʋ�� ""��Ʈ���� �־�ΰ�, ���� �����ͺ����� �ڿ� �߰������� ����
	}
}