
public class Test06 {
	public static void main(String[] args) {
		//���� ��Ģ(���ַ̹�): Class(.java)������ �빮�ڷ� �����ϱ�.
		// ������ �ҹ��ڷ� �����ϴµ� �ǹ��ִ� �ܾ �����ؼ� ������.
		int korScore , mathScore;//��Ÿ��(ī��,camel):�ܾ��θ� �빮�ڷ�
		korScore = 40;
		mathScore = 100;
		System.out.println(korScore);
		System.out.println(mathScore);
		
		// ����ȯ(Casting) : ���� �ٸ� Ÿ���� ������ ��ȯ���� �����.
		// ex) int <-> double , String <-> int
		// int < double
		int iValue = 10;
		double dValue = iValue + 0.5;//�ƹ��͵� �Ѱ;���==>�ڵ� ����ȯ
		System.out.println("iValue �� : " + iValue);
		System.out.println("dValue �� : " + dValue);
		
		//�� ū ������Ÿ���� ���� Ÿ�Կ� ���� �� ������ �߻���.
		//�����ڰ� � Ÿ������ �ٲܰ��� ���ø� ���༭ ������ �ٲ�.
		//�츮�� � �۾��� ��==>���� ����ȯ
		iValue =(int) dValue;//������ �߻���=�Ҽ��� ����
		System.out.println("iValue �� : " + iValue);
		System.out.println("dValue �� : " + dValue);
		
		
		String str = "1234" + 12;// �� : 123412
		//���ڿ��� � ���� ���ϴ� �� == ��x => ���� (������ ��ħ)
		int iData = 1234 + 12 ; // �� : 1246
		//������ �������� ���� == �� => ���� ��ħ
		System.out.println(iData);
		System.out.println(str);
		
		//str���� ���� 123412��� ���ڿ��� ����Ǿ�����.
		//���ڷ� �ٲٷ��� ����ؾ��ұ�? ( ""<=���� )
		//123412�� ���� ���ڷ� �ٲٰ� +1�� ����� ����غ���
		// int => Integer , double => Double , wrapperClass ù���ڰ� �빮�ڷν�����.
		int sum = Integer.parseInt(str)+1;
		System.out.println(sum);
		
		// boolean (�ο���) true �Ǵ� false �� ������ ������.
		int a=1 , b=2 , c=3;
		b=2;
		c=3;
		//int �����ٶ� = 10;
		String sum1 = "" + 1234 + 5678 + "�����ٶ�";
		
	}
}