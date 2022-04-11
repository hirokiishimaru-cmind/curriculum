import java.util.Calendar;

//Calendarクラスから呼び出し可能なDate値
public class DateMain2 {

	public static void main(String[] args) {
		// CalendarクラスのgetTime()メソッドを実行
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());
	}

}
