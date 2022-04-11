//ArrayListクラス / LinkedListの使用例

package collection;

//utilパッケージのArrayListクラスをimport
import java.util.ArrayList;
//utilパッケージのLinkedListクラスをimport
import java.util.LinkedList;
//utilパッケージのListクラスをimport
import java.util.List;

public class ArrayMain {

    public static void main(String args[]) {
        // LinkedListを使用する場合は以下のように書きます
         List<String> sampleList1 = new LinkedList<String>(); 
        
        // パターン1
        List<String> sampleList = new ArrayList<String>();	//Arrayクラスのインスタンスを、Listインターフェース型の変数sampleListに保持している
        sampleList.add("ABC");	//Listインターフェースでは、要素の追加はaddメソッドで行う
        sampleList.add("DEF");	//Listインターフェースでは、要素の追加はaddメソッドで行う

        // パターン2
        sampleList = new ArrayList<String>() {
            {
                add("ABC");
                add("DEF");
            }
        };
        
        //パターン１とパターン2は同じ意味合いを持つ

        // リストに格納した全要素を順番に出力
        for (int i = 0; i < sampleList.size(); i++) {
            System.out.println(sampleList.get(i));	//値を取り出す時はgetメソッドを使う
        }
    }
}