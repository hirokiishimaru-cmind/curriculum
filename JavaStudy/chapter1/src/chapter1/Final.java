package chapter1;

import java.util.Objects;

//final修飾子
//仕様
//入力値を受け取り、入力値に沿ったメッセージを返し、コンソールへ出力する
public class Final {
	/**
	 * 入力値ごとのメッセージを返却する
	 * @param paramInput <pre>入力値</pre>
	 * @return
	 */
	public String validateInput(final String paramInput) {
		String message = null;	//ローカル変数
		if(Objects.isNull(paramInput)) {
			//入力値が未存在
			message = "Nullです!";
		}else if(paramInput.isBlank()) {
			//Java11~提供のメソッド
			//入力値がブランク(" ") ← 空文字ではなく、半角スペースがある状態
			message = "ブランクです！";
		}else if(paramInput.isEmpty()) {
			//入力値が空文字("")
			message = "空文字です！";
		}else {
			//入力値が存在
			message = "入力値あります！";
		}
		return message;
	}
	public static void main(String[] args) {
		String message = validateInput("入力値");
		System.out.println(message);
	}
}
