package chapter1;

public class Ex4Cat {
	
//	フィールド変数
	private String name;	//カプセル化するには変数を「private」に
	public int age;
	
//	コンストラクタ
	public Ex4Cat(String n, int a) {
		this.name = n;
		this.age = a;
	}
	
	public void showName() {
		System.out.println("名前は、" + this.name + "です。");
	}
	
	public void showAge() {
		System.out.println("年齢は、" + this.age + "才です。");
	}
	
	public void agePlus() {
		age++;
	}
	
//	mainメソッド
	public static void main(String[] args) {
		Ex4Cat pepe = new Ex4Cat("ぺぺ", 3);
		pepe.agePlus();
		pepe.age = 4;
		pepe.name = "たま";
		pepe.showName();
		pepe.showAge();
	}
}
