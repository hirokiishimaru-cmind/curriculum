import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.Year;
import java.time.ZonedDateTime;

public class TimeMain {

	public static void main(String[] args) {
		// LocalDateとLocalTimeのインスタンスを持つLocalDateTime
		LocalDateTime ldtNow = LocalDateTime.now();
		System.out.println(ldtNow.toString());
		
		//LocalDateTimeに加え、オフセット(標準時との時差)を含むOffsetDateTime
		OffsetDateTime odtNow = OffsetDateTime.now();
		System.out.println(odtNow.toString());
		
		//OffsetDateTimeに加え、タイムゾーンを含むZonedDateTime
		ZonedDateTime zdtNow = ZonedDateTime.now();
		System.out.println(zdtNow.toString());
		
		//Timeクラスは、DateクラスやCalendarクラスと異なり、直接値を変更することができない
		//値を変更する場合はインスタンスを生成し直す必要がある
		
		//今の月の値
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt.getMonthValue() + "月");
		
		//月の値を12に変更
		ldt = ldt.withMonth(12);
		System.out.println(ldt.getMonthValue() + "月");
		
		
		//isLeap()メソッド
		//TimeクラスにはYearクラスをいうものが存在し、そのYearクラスでは、うるう年を判定するstaticメソッドが用意されている
		
		//変数yearが2020の場合
		int year = 2020;
		System.out.println(year + "年は、うるう年" + (Year.isLeap(year)? "です。" : "ではありません。"));
	}
}
