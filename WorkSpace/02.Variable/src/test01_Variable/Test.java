package test01_Variable;

public class Test {
	public static void main(String[] args) {
		//���� : � ���� �����س��� ���Ѱ� (�޸�)
		//������ Ÿ���� ���� : 
		//1.���� - int(����)�� < long(����)
		//        float(�Ǽ�) < double(�Ǽ�)��
		//���� ��Ģ : 
		//1.���� : ����Ÿ�� ������ ;
		//2.�Ҵ� : ������ = ����Ÿ�Կ� �������ִ°�;
		//3.�ʱ�ȭ : ��ΰ����� �ѹ��� �ϴ°� 
		// ����Ÿ�� ������ = �� ;
		int iNum ;
		long lNum ; 
		lNum = 10L;
		float fNum = 3.14F;
		double dNum = 3.14;
		System.out.println(iNum);
		//�� �����ϱ�? : ������ �ʱ�ȭ�� �Ǿ������ ����� ����
		//initialized(�ʱ�ȭ)
		System.out.println(lNum);
		System.out.println(fNum);
		System.out.println(dNum);
	}
}