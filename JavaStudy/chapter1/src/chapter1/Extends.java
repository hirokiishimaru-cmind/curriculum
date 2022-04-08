package chapter1;

//クリーチャークラス（継承元、親クラス）
class Creature {
	//メソッド
	void walk() {
		System.out.println("歩いています");
	}
	void speak() {
		System.out.println("しゃべっています");
	}
	void speaks() {
		System.out.println("しゃべっています");
	}
}

//バードクラス（継承先、子クラス）
class Bird extends Creature{//親クラスのCreatureをextendsで継承している
	void speak() {	//オーバーライドしている
		System.out.println("鳴いています");
	}
	void speaks() {
		super.speaks();	//親クラスにある「しゃべっています」というspeaksメソッドをそのまま使いたいときsuperをつける
						//superをつけることで親クラスのメソッドが優先される
	}
}

public class Extends {
	//オーバーロード
	//メソッド名が同じでも引数の個数が違う場合、名前が同じメソッドを複数書くことができる
	public static void Sum() {
		System.out.println("合計します");
	}
	public static void Sum(int a) {
		System.out.println(a);
	}
	public static void Sum(int a, int b) {
		System.out.println(a + b);
	}
	
	
	public static void main(String[] args) {
		//継承、オーバーライド
		Bird suzume = new Bird();
		suzume.speak();
		
		//オーバーロード
		Sum();//合計します
		Sum(10);//10
		Sum(10, 20);//30
	}

}
