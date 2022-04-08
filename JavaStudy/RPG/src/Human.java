
//継承元のクラスHuman
//必要最低限の「共通する基本情報」を用意している
public class Human {
//	フィールド変数
	private String name = null; //名前
	private int gender = 0; //性別
	private int length = 0; //身長
	private int weight = 0; //体重
	private int vitality = 0; //たいりょく
	private int magic = 0; //まりょく
//	privateなので、データ参照や変更は、setname, getNameといったsetter、getterと呼ばれるメソッドを使う
	
//	コンストラクタ(インスタンス時の処理)
	public Human() {
	}
	
//	getter・setter(名前)
	public String getName() {
		return name;	//入力された名前をnameに渡す
	}
	public void setName(String name) {
		this.name = name;	//フィールド変数（ここだとname）に値を代入する
	}
	
//	getter・setter(性別)
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	
//	getter・setter(身長)
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	
//	getter・setter(体重)
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
//	getter・setter(たいりょく)
	public int getVitality() {
		return vitality;
	}
	public void setVitality(int vitality) {
		this.vitality = vitality;
	}
	
//	getter・setter(まりょく)
	public int getMagic() {
		return magic;
	}
	public void setMagic(int magic) {
		this.magic = magic;
	}
	
//	はなす処理
	public void talk(String about) {
		System.out.println(about);
	}
	
//	食べる処理
	public void eatFood(String food) {
		
		int foodType = 0;
		if("やくそう".equals(food)) {
			foodType = 1;
		}else if ("まほうのみず".equals(food)) {
			foodType = 2;
		}else {
			foodType = 3;
		}
		digestFood(foodType);	//食べ物を消化する処理の呼び出し
	}
	
//	消化する処理
	private void digestFood(int foodType) {	//カプセル化して処理はするが、結果を表示させない
		if(foodType == 1) {
			vitality += 10;	//たいりょくを10回復
		}else if(foodType == 2) {
			magic += 10;	//まりょくを10回復
		}else {
			vitality += 1; //たいりょくを1回復
		}
	}
}


