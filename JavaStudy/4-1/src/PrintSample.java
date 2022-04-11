import java.util.Date;

//printfメソッド
public class PrintSample {

	public static void main(String[] args) {
		// int型整数(「12345」)を8進数表記に変更したい場合
	    int math = 12345;
	    
	    //int型変数mathの中身「12345」を8進数に変換

	    System.out.printf("%o", math);
	    //printf()の第一引数に書式指定子、第二指定子に変換したい値を記述する
	    //今回は「12345」を8進数表記にしたいので、
	    //数字を8進数表記に変換する指定子「%o」を指定している
	    
	    System.out.println();
	    
	    //int型整数「1」の前に0をつけたい場合(0詰めして表示したい場合)
	    int one = 1;

	    //「1」を「01」に変換
	    System.out.printf("%02d", one);
	    //「02」は出力される文字数を表している
	    //今回は1文字の「1」を0詰め表示させるので、結果は「01」となる
	    //第二引数の不足分を0詰めするイメージ
	    //また、「d」は10進数表記の指定子
	    //つまり「第二引数の書式を維持したまま0詰めして出力する」記述が「%02d」となる
	    
	    System.out.println();
	    
	    
	    //1月〜12月を表示（1〜9は0詰めして表示させる）
	    for(int i = 0; i <=12 ; i++) {
	    	if(i == 0) {
	    		continue;
	    	}
	    	System.out.printf("%02d", i);
	    }
	    System.out.println();
	    
	    
//	    System.out.printf()による日時の出力
//	    printf()の指定子を用いることで、日時データのフォーマットを変換して出力することが可能
	    Date date = new Date();
	    System.out.printf("%tY年%<tB%<te日(%<ta)%<tp%<tI時%<tM分", date);
	}

}
