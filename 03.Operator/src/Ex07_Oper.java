
public class Ex07_Oper {
	public static void main(String[] args) {
		// = (대입, 값 할당)
		//초과, 미만 : 0 < 4 : 1,2,3
		//이상, 이하 : 0 << 4 : 1,2,3,4
		int num = 10;
		String result = num == 10 ? "맞다" : "틀리다" ; 
		System.out.println(result);
		
		int resultInt = num ==10 ? 1 : 2; 
		System.out.println(result + resultInt);
		
		int iNum = 9;
		boolean result2 = iNum <= 9 ? true : false;
		System.out.println(!result2);
		
	}

}
