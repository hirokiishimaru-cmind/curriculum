// クラス・フィールド変数
// クラスとは・・・
// データ（変数）と処理（メソッド）の集まり
public class Example06 {
    // 1. クラスをプログラミング

    // クラスをプログラミングするルール
    // (1) 必ず public class クラス と記述
    // (2) {}で囲むように「データ」と「処理」を記述

    public class Sample{
        // データ(変数) クラスが持つ情報・ステータスなど
        private String name = "Aさん";
        private int id = 001;
        private String comment = "Hello";

        // 処理(メソッド)   クラス内で行いたいタスク・TODO・ふるまいを指す
        // メソッド内でしか使えない変数はローカル変数
        // メソッド外では参照できない
        public String getName(){
            return this.name;
        }
        public int getId(){
            return this.id;
        }
        public String getComment(){
            return this.comment;
        }
    }
    //2. 呼び出し側のプログラミング 
    // Main.javaでSample.javaを呼び出し、「データ」や「処理」を使えるようにする

    // サンプルクラス「HelloJava.java」
}