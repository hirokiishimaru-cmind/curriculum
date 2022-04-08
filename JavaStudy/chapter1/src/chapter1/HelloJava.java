    // クラス *クラス名の一文字目は半角英大文字で記述
    // クラスは、家で例えると家を建てる設計図
    // インスタンスは、設計図（クラス）を元にして作った家
    // インスタンス化は、設計図(クラス)から家（インスタンス）を建築（つくる）こと
public class HelloJava{
    // フィールド  ＊クラス内の変数のこと

    // 「private」の場合はこのHelloJavaクラス内のみで使用可能
    private String message;

    // コンストラクタ
    public HelloJava(){
        message = "Hello, Java!";
    }

    // メソッド
    public void print(){
        System.out.println(message);
    }
}

// mainメソッド
// プログラムを実行するためのクラス（mainメソッドを持つクラス）
public class Main {
    // mainメソッド
    public static void main(String[] args) {
        // HelloJavaクラスのインスタンスを生成して、HelloJavaクラス型の変数hjに保持する
        // new演算子は、クラスをインスタンス化するために利用
        // クラス名 インスタンス名 = new コンストラクタ名(引数)
        HelloJava hj = new HelloJava();

        // 生成したインスタンスより、HelloJavaクラスのprintメソッドを呼び出す
        hj.print();
    }
}

// アクセス修飾子
// クラスや変数がどこからアクセスできるかの公開範囲
// 「public」「private」などをアクセス修飾子という
// フィールド変数を宣言するときに記述

// 「public」の場合は全てのクラスからアクセスできる
// 「private」の場合はこのHelloJavaクラス内のみアクセスできる
// 「」（無記述）の場合はHelloJavaクラス内と同じパッケージのクラスからアクセスできる
// 「protected」の場合は現在のクラスとサブクラスからアクセスできる
