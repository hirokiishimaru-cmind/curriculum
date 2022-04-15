package polymorphism;

//サブクラス：ナイト（緑色の装甲の剣振り回してくるやつ）
public class BradeKnight extends AblityOfEnemy {

	public BradeKnight(String attackName) {
		super.attackName = attackName;
	}
	@Override
	protected void useAbility() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(super.attackName);
	}
	
}
