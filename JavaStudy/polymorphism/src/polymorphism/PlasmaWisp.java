package polymorphism;

//サブクラス：プラズマ（電気飛ばしてくる青白い雲みたいなやつ）
public class PlasmaWisp extends AblityOfEnemy {
	public PlasmaWisp(String attackName) {
		super.attackName = attackName;
	}

	@Override
	protected void useAbility() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(super.attackName);
	}
}
