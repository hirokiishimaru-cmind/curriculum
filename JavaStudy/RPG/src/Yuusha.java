
public class Yuusha extends Human{	//Humanクラスから継承

//	コンストラクタ　←インスタンス時に行う処理
//	コンストラクタにより、身長、体重、体力などを初期設定している
	public Yuusha() {
		super.setName("ゆうしゃ");
		super.setGender(1);
		super.setLength(180);
        super.setWeight(70);
        super.setVitality(100);
        super.setMagic(5);
	}
	
//	勇者独自の攻撃メソッド(必殺技)
	public void specialAttack(Human target) {
		String name = super.getName();
        super.setVitality(super.getVitality() - 20);
        System.out.println(name + " の こうげき");
        System.out.println(name + " の ひっさつわざが さくれつした！");

        target.setVitality(target.getVitality() - 50);
        System.out.println(target.getName() + " に 50 のダメージを あたえた");

        super.setVitality(super.getVitality() - 10);
        System.out.println(name + " の たいりょくは" + super.getVitality() + "になった");
        System.out.println("");
	}
}
