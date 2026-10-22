package ex02;

public class ForTest02 {
	public static void main(String[] args) {
		char [] a = {'가','나','다','라','마'};
		for(int i=1; i <= 5; i++) {
			System.out.println(i + ".이름");
		}
		System.out.println(a.length);
		for(int i = 0 ;i <= a.length - 1 ; i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println();
		int i2 = 1;
		while(i2 <= 5) {
			System.out.println(i2 + ".이름");
			i2++;
		}
		i2 = 1;
		while(i2 <= 5 ) {//조건문이 확인되고 true 일 때 아래 실행문 실행
			System.out.println(a[i2-1]);
			i2++;
		}
		
		int i3 = 1;
		do {//실행문 우선 실행하고
			System.out.println(i3 + ".이름");
			i3++;
		}while(i3 <= 5); //조건 확인
		
		
	}
}
