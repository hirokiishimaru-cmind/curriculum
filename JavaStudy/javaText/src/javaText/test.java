package javaText;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class test {

	public static void main(String[] args) throws ParseException {
		// 入力した日時をStringで受け取る
		String dateTime = "2022/04/11 11:00:00";
		
		/*
		 *  SimpleDateFormatの引数へ日時データに変換したいデータと同じパターンを記述し、
    		Stringクラスの日時形式データを、日時データへ変換する準備をする
    	*/
		//　受け取った値をSimpleDateFormatで解析してDate型に変換
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		
		//作成したSimpleDateFormat型の変数「sdf」を使用して、日時データであることを表すDate型への変換を行う
		//変換したDate型変数から年だけを取り出し、取り出した年を用いて何らかの処理を記述する
		Date date = sdf.parse(dateTime);
		System.out.println(date);
	}

}
