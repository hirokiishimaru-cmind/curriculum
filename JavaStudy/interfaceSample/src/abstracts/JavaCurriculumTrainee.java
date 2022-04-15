/**
 * 
 */
package abstracts;

/**
 * @author s2190166
 *	抽象クラスの作成
 *	抽象クラス: Javaのカリキュラムだけしかこなせないクラス
 */
public abstract class JavaCurriculumTrainee {
	private String name;
	
	/**
	 * コンストラクタ
	 * @param name
	 * */
	public JavaCurriculumTrainee(String name) {
		this.name = name;
	}
	
	/**
	 * 抽象メソッド：Javaカリキュラムをこなす！
	 * */
	//abstractの継承対象は、類似性の高いクラス
	public abstract void doJavaCurriculum();
	
	/**
	 * @return name
	 * */
	protected String getName() {
		return name;
	}
}
