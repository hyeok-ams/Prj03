package ex01;

import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class IfTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime now = LocalDateTime.now();
		
		int daywk = now.getDayOfWeek().getValue();
		String wkday = "水";//"月火水木金土日曜日";
		String strwkday = "月火水木金土日曜日";
		if(daywk == 1) {
			wkday = "月";
		}
		else {
			if(daywk == 2){
				wkday = "火";
			}
			else {
				if(daywk == 3){
					wkday = "水";
				}
				else {
					if(daywk == 4){
						wkday = "木";
					}
					else {
						if(daywk == 5){
							wkday = "金";
						}
						else {
							if(daywk == 6){
								wkday = "土";
							}
							else {
								if(daywk == 7){
									wkday = "日";
								}
							}
						}
					}
				}
			}
		}

		System.out.println("한자로 " + wkday + "曜日");
		String wkday2 = "";
		switch(daywk)
		{
		case 1:
			wkday2 = "월";	break;
		case 2:
			wkday2 = "화";	break;
		case 3:
			wkday2 = "수";	break;
		case 4:
			wkday2 = "목";	break;
		case 5:
			wkday2 = "금";	break;
		case 6:
			wkday2 = "토";	break;
		case 7:
			wkday2 = "일";	break;
		default:
			System.out.println("오류");
		}
        
		System.out.println("한글로 " + wkday2 + "요일");
		
		//문자열 잘라서 출력
		System.out.println("한자로 " + strwkday.substring(daywk-1, daywk) + "曜日");

		//국가에서 사용하는 언어로 요일 출력
		String koreanDay = now.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.KOREAN);   // 월요일
		String JapanDay = now.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.JAPAN);   // 월요일
	
		System.out.println("한글 요일은 " + koreanDay);
		System.out.println("한자 요일은 " + JapanDay);
		
		//배열
		String [] daystr = {"월","화","수","목","금","토","일"};
		
		System.out.println("배열로 한 요일은 "+ daystr[daywk-1] + "요일");
		
	}

}