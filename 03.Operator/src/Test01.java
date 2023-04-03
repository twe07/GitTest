
public class Test01 {
	public static void main(String[] args) {
		int iNum; //선언
		iNum=1;//할당
		System.out.println(iNum);
		
		long lNum=2;//초기화
		System.out.println(lNum);
		
		double dNum;
		dNum= 3.14;
		System.out.println(dNum);
		
		byte bNum;
		bNum= 3;
		System.out.println(bNum);
		
		float fNum;
		fNum= 3.14F;
		System.out.println(fNum);
		
		String kim="문자열";
		System.out.println(kim);
		String numStr = "123"; //123이라는 문자열을 숫자로 바꾸고 +10 한 결과를 얻어보기
		System.out.println(numStr+10);// 답:12310
		int numInt= Integer.parseInt(numStr);//Integer을 사용하여 숫자로 변경
		System.out.println(numInt+10);// 답:133
		
		String numStr2 = ""+numInt;//""을 더해줌으로써 Str 형으로 변경됨(""에 문자열값을 더하면 문자열이됨)
		System.out.println(numStr2);
		
		
		
	}

}
