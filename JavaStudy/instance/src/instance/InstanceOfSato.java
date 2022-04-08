package instance;

import java.util.Objects;

//フィールド変数のハッシュコードを元に、インスタンスの同一性をチェックするクラス
public class InstanceOfSato {
	private String firstName;
	//変数（フィールド変数）
	private int id = 0;
	//static変数（クラス変数）
	private static int staticVarId = 0;
	
//	コンストラクタ
	public InstanceOfSato(String firstName) {
		this.firstName = firstName;
	}

/*-- 自動生成部分 --*/
	@Override 
	public int hashCode() {
		return Objects.hash(firstName);	//fitstNameの値のハッシュコードを戻り値として返している
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof InstanceOfSato)) {
			return false;
		}
		InstanceOfSato other = (InstanceOfSato) obj;
		return Objects.equals(firstName, other.firstName);
	}
/*-- 自動生成部分 --*/
	
//	IDをインクリメント
	public void incrementId() {
		this.id++;
		//インスタンスを生成すつ度に初期化されるため、インクリメント後の出力値は常に1
		System.out.println("id: var     = " + this.id);
		
		InstanceOfSato.staticVarId++;
		//InstanceOfSatoクラスにおいて一意である
		//同一の値を使用するため、インクリメントの後の出力値は、incrementId()メソッドを使用する回数に比例する
		System.out.println("id: static var   = " + InstanceOfSato.staticVarId);
	}
}
