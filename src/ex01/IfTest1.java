package ex01;

import java.time.LocalDateTime;

public class IfTest1 {

	public static void main(String[] args) {
		//아침 :  9~11시 
		//점심 : 11~15시
		//Break: 15~17시 
		//저녁 : 17~20시
		
		//컴퓨터의 시간을 가져온다 : class 를 사용해서
		LocalDateTime now = LocalDateTime.now();
		
		int		hour = 21;
		String	mealTime = "";
		
		System.out.println(now);
		System.out.println(now.getHour());
		
		hour = now.getHour();
		
		if(9 <= hour && hour <= 11) {
			mealTime = "아침";
		}
		else {
			if(12 <= hour && hour <= 15)
			{
				mealTime = "점심";
			}
			else {
				if(16 <= hour && hour <= 17)
				{
					mealTime = "Break";
				}
				else {
					if(18 <= hour && hour <= 20)
					{
						mealTime = "저녁";
					}
					else {
						mealTime = "Close";
					}
				}
			}
			
		}
		/*
		else if(12 <= hour && hour <= 15){
			mealTime = "점심";
		}
		else if(16 <= hour && hour <= 17){
			mealTime = "Break";
		}
		else if(18 <= hour && hour <= 20){
			mealTime = "저녁";
		}
		else
		{
			mealTime = "Close";
		}
		*/
			
		System.out.println(mealTime + " 시간 입니다.");
		
		String wkday = "수";
		System.out.println(now.getDayOfWeek());
		System.out.println(wkday + "요일");
		wkday = now.getDayOfWeek().toString();
		System.out.println(wkday + "요일");
		
		int year = now.getYear();
		int month = now.getMonthValue();
		int day = now.getDayOfMonth();
		System.out.println("년도:" + year + "년");
		System.out.println("월:" + month + "월");
		System.out.println("일:" + day + "일");
		System.out.println(now.getMonth());
		System.out.println(now.getMonthValue());
		wkday = now.getDayOfWeek().toString();
		System.out.println("요일:" + wkday);
		System.out.println(now.getDayOfWeek().getValue()); //1(월)~7(일)
		//문자형으로 변환
		wkday = String.valueOf(now.getYear());
		System.out.println("년도:" + wkday + "년");
		wkday = String.valueOf(now.getMonthValue());
		System.out.println("월:" + wkday + "월");
		wkday = String.valueOf(now.getDayOfMonth());
		System.out.println("일:" + wkday + "일");
		wkday = now.getDayOfWeek().toString();
		System.out.println("요일:" + wkday);
		
		System.out.println(now.getYear() + "-" + now.getMonthValue() + "-" + now.getDayOfMonth() + " " + now.getDayOfWeek());
		
		
		
		
		
	}

}
