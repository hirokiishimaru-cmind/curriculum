//コンストラクタ
package chapter1;

//クラス
class ConstructorSample{
	String str = "Hoge Engineer";	//フィールド変数
	
//	コンストラクタ
//	引数なしver
	public ConstructorSample() {
		System.out.println(str);
	}
	
//	引数ありver
//	public ConstructorSample(String str) {
//		System.out.println(str);
//	}
}

class EmployeeBean{
	int _empId;
	String _department;
	String _name;
	String _tel;
	String _mailAddress;	

//	コンストラクタ : ありの場合の値のセット方法
	public EmployeeBean(int empId, String department, String name, String tel, String mailAddress) {
		this._empId = empId;
		this._department = department;
		this._name = name;
		this._tel = tel;
		this._mailAddress = mailAddress;
	}

}

//Ex.2(Main.java)
public class Ex2 {
	public static void main(String[] args) {
//		インスタンスの生成
//		引数なしver
		 ConstructorSample cs = new ConstructorSample();
		 
//		引数ありver
//		 ConstructorSample cs = new ConstructorSample("Hoge System Engineer");
		 
		 
//		 コンストラクタ : ありの場合の値のセット方法
		 EmployeeBean employeeBean = new EmployeeBean(00000, "技術部", "コンストラクタ", "000-0000-0000", "Java@ぶるー");
		 System.out.println(employeeBean._empId);
		 
	}

}
