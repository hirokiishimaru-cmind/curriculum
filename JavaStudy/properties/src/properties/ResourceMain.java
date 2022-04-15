package properties;

import java.util.ResourceBundle;

public class ResourceMain {

	public static void main(String[] args) {
		// ResourceBundleクラスを使用することで、簡単にプロパティファイルから値を読み込むことができる
//		ResourceBundle bundle = ResourceBundle.getBundle("任意のファイル名(拡張子なし)");
//		String value = bundle.getString("任意のキー");
//		System.out.println(value);
		
		//プロパティファイルを呼び出し、日本語を取得
		ResourceBundle bundle = ResourceBundle.getBundle("test");
		String value = bundle.getString("String");
		System.out.println(value);

	}

}

