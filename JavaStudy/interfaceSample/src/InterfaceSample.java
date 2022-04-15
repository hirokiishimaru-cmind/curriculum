/*
 * インターフェースの使い方
 *  定数とメソッドのみが定義できる。
    インターフェースのメンバ変数は自動的に「public static final」が付けられるので定数になる

    インターフェースのメソッドは抽象メソッドと同様に、インターフェースを実装したクラスでメソッドを実装する必要がある
    クラスにインターフェースを実装するにはimplementsを使用する
   */

//インターフェースの作成（インターフェースの宣言）
interface Calcs{
	//メンバー変数の定義
	int NUM1 = 1;
	int NUM2 = 2;
	
	//メソッド（型のみ宣言）
	void calc();
}

//インターフェースを実装し、足し算するクラスを作成（実装先のAddクラス）
class Add implements Calcs{
	//メソッドの実装
	public void calc() {
		System.out.println(NUM1 + NUM2);	//足し算を行うように変更
	}
}
//インターフェースを実装し、引き算するクラスを作成（実装先のSubクラス）
class Sub implements Calcs{
	//メソッドの実装
	public void calc() {
		System.out.println(NUM1 - NUM2);	//引き算を行うように変更
	}
}

//インターフェースを実装したクラスを実行するクラスを作成
public class InterfaceSample {
	public static void main(String[] args) {
		//足し算するクラスを実行
		Add add = new Add();
		add.calc();
		
		//引き算するクラスを実行
		Sub sub = new Sub();
		sub.calc();
	}

}
