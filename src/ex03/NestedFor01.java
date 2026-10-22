package ex03;

public class NestedFor01 {
	public static void main(String[] args) {
		
		star1();
		
		System.out.println("");
		
		star2();
		System.out.println("");
		
		star3();
		
		System.out.println("");
		
		star4();
		
		System.out.println("");

		star5();
		
		System.out.println("");
	}
	//star5()
	private static void star5() {
		//이중 for 문
		System.out.println("5.");
		for(int i = 1;i <=5; i++)
		{
			String st = "";
			for(int j = 1; j <= 5; j++)
			{
				st= st+"*";
			}
			System.out.println(st);
		}
		
	}
	
	//star4()
	private static void star4() {
		//이중 for 문
		System.out.println("4.");
		for(int i = 1;i <=5; i++)
		{
			for(int j = 1; j <= 5; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	//star3()
	private static void star3() {
		//이중 for 문
		System.out.println("3.");
		for(int i = 1;i <=5; i++)
		{
			System.out.print("*");
			System.out.print("*");
			System.out.print("*");
			System.out.print("*");
			System.out.print("*");
			System.out.println();
		}
		
	}

	//star2()
	private static void star2() {
		// TODO Auto-generated method stub
		System.out.println("2.");
		for(int i = 1; i <= 5; i++) {
			System.out.println("*****");
		}
	}

	//star1()
	private static void star1() {
		System.out.println("1.");
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("*****");
		
	}
	
}
