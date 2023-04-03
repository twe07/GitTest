import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		//다항연산자 또는 이항연산자 를 이용해서 문제 풀어보기
		//Scanner 이용해보기
		Scanner sc = new Scanner(System.in);
		String Data1 = sc.nextLine();
		String Data2 = sc.nextLine();
		
		int iNum1 = Integer.parseInt(Data1);
		int iNum2 = Integer.parseInt(Data2);
		
		
		String il ="1" , yee="2" ;
		int num1 = Integer.parseInt(il);
		int num2 = Integer.parseInt(yee);
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2);
		
		int l = num1 > num2 ? num1:num2;
		System.out.println("더 큰 숫자는:"+l+"입니다");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
