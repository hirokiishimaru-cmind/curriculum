import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBAccess {
	//下記のようにあらかじめ定数として記述する
	//理由
	//1.変更の多い値ではない
	//2.なんども同じように、ホスト名やデータベース名を記述する必要がない
	//3.コーディングのケアレスミスをなくす
	
    /** ドライバーのクラス名 */
    private static final String POSTGRES_DRIVER = "org.postgresql.Driver";
    /** ・JDMC接続先情報 */
    //jdbc:postgresql:// ホスト名 / データベース名
    private static final String JDBC_CONNECTION = "jdbc:postgresql://localhost:5432/jdbc_sample";
    /** ・ユーザー名 */
    private static final String USER = "postgres";
    /** ・パスワード */
    private static final String PASS = "dock6132";
    public static void main(String[] args) {
        Connection connection = null;
        try {
            // データベースに接続する準備
            Class.forName(POSTGRES_DRIVER);
            //接続先の情報
            //DriverManagerクラスのgetConnection()メソッドを使用してデータベースへ接続する
            connection = DriverManager.getConnection(JDBC_CONNECTION, USER, PASS);
                    
        // forName()で例外発生
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        // getConnection()で例外発生
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {	//finally句に記述し、Connectionが接続されているか（nullでないか）の判定を行うよう記述
            try {
                if (connection != null) {
                    // データベースを切断
                	// SQL文がデータベース常に滞留し処理が進まなくなり、エラーになることがあるため、切断する
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}