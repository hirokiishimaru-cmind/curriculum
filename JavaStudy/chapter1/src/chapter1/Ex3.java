package chapter1;

public class Ex3 {
//	メインメソッド
//	メインメソッドに関数は書かない
	public static void main(String[] args) {
		sayHello("太郎", 30); //←()実引数
		
//		練習問題
		getName("石丸", "大貴");
	};
	

//ここに関数を書く理由
//	クラスの中に書くかつ、メインメソッドの外に書く
//sayHelloメソッド
	public static void sayHello(String name, int age) {//(Strinig name)仮引数
		System.out.println("Hello" + name + "さん。年齢は" + age + "歳");
	}

//練習問題(引数)
	public static void getName(String lastName, String firstName) {
		String fullName = lastName + firstName;
		System.out.println(fullName);
	}
	
//	戻り値ありの場合
	public int plus (int x, int y){
	    return x + y;
	}


//	戻り値なしの場合
	public void print(){
		String message = "戻り値なし";
	    System.out.println(message);
	}
}