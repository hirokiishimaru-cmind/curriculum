package chapter1;

public class Ex4 {
	 // パラメータ
    String name = null; //なまえ
    int gender = 0; //性別(1:男　2:女)
    int length = 0; //身長
    int weight = 0; //体重
    private String skill = null; //特技
    String hoby = null; //趣味

    // コンストラクタ
    public Ex4(){
    	this.name = "サラリーマン金太郎";
    	this.gender = 1;
    	this.length = 180;
    	this.weight = 80;
    	this.skill = "商談";
    	this.hoby = "編み物";
    }
    //======操作======
    //・営業をする(営業メソッド)
    public void sales() {
    	System.out.println(this.name + "は外回りにいってきます！");
    }
    //・休憩する 
    public void rest() {
    	System.out.println(this.name + "は外回りにいってきます！");
    }
    //・特技メソッド
    public String skill() {
		return this.skill;
	}
    
//  mainメソッド
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Ex4 bm = new Ex4();
			bm.sales();
		bm.rest();
			System.out.println(bm.skill + "が得意です！");
			
//		Ex4Catの処理
		Ex4Cat pepe = new Ex4Cat("ぺぺ", 3);
		pepe.agePlus();
		pepe.age = 4;
		pepe.name = "たま";
		pepe.showName();
		pepe.showAge();
	}

}
