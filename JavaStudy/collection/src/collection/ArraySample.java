package collection;
import java.util.ArrayList;
import java.util.List;

public class ArraySample {

	public static void main(String[] args) {
//		List<データ型>インスタンス名 = new ArrayList<>();
		List<String> list = new ArrayList<>();
		list.add("abc"); //listに値を追加
		list.add("def");
		list.add("ghi");
		for(String s:list) {
			System.out.println(s);
		}
//		指定した要素を取得したい場合　getメソッドを使用
		String dataString = list.get(2);
		System.out.println(dataString);

	}

}
