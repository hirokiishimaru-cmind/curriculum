import java.util.Calendar;

public class CalenMain {

	public static void main(String[] args) {
		// 今の年月日を表示
		Calendar cal = Calendar.getInstance();
		//addメソッドを使用して、月の値を+7する　マイナスにも可能
//		cal.add(Calendar.MONTH, 7);
		
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH) + 1);
		//Calendar.MONTHは、JANUARY(実値 = 1）〜UNDECIMBER(実値 = 11)まで存在し、
		//実際の月の値は、「−１」の値を保持しているため、「+1」することで実際に表示されている月の値を調整している
		
		System.out.println(cal.get(Calendar.DATE));
		
		printLeapYear(Calendar.YEAR);
	}
	
	//うるう年判定
	//西暦年号が4で割り切れる年
	public static void printLeapYear(final int year) {
		boolean isLeapYear = false;
		if(year % 4 == 0) {
			if((year % 100) == 0) {
				isLeapYear = ((year % 400) == 0);
			}else {
				isLeapYear = true;
			}
		}
		System.out.println(year + "年はうるう年" + (isLeapYear ? "です。" : "ではありません。"));
	}

}
