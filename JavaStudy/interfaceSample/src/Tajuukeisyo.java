//多重継承

//インターフェースの宣言
interface Adds{
    //メンバ変数(定数)
    public int A = 3;
    public int B = 6;
    
    //メソッド(型のみ宣言)
    void method(String str);
    void add();
}
 
//インターフェースの宣言
interface Multiply{
    //メンバ変数(定数)
    public int A = 4;
    public int B = 8;
    
    //メソッド(型のみ宣言)
    void method(String str);
    void mul();
}
 
//インターフェースの実装
class Calc implements Adds, Multiply{
    public void method(String str) {
        // 文字列の表示
        System.out.println(str + "をします");
    }
    public void add() {
        // Addインターフェース内の足し算
        System.out.println("計算結果: " + (Adds.A + Adds.B));
    }
    public void mul() {
        // Multiplyインターフェース内の掛け算
        System.out.println("計算結果: " + (Adds.A * Adds.B));
    }
}
 
//実行Mainクラス
public class Tajuukeisyo {
 
    public static void main(String[] args) {
        Calc calc = new Calc();
        calc.method("足し算");
        calc.add();
        calc.method("掛け算");
        calc.mul();
    }
 
}