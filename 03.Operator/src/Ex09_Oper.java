
public class Ex09_Oper {
	public static void main(String[] args) {
		//변수타입 변수명 = 값 비교식? "반환값" : "반환값2"
		//int result = num <10 ? 1 : 식2 ? 식3 ...
		//score 라는 변수가 있음 해당 변수의 값이 90보다 크다면 A등급, 80보다 크다면 B등급..D등급
		int score =82;
		String grade = score > 90? "A" : score > 80 ? "B" : score > 70 ? "C" : score > 60 ? "D" : "E";
		System.out.println(grade);
	
	}

}
