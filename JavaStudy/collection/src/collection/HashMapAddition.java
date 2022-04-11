package collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapAddition {

	public static void main(String[] args) {
		//パターン1
		Map<String, String> sampleHashMap = new HashMap<String, String>();	//生成したHashMapクラスのインスタンスをMapインターフェース型のsampleHashMapに保持
		sampleHashMap.put("apple", "りんご");		//putというメソッドで要素の追加を行う
		sampleHashMap.put("orange", "みかん");
		sampleHashMap.put("peach", "もも");
		
		//putメソッドには引数を2つ指定する
		//第1引数がキー、第2引数がキーに紐づく値
		
		//パターン2
		sampleHashMap = new HashMap<String, String>(){
			{
				put("apple", "りんご");
				put("orange", "みかん");
				put("peach", "もも");
			}
		};
		
		//キー値を指定して取得
		System.out.println(sampleHashMap.get("apple"));	//値を取り出すときは、getメソッドを使う get()の引数はObject
		System.out.println(sampleHashMap.get("orange"));
		System.out.println(sampleHashMap.get("peach"));
		System.out.println(sampleHashMap.get("mango"));
	}

}
