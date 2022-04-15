package abstracts;

//クラスへ抽象クラスの継承が完了

//「Javaカリキュラムだけこなせよ！って決まり事がある抽象クラス」を継承した研修生クラス
public class Trainee extends JavaCurriculumTrainee {

	public Trainee(String name) {
		super(name);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public void doJavaCurriculum() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("わたくし、" + super.getName() + "は、Javaカリキュラムをこなします(｀･ω･´)ゞ！");
		
	}

}
