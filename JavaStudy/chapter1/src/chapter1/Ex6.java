package chapter1;
//親クラス（継承元）
class Super{
	//【ステップ１】Superクラスにコンストラクタを記述して変数a/b/cの三つを初期化しましょう。
	private String a;
	private String b;
	private String c;
	
//	継承先から呼ばれるコンストラクタ
	public Super(String a, String b, String c) {
//		引数で受け取った値をフィールドに代入
		this.a = a;
		this.b = b;
		this.c = c;
		
		System.out.println(this.a+this.b+this.c);
	}
}

//子クラス（継承先）
class A extends Super{
	//コンストラクタ
	public A () {
		super("A", "A", "A");	//継承元のインスタンスを呼ぶ
	}
}
class B extends Super{
	public B () {
		super("B", "B", "B");
	}
}
class C extends Super{
	public C () {
		super("C", "C", "C");
	}
}

//mainメソッド
public class Ex6 {

	public static void main(String[] args) {
		// 【ステップ２】Mainクラスでインスタンス生成して変数a/b/cをコンソールに表示する。
		A a = new A(); 
		B b = new B();
		C c = new C();
	}

}
