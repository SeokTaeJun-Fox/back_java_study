package dateTest;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class CalendarTest {
	public static void main(String[] args) {
//		싱글턴 패턴
//		프로그램 전체에서 단 하나의 객체만 존재하는 것을 보장하는 디자인 패턴
//		new Calendar 안됨
		Calendar calendar = Calendar.getInstance();
//		System.out.println(calendar.getTime());
//		System.out.println(calendar.getWeekYear());		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		
		System.out.println(simpleDateFormat.format(calendar.getTime()));
		
//		Date는 생각보다 안쓴다. => LocalDate
		LocalDate now = LocalDate.now();
		System.out.println(now);
		
		LocalDateTime now2 = LocalDateTime.now();
		System.out.println(now2);
		System.out.println(now2.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 hh시 mm분 ss초")));
		
		System.out.println(LocalDate.parse("1990년 10월 10일", DateTimeFormatter.ofPattern("yyyy년 MM월 dd일"))); 
	}
}
