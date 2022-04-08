package chapter1;

//社員クラス(親クラス・継承元)
class Employee {
	//empId : 社員番号
	private int empId;
	
	//name : 氏名
	private String name;
	
	/**
     * コンストラクタ: 引数あり
     * @param empId
     * @param name
     */
	public Employee(int empId, String name) {
		this.empId = empId;	//インスタンスのフィールド変数empIdを指している
		this.name = name;	//インスタンスのフィールド変数empIdを指している
	}
	
	// ... フィールド変数のゲッターとセッター（※省きます）

    /**
     * 社員情報をコンソールへ出力するメソッド
     */
	public void printEmployeeInfo() {
		System.out.println("社員番号 : " + this.empId);
		System.out.println("氏名 : " + this.name);
	}
}

//社員クラス(Employee)を継承したhogeの社員クラス（子クラス・継承先）
class hogeEmployee extends Employee{
	/** isTrainee: 研修生フラグ（研修生であるかどうかを true/false で判断するためのフィールド変数） */
	boolean isTrainee;
	
//	コンストラクタ
//	public hogeEmployee() {
//	}
	
	/**
     * コンストラクタ: 引数あり
     * @param empId
     * @param name
     */
	public hogeEmployee(int empId, String name) {
		// ①挙動確認: 親クラス（Employee）のコンストラクタを呼び出す
		super(empId, name);
		
		// ③挙動確認: thisを指定せずに格納する その1
		boolean isTrainee;
		if(empId != 10192) {
			isTrainee = true;
		}else {
			isTrainee = false;
		}
		System.out.println(this.isTrainee ? "研修生です" : "研修生ではありません");
	}
	
	/**
     * コンストラクタ: 引数あり
     * @param empId
     * @param name
     * @param isTrainee
     */
	public hogeEmployee(int empId, String name, Boolean isTrainee) {
		// ①挙動確認: 親クラス（Employee）のコンストラクタを呼び出す
		super(empId, name);
		
		// ②挙動確認: 自クラスのフィールド変数（isTrainee）へコンストラクタの引数を格納する
		this.isTrainee = isTrainee;
		
		// ③挙動確認: thisを指定せずに格納する その2
		isTrainee = true;
		System.out.println(this.isTrainee ? "研修生です" : "研修生ではありません");
		
		// ④挙動確認: thisとsuperで同じメソッドを呼び出す
		this.printEmployeeInfo();
		super.printEmployeeInfo();
	}
}


public class Ex7 {
}
