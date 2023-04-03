
public class Ex03_Bool {
	public static void main(String[] args) {
		//true 와 false 만 저장이 가능한 변수타입
		//true (1) , false (0)
		
		//AND 연산자는 논리곱 이다. TRUE(1) * FALSE(0)=FALSE (논리곱은 모든 조건이 TRUE 일때만 TRUE)
		//EX) 로그인(아이디 맞음(TRUE) 비밀번호 맞음(TRUE)= 로그인)
		
		
		//OR연산자는 논리합TRUE(1) + FALSE(0) =TRUE (논리합은 하나의 TRUE가 전체 조건식을 TRUE 로 만듬)
		//EX) 좋아하는 과일을 1가지 이상 선택해주세요(과일1,과일2,과일3) ==> 과일 1만 좋아하더라도 TRUE
		//OR 연산자는 논리합 이다.
		//AND 연산자 &, OR 연산자
		
		//NOT ==> !
		//어떤 TRUE, FALSE 앞에 붙이면 해당 결과는 반전시킴
		boolean t=true, f=false ;
		
		System.out.println(t);
		System.out.println(f);
		
		System.out.println(!t);
		System.out.println(!f);
	}

}
