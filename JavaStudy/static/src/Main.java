public class Main {

	public static void main(String[] args) {
		// staticメソッドの場合
		Output.staticMethod();
		
		//staticメソッドじゃ無い場合
		Output1 output_test = new Output1();	//インスタンス
		output_test.instanceMethod();
	}
	
	//staticメソッドの使用例	基本的なstaticメソッドの使い方
	class Output{
		public static void staticMethod() {
			System.out.println("StaticMethodです");
		}
	}
	
	class Output1{
		//staticメソッドを使わない場合
		public void instanceMethod() {
			System.out.println("StaticMethodではない");
		}
	}
}
