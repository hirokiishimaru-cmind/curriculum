package interfaces;
/*
 * インターフェースには、そのインターフェースに持たせたい機能（処理やタスク）に適した内容を記述していく
 * */
/**
 * 1.インターフェース: 上長（もときさん）の司令
 * <pre>public interface インターフェース名 {}<pre>
 */
public interface OrderFromMotoki {
    /* ----- インターフェースメソッドの {} の処理は何も書かない！ ----- */
    // 司令（月末までに勤務表出せや！
    public void daseyaKinmuhyo();
    // 司令（できれば月末までに交通費出せや！
    public void daseyaKotsuhi();
    // お邪魔虫な司令
    // 例）セブンイレブン行けや！
    // （こじつけてしまえば何でも有りですが、必ずこなす業務的な司令としては、なんか適していないよねって話
    public void goToSevenEleven();
}

// インターフェースのアクセス修飾子には、基本的に public を指定する
