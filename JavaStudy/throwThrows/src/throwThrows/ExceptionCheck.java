package throwThrows;
//サンプル : hogeオフィスは、帝国ホテルか、六本木ヒルズか問題

import java.util.Objects;

public class ExceptionCheck {
	
	private static final String CONST_ROPPONGI_HILLS = "六本木ヒルズ";		//定数
	private static final String CONST_IMPERIAL_HOTEL = "帝国ホテル";

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String hogeOffice = CONST_ROPPONGI_HILLS;
		
		try {
			//オフィスが間違ってたら意図的に例外を発生させる
			if(!hogeOffice.equals(CONST_IMPERIAL_HOTEL)) {
				throw new Exception("オフィスは帝国ホテルだよ");
			}
			//余計な条件分岐(else)を記述しない
			//最初のif文で例外を発生させると後続の処理は実行されず、catch内に処理が移るため、不要なロジックを記述せずに済む
			
			//例外でthrowされた以降の処理は実行されない
			System.out.println("hogeのオフィスは" + CONST_IMPERIAL_HOTEL + "です。");
		}catch(Exception e) {
			System.out.println("オフィスが間違ってます。");
			System.out.println(e);
		}
		
		
		//パターン１　hogeOfficeがNULLの場合の考慮
		hogeOffice = null;
		
		try {
			//hogeOffice == null でも可
			if(Objects.isNull(hogeOffice)) {
				throw new Exception("変数hogeOfficeがNULLです！");
			}
			if(!hogeOffice.equals(CONST_IMPERIAL_HOTEL)) {
				throw new Exception("オフィスは帝国ホテルだよ。");
			}
			System.out.println("hogeのオフィスは" + CONST_IMPERIAL_HOTEL + "です。");
		}catch (Exception e) {
			System.out.println("オフィスが間違っています");
			System.out.println(e);
		}
		
		
		//パターン２　hogeOfficeを用いた処理で例外が発生しないようにする
		try {
			//　「hogeOfficeからequalsメソッドを呼ばない」ように記述
			if(!CONST_IMPERIAL_HOTEL.equals(hogeOffice)) {
				throw new Exception("オフィスは帝国ホテルだよ。");
			}
			System.out.println("hogeのオフィスは" + CONST_IMPERIAL_HOTEL + "です。");
		}catch(Exception e) {
			System.out.println("オフィスが間違ってます。");
			System.out.println(e);
		}
	}
}
