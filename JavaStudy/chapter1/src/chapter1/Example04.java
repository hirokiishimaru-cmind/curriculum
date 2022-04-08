public class Example04 {
    // ① 登録されている名前（USER_NAME）とパスワード（USER_PASSWORD）を定数で定義してください。
    private static final String USER_NAME = "alice";
    private static final String USER_PASSWORD = "alice123";

    // 定数（メッセージ）
    private static final String CONST_MSG_SUCCESS = "ログイン成功です。";
    private static final String CONST_MSG_ERROR_NAME = "名前に誤りがあります。";
    private static final String CONST_MSG_ERROR_PASS = "パスワードに誤りがあります。";
    private static final String CONST_MSG_ERROR_INPUT = "入力情報に誤りがあります。";
   
    public static void main(String[] args) {
        String name = "alice";
        String pass = "alice123";

        // ② 「name」の値が「USER_NAME」と等しく、「 pass 」の値が「USER_PASSWORD」と等しい場合。
        //      定数を使用して「 ログイン成功です 」と出力してください。
        if(name.equals("alice")&& pass.equals("alice123")){
            System.out.println(CONST_MSG_SUCCESS);

        // ③ 「USER_RNAME」の値のみ等しい場合。
       //     定数を使用して「 パスワードに誤りがあります。 」 と出力してください。
        }else if(name.equals("alice")){
            System.out.println(CONST_MSG_ERROR_PASS);

        // ④ 「USER_PASSWORD」の値のみ等しい場合。
       //定数を使用して「 名前に誤りがあります。 」と出力してください。
        }else if(pass.equals("alice123")){
            System.out.println(CONST_MSG_ERROR_NAME);

        // ⑤ 「USER_NAME」も「USER_PASSWORD」の値も間違っていた場合。 
       //定数を使用して「 入力情報に誤りがあります。 」と出力してください。
        }else{
            System.out.println(CONST_MSG_ERROR_INPUT);
        }
    }
}
