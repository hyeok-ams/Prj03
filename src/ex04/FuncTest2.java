package ex04;

import java.time.LocalDate;
import java.util.Scanner;

public class FuncTest2 {
	 //전역 Data(전역변수)
	//입력: 이름 전화 성별(1:남, 2:여) 나이
	//출력: 이름 전화 남자/여자        나이
	
	//입력용 변수
	static String 	name;
	static String 	phone;
	static String	man; 		//성별(1:남, 2:여)
	static int 	birthYear;  //계산하면 int 계산안하면 String
	
	//출력용 변수
	static String 	gender;		//남자/여자
	static int		age;

	
	

	
	public static void main(String[] args) {
		
		input();
		process();
		output();
		System.out.println("End.......");
	}
	
	//input
	private static void input() {
		//키보드 준비
		Scanner in = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요.");
		name = in.nextLine(); //문자열 입력
		
		System.out.println("전화번호를 입력하세요.");
		phone = in.nextLine();
		
		System.out.println("성별을 선택하세요.(1.남 2.여)");
		man = in.nextLine();
		
		System.out.println("태어난년도 입력하세요.");
		birthYear = in.nextInt();
				
	}
	//process
	private static void process() {
		//중요: 문자 비교는 == 을 사용하지 않고 .equals를 사용 
		//.compareTo는 글자의 순서 비교
		if(man.equals("1")) {
			gender = "남자";
		}
		else
		{
			if(man.equals("2")) {
				gender = "여자";
			}
			else
			{
				gender = "성별오류";
			}
		}
		
		if(birthYear < 100)
		{
			birthYear = birthYear + 1900;
		}
		
		age = calcAge(birthYear);
	}
	//나이계산 함수
	private static int calcAge(int bYear) {
		// 실행하면 리턴 값(now.getYear() - bYear)을 날려줌
		LocalDate now = LocalDate.now();
		int result = now.getYear() - bYear;
		return result;
	}

	//나이 계산 함수
	
	//output
	private static void output() {
		
		System.out.println("이름은 " + name);
		System.out.println("전화번호는 " + phone);
		System.out.println("성별은 " + gender);
		System.out.println("나이는 " + age);
		
		
	}

}
