//	戦闘シーン
public class Main {
//	メイン処理
	public static void main(String[] args) {
		// 各キャラクターのオブジェクトを生成
		Yuusha Yuusha = new Yuusha(); //勇者オブジェクト(インスタンス)を生成
		Wizard wizard = new Wizard(); // 魔法使いオブジェクトを生成
		Cleric crelic = new Cleric(); //僧侶オブジェクトを生成
		LastBoss lastBoss = new LastBoss(); // ラスボスオブジェクトを生成
		
		//敵が現れた
		System.out.println(lastBoss.getName() + " が　あらわれた！");
		
		//バトル開始
		//各キャラクターの攻撃メソッドにターゲットを指定( ()の中に攻撃先のターゲットのコンストラクタ名を書く )
		Yuusha.specialAttack(lastBoss);	//ラスボスに勇者が攻撃
		wizard.magicAttack(lastBoss);	//ラスボスに魔法使いが攻撃
		lastBoss.specialEvilAttack(Yuusha);	//勇者にラスボスが攻撃
		crelic.healingMagic(Yuusha); //僧侶が勇者を回復

		//回復アイテムを使用
		System.out.println(Yuusha.getName() + "　は　やくそう　をつかった");
		Yuusha.eatFood("やくそう");
		System.out.println(wizard.getName() + "　は　まほうのみず　をつかった");
		wizard.eatFood("まほうのみず");
		System.out.println("");
		
		//ステータス表示
		showStatus(Yuusha);
		showStatus(wizard);
		showStatus(crelic);
		showStatus(lastBoss);
	}
	
//	ステータス表示メソッド
	private static void showStatus(Human target) {
		System.out.println("- " + target.getName() + "　のステータス ---");
		if( target.getGender() == 1) {
			System.out.println("せいべつ : 男");
		}else {
			System.out.println("せいべつ : 女");
		}
		System.out.println("しんちょう ： " + target.getLength());
        System.out.println("たいじゅう ： " + target.getWeight());
        System.out.println("たいりょく ： " + target.getVitality());
        System.out.println("まりょく ： " + target.getMagic());
        System.out.println("");
	}

}
