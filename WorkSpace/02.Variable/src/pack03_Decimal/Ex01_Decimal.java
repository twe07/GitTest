package pack03_Decimal;

public class Ex01_Decimal {
	public static void main(String[] args) {
		int i = 1234567890;
		System.out.println(i);
		//int �̻��� ���� ���� �� �ִ� ������ ������Ÿ���� ������.
		//long�� l1�̶�� ������ �����ϱ�.
		//long�� l2��� ������ �ʱ�ȭ ��Ű��.12345678901
		long l1 ;
		long l2 = 1234567890123456789L;//����+longŸ���̶�� ������
		System.out.println(l2);
		
		//�Ǽ��� ������ Ÿ�� : float , double
		//�Ǽ����� �Ҽ����� �ִ°��� ǥ���ϱ� ���� ����
		//float�� long�� ���������� ������ F�� �ٿ���߸���.
		//����1)������Ÿ�� float�� ����Ͽ� ���� ���� , �Ҵ� , �ʱ�ȭ
		//����2)������Ÿ�� double�� �̿��Ͽ� ��
		//������ Ǯ �� �Ҽ����� �ִ� ���� ���(�Ҵ�)
		float f1 ;
		f1 = 1.1F;
		float f2 = 3.14F;
		double d1 = 1.1;
		double d2 = 3.14;
		// �ڿ� �����ڰ� �ٴ� long , float ���ϴ� ??
		// ��ǥ�� :�� int , doulbe ��
		
	}
}