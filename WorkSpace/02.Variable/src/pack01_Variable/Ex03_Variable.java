package pack01_Variable;

public class Ex03_Variable {
// ctrl + shift + f == ������
// ctrl + / == ������ �࿡ ���ؼ� ��� �ּ� ó��.
	public static void main(String[] args) {
		int value = 0 ;// �ʱ�ȭ x ������ ����� �Ұ���.
		int result = value + 10;//�����߻�. x
		System.out.println(result);
//		int value = 10;//
//		int result = value + 10 ;
		//������ �������� ��Ģ������ �����ϴ�.
		//���Ҵ�. (������ ��� ����°� �ƴ϶� ���� �ٽ� �༭ �ٲ�)
		result = 1+1+10;
		// result�� ������ ��Ģ������ ����� �����ϰ� ����
		//����غ���. - , * , / 
		System.out.println(result);
		result = 5 - 3;
		System.out.println(result);
		result = 2 * 2;
		System.out.println(result);
		result = 6 / 2 ;
		System.out.println(result);
		result = value ;//���� Ÿ���� ������ ���� �������ִ�.
	}
}